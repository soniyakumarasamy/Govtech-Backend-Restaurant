package com.miniproject.govtech.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.govtech.modal.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
