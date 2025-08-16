package com.todolist.repository;


import com.todolist.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByTitleContainingOrDescriptionContaining(String title, String description);
    List<Task> findByStatus(String status);
}

