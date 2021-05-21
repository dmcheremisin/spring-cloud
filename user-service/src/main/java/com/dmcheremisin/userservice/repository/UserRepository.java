package com.dmcheremisin.userservice.repository;

import com.dmcheremisin.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
