package com.qibill.service;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qibill.pojo.Person;

@Produces({ MediaType.APPLICATION_JSON })
public interface PersonService {

    @POST
    @Path("/person/{name}")
    public Person getPerson(@PathParam("name") String name);

    @POST
    @Path("/persons")
    public List<Person> getPersons();
}
