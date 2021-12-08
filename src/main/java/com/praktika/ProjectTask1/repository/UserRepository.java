package com.praktika.ProjectTask1.repository;

import com.praktika.ProjectTask1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
