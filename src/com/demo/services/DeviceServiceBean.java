package com.demo.services;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import org.jboss.ejb3.annotation.SecurityDomain;

import com.demo.model.DeviceEntity;

@Stateless
@SecurityDomain("exampleDbSD")  
@RolesAllowed({"Admin","User"})
public class DeviceServiceBean {

	@Resource
	private SessionContext ctx;

	public List<DeviceEntity> getDevices() {
		String principal = ctx.getCallerPrincipal().getName();
		
		// We are getting the admin username. We can now retrieve its roles from the database.
		System.out.println("principal: " + principal);

		boolean isAdmin = ctx.isCallerInRole("Admin");
		System.out.println("isAdmin:" + isAdmin);
		boolean isUser = ctx.isCallerInRole("User");
		System.out.println("isUser:" + isUser);
		
		String securityInfo = getSecurityInfo();
		System.out.println("SecurityInfo:" + securityInfo);

		DeviceEntity device1 = new DeviceEntity("A111", "127.0.1.1", "beretta", "123");
		DeviceEntity device2 = new DeviceEntity("A222", "127.0.1.4", "glock", "124");
		DeviceEntity device3 = new DeviceEntity("A333", "127.0.1.3", "ruger", "125");
		return Arrays.asList(device1, device2, device3);
	}

	/**
	 * Secured EJB method using security annotations
	 */
	public String getSecurityInfo() {
		// Session context injected using the resource annotation
		Map<String, Object> data = ctx.getContextData();
		Principal principal = ctx.getCallerPrincipal();
		return principal.toString();
	}
}
