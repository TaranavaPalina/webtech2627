package com.example.demo.business.service;

import com.example.demo.business.mapping.EmployeeMapper;
import com.example.demo.persistence.repository.EmployeeRepository;
import com.example.demo.rest.model.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(EmployeeMapper::toDTO)
                .toList();
    }

    public EmployeeDTO addEmployee(EmployeeDTO dto) {
        return EmployeeMapper.toDTO(employeeRepository.save(EmployeeMapper.toEntity(dto)));
    }
}
