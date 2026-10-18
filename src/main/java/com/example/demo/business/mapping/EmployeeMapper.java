package com.example.demo.business.mapping;

import com.example.demo.persistence.entity.EmployeeEntity;
import com.example.demo.rest.model.EmployeeDTO;

public class EmployeeMapper {

    public static EmployeeDTO toDTO(EmployeeEntity entity) {
        return new EmployeeDTO(entity.getId(), entity.getFirstname(),
                entity.getLastname(), entity.getEmail());
    }

    public static EmployeeEntity toEntity(EmployeeDTO dto) {
        return EmployeeEntity.builder()
                .id(dto.id())
                .firstname(dto.firstname())
                .lastname(dto.lastname())
                .email(dto.email())
                .build();
    }
}
