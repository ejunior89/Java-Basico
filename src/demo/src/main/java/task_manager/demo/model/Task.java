package task_manager.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  @Size(min = 10, max = 200)
  private String description;

  @Enumerated(EnumType.STRING)
  @NotNull(message = "Status é obrigatório")
  private TaskStatus status;

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public TaskStatus getStatus() {
    return status;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setStatus(TaskStatus status) {
    this.status = status;
  }
}
