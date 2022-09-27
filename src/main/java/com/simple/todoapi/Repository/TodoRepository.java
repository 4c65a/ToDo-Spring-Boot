package com.simple.todoapi.Repository;

import com.simple.todoapi.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
