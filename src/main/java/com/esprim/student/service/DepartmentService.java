package com.esprim.student.service;

import org.springframework.stereotype.Service;

import com.esprim.student.repository.DepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public long countDepartments() {
        return departmentRepository.count();
    }
}
