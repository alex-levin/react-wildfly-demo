package com.demo.services.rest;

import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.model.DeviceEntity;

// http://docs.jboss.org/resteasy/docs/3.6.2.Final/userguide/html_single/#RESTEasy_EJB_Integration
@Stateless
@Path("/device")
public class DeviceService {

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
		DeviceEntity device1 = new DeviceEntity("A111", "127.0.1.1", "beretta", "123");
		DeviceEntity device2 = new DeviceEntity("A222", "127.0.1.4", "glock", "124");
		DeviceEntity device3 = new DeviceEntity("A333", "127.0.1.3", "ruger", "125");
		return Arrays.asList(device1, device2, device3);
	}
}
