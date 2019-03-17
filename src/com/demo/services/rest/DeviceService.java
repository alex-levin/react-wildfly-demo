package com.demo.services.rest;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.model.DeviceEntity;
import com.demo.services.DeviceServiceBean;

// http://docs.jboss.org/resteasy/docs/3.6.2.Final/userguide/html_single/#RESTEasy_EJB_Integration
@Stateless
@Path("/device")
public class DeviceService {
	
	@Resource 
	private SessionContext ctx;
	
	@EJB
	private DeviceServiceBean deviceService;
	
	@PostConstruct
	public void init() {
		
	}

	/**
		Test
		adapterId is not returned
		
		C:\Users\alxle>curl http://localhost:8080/react-wildfly-demo/api/device/devicelist
			[{"esn":"A111","address":"127.0.1.1","type":"beretta"},{"esn":"A222","address":"127.0.1.4","type":"glock"},
			{"esn":"A333","address":"127.0.1.3","type":"ruger"}]
	 */
	@GET
	@Path("/devicelist")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DeviceEntity> getDevices() {
		List<DeviceEntity> devices = deviceService.getDevices();
		
		return devices;
	}
}
