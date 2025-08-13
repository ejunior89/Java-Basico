package task_manager.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import task_manager.demo.dto.TaskUpdateDTO;
import task_manager.demo.model.Task;
import task_manager.demo.repository.TaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {

  @Autowired
  private TaskRepository taskRepository;

  @GetMapping
  public List<Task> getAllTasks() {
    return taskRepository.findAll();
  }

  @PostMapping
  public ResponseEntity<Task> createTask(@Valid @RequestBody Task task) {
    Task savedTask = taskRepository.save(task);
    return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
    if (taskRepository.existsById(id)) {
      taskRepository.deleteById(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PutMapping("/{id}")
  public ResponseEntity<Task> updateTask(@PathVariable Long id, @Valid @RequestBody TaskUpdateDTO taskDTO) {
    Optional<Task> existingTask = taskRepository.findById(id);

    if (existingTask.isPresent()) {
      Task taskToUpdate = existingTask.get();
      taskToUpdate.setTitle(taskDTO.getTitle());
      taskToUpdate.setDescription(taskDTO.getDescription());
      taskToUpdate.setStatus(taskDTO.getStatus());

      Task savedTask = taskRepository.save(taskToUpdate);
      return new ResponseEntity<>(savedTask, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("/{id}")
  public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
    Optional<Task> task = taskRepository.findById(id);
    if (task.isPresent()) {
      return new ResponseEntity<>(task.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  // Tratamento de exceções de validação
  @ExceptionHandler(jakarta.validation.ConstraintViolationException.class)
  public ResponseEntity<String> handleValidationException(jakarta.validation.ConstraintViolationException e) {
    return new ResponseEntity<>("Erro de validação: " + e.getMessage(), HttpStatus.BAD_REQUEST);
  }

  // Tratamento de exceções gerais
  @ExceptionHandler(Exception.class)
  public ResponseEntity<String> handleGeneralException(Exception e) {
    return new ResponseEntity<>("Erro interno: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
  }
}