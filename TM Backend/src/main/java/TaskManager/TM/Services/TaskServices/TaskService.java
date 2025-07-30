package TaskManager.TM.Services.TaskServices;

import TaskManager.TM.Models.Task;

import java.util.List;

public interface TaskService {
    void addTask(Task task);
    void deleteTask(Long id);
    List<Task> getTasks();
    Task getTaskById(Long id);
}
