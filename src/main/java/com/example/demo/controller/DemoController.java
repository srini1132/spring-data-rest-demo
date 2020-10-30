package com.example.demo.controller;

import com.example.demo.dto.DemoDto;
import com.example.demo.service.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/demo")
@AllArgsConstructor
public class DemoController {
    private DemoService service;

    @GetMapping
    public ResponseEntity<List<DemoDto>> findByValue(@Param("value") String value) {
        return ResponseEntity.ok(service.findByValue(value));
    }
}
