package com.fabriciobezerradev.clientes_api.controller.handler;

public class FieldMessage {
    private String fieldName;
    private String message;
    
    public FieldMessage(String name, String message) {
        this.fieldName = name;
        this.message = message;
    }

    public String getName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }

}
