package com.example.demo.service;

import com.example.demo.dto.DemoDto;
import com.example.demo.repository.DemoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DemoService {
    private DemoRepository repository;

    public List<DemoDto> findByValue(String value) {
        return repository.findByValue(value);
    }
}
