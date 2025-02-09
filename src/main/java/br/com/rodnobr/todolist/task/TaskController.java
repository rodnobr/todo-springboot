package br.com.rodnobr.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository taskRpository;
    @PostMapping("/")
    public TaskModel create(@RequestBody TaskModel taskModel) {
        var task = this.taskRpository.save(taskModel);
        return task;
    }
}
