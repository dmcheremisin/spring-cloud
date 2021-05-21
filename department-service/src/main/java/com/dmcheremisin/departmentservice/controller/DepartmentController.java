package com.dmcheremisin.departmentservice.controller;

import com.dmcheremisin.departmentservice.entity.Department;
import com.dmcheremisin.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Saving department");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable Long id) {
        return departmentService.findDepartmentById(id);
    }
}
