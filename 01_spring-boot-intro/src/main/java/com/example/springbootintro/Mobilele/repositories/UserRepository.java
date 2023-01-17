package com.example.springbootintro.Mobilele.repositories;

import com.example.springbootintro.Mobilele.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
