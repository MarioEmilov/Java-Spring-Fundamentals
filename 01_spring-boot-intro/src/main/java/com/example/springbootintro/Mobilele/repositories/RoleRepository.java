package com.example.springbootintro.Mobilele.repositories;

import com.example.springbootintro.Mobilele.domain.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}
