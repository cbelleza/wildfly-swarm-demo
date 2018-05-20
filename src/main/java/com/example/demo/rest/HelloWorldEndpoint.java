package com.example.demo.rest;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
@ApplicationScoped
public class HelloWorldEndpoint {

    @PostConstruct
    public void init() {
        System.out.println(1);
    }

    @GET
    @Produces("text/plain")
    public Response doGet() throws UnknownHostException {
        System.out.println(1);
        return Response.ok(Inet4Address.getLocalHost().getHostName()).build();
    }
}