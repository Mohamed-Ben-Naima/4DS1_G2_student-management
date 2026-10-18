package com.esprim.student.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.esprim.student.repository.DepartmentRepository;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceTest {

    @Mock
    private DepartmentRepository departmentRepository;

    @InjectMocks
    private DepartmentService departmentService;

    @Test
    void countDepartmentsReturnsRepositoryCount() {
        when(departmentRepository.count()).thenReturn(3L);

        assertThat(departmentService.countDepartments()).isEqualTo(3L);
    }
}
