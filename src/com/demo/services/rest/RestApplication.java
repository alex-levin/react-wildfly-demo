package com.demo.services.rest;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.jboss.resteasy.plugins.interceptors.CorsFilter;

/**
 * Keep it empty for full-scanning
 */
@ApplicationPath("/api")
public class RestApplication extends Application {
//	private Set<Object> singletons = new HashSet<Object>();
//	
//	public RestApplication() {
//    	// http://docs.jboss.org/resteasy/docs/3.6.2.Final/userguide/html_single/#d4e1873
//    	// Javadoc for CorsFilter: http://docs.jboss.org/resteasy/docs/3.6.2.Final/javadocs/
//        CorsFilter corsFilter = new CorsFilter();
//        corsFilter.getAllowedOrigins().add("*");
//        corsFilter.setAllowedMethods("OPTIONS, GET, POST, DELETE, PUT, PATCH");
//        singletons.add(corsFilter);
//        
////        singletons.add(new DeviceService());
////        singletons.add(new MovieCrudService());
//	}
//	
//    @Override
//    public Set<Object> getSingletons() {
//        return singletons;
//    }
//
////    @Override
////    public Set<Class<?>> getClasses() {
////        return super.getClasses();
////    }
////    
//	@Override
//	public Set<Class<?>> getClasses() {
//		HashSet<Class<?>> set = new HashSet<Class<?>>();
//		set.add(DeviceService.class);
//		return set;
//	}
////
////    @Override
////    public Map<String, Object> getProperties() {
////        return super.getProperties();
////    }
}
