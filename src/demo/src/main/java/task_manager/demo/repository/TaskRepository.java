package task_manager.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import task_manager.demo.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
  //
}
