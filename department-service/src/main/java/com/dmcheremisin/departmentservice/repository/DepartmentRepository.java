package com.dmcheremisin.departmentservice.repository;

import com.dmcheremisin.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
