package com.harisraza.exceptions;

public class ResourceNotFound extends RuntimeException {

    String resourceName;
    String fieldName;

    public ResourceNotFound(String resourceName, String fieldName) {
        super(String.format("%s not found with %s", resourceName, fieldName));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
    }
    
}
