package com.harisraza.exceptions.handles;

import com.harisraza.exceptions.ResourceNotFound;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ResourceNotFoundHandle implements ExceptionMapper<ResourceNotFound> {

    /*
     * you can customize the response.
     */
    @Override
    public Response toResponse(ResourceNotFound exception) {
       return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Sorry, something went wrong").build();
    }
    
}
