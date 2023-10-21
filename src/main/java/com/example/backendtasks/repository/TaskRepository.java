package com.example.backendtasks.repository;


import com.example.backendtasks.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<Task, Long>{

}
