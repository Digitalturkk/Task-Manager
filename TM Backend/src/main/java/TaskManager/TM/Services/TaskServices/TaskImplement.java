package TaskManager.TM.Services.TaskServices;

import TaskManager.TM.Models.Task;
import TaskManager.TM.Repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskImplement implements TaskService {

    @Autowired
    private TaskRepo taskRepo;

    @Override
    public void addTask(Task task) {
        taskRepo.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }

    @Override
    public List<Task> getTasks() {
        return taskRepo.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepo.findById(id).orElse(null);
    }
}
