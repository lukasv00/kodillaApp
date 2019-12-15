package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vq/task")
public class TaskController {

    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public List<TaskDto> getTasks(){
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTaskDto")
    public TaskDto getTask(Long taskId){
        return new TaskDto(1L, "test title" , "test content");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTask")
    public void deleteTask(Long taskId){
    }

    @RequestMapping(method = RequestMethod.POST, value = "upgradeTask")
    public TaskDto upgradeTask(TaskDto task){
        return new TaskDto(1L, "edited test title", "test content");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "createTask")
    public void createTask(TaskDto task){
    }
}
