package com.dmcheremisin.userservice.controller;

import com.dmcheremisin.userservice.VO.ResponseTemplateVO;
import com.dmcheremisin.userservice.entity.User;
import com.dmcheremisin.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        log.info("Inside User Controller");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable Long id) {
        return userService.getUserWithDepartment(id);
    }


}
