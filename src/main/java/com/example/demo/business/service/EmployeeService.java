package com.example.demo.business.service;

import com.example.demo.business.mapping.EmployeeMapper;
import com.example.demo.persistence.entity.EmployeeEntity;
import com.example.demo.persistence.repository.EmployeeRepository;
import com.example.demo.rest.model.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeDTO> result = new ArrayList<>();
        for (EmployeeEntity entity : employeeRepository.findAll()) {
            result.add(EmployeeMapper.toDTO(entity));
        }
        return result;
    }

    public EmployeeDTO addEmployee(EmployeeDTO dto) {
        EmployeeEntity entity = EmployeeMapper.toEntity(dto);
        EmployeeEntity saved = employeeRepository.save(entity);
        return EmployeeMapper.toDTO(saved);
    }
}
