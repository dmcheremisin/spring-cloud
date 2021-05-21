package com.dmcheremisin.departmentservice.service;

import com.dmcheremisin.departmentservice.entity.Department;
import com.dmcheremisin.departmentservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Transactional
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).orElseThrow(() -> new RuntimeException("Not found"));
    }
}
