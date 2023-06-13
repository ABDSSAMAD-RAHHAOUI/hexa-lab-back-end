package isi.hexa.api.rest.controllers;

import com.isi.hexa.core.models.Project;
import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.project.LoadAllProjectsUseCase;
import com.isi.hexa.core.port.in.user.LoadAllUsersUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class ProjectController {

    private LoadAllProjectsUseCase loadAllProjectsUseCase;

    @Autowired
    public ProjectController(LoadAllProjectsUseCase loadAllProjectsUseCase) {
        this.loadAllProjectsUseCase = loadAllProjectsUseCase;
    }

    @GetMapping("/project")
    public List<Project> getAllUsers(){
        return loadAllProjectsUseCase.getAllProjects();
    }





}
