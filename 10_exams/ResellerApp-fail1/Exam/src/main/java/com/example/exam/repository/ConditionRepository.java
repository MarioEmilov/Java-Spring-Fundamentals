package com.example.exam.repository;

import com.example.exam.model.entity.Condition;
import com.example.exam.model.entity.ConditionNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long> {

    Optional<Condition> findAllByName(ConditionNameEnum name);
}
