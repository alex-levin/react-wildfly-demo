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

}
