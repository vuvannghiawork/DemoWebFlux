package com.example.demo.dto;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PythonResponse {

    private boolean success;
    private String message;
    private Object data;

    public PythonResponse() {
    }

    public PythonResponse(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
}
