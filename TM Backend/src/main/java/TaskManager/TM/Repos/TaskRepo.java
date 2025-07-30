package TaskManager.TM.Repos;

import TaskManager.TM.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {
    Task findByTitle(String title);
}
