package com.example.demo;

 

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

 

import java.util.*;

 

import com.example.demo.model.Customer;
import com.example.demo.services.CustomerService;

 

@Path("customers")
public class CustomerResource {
    CustomerService service = new CustomerService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAllCustomers()
    {
            return service.getAllCustomer();
    
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addCustomer(Customer cust)
    {
        boolean isAdded = this.service.add(cust);
        if(isAdded)
        {
            return Response.status(201).entity(cust).build();
        }
        else { 
            throw new RuntimeException("Not added");
        }
    }
    
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomerById(@PathParam("id") int id)
    {
            return service.getCustomerById(id);
    }
    

 

}
 