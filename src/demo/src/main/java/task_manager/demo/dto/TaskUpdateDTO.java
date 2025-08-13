package task_manager.demo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import task_manager.demo.model.TaskStatus;

public class TaskUpdateDTO {

    @NotNull(message = "O título é obrigatório")
    @Size(min = 1, max = 100, message = "O título deve ter entre 1 e 100 caracteres")
    private String title;

    @Size(max = 500, message = "A descrição deve ter no máximo 500 caracteres")
    private String description;

    @NotNull(message = "O status é obrigatório")
    private TaskStatus status;

    // Getters e Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}