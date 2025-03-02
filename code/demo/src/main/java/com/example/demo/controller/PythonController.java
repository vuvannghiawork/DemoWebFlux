package com.example.demo.controller;

import com.example.demo.dto.PythonResponse;
import com.example.demo.service.PythonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class PythonController {
    private final PythonService pythonService;

    @Autowired
    public PythonController(PythonService pythonService) {
        this.pythonService = pythonService;
    }

    @GetMapping("/python")
    public Flux<PythonResponse> getMultipleHello() {
        return pythonService.getMultipleHello();
    }
}
