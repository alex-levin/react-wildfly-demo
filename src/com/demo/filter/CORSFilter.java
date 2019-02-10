package com.demo.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 * Enables CORS needed for development only.
 */

/**
 *  Test:
	
	curl -I http://localhost:8080/react-wildfly-demo/api/device/devicelist
	HTTP/1.1 200 OK
	Connection: keep-alive
	Access-Control-Allow-Origin: *
	Access-Control-Allow-Headers: origin, content-type, accept, authorization
	Access-Control-Allow-Credentials: true
	Content-Type: application/json
	Content-Length: 159
	Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS, HEAD
	Date: Sun, 10 Feb 2019 15:37:01 GMT
	
	Chrome console (if CORS is not enabled):
	Access to XMLHttpRequest at 'http://localhost:8080/react-wildfly-demo/api/device/devicelist' from origin 'http://localhost:3000' 
	has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.
*/
@Provider
public class CORSFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext request,
            ContainerResponseContext response) throws IOException {
        response.getHeaders().add("Access-Control-Allow-Origin", "*");
        response.getHeaders().add("Access-Control-Allow-Headers",
                "origin, content-type, accept, authorization");
        response.getHeaders().add("Access-Control-Allow-Credentials", "true");
        response.getHeaders().add("Access-Control-Allow-Methods",
                "GET, POST, PUT, DELETE, OPTIONS, HEAD");
    }
}