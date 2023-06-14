package isi.hexa.api.rest.controllers;

import com.isi.hexa.core.models.Project;
import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.project.DeleteProjectUseCase;
import com.isi.hexa.core.port.in.project.LoadAllProjectsUseCase;
import com.isi.hexa.core.port.in.project.RegisterProjectUseCase;
import com.isi.hexa.core.port.in.user.LoadAllUsersUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/project")

public class ProjectController {

    private LoadAllProjectsUseCase loadAllProjectsUseCase;
    private RegisterProjectUseCase registerProjectUseCase;
    private DeleteProjectUseCase deleteProjectUseCase;


    @Autowired
    public ProjectController(LoadAllProjectsUseCase loadAllProjectsUseCase, DeleteProjectUseCase deleteProjectUseCase,RegisterProjectUseCase registerProjectUseCase) {
        this.loadAllProjectsUseCase = loadAllProjectsUseCase;
        this.deleteProjectUseCase = deleteProjectUseCase;
        this.registerProjectUseCase = registerProjectUseCase;
    }

    @GetMapping("/")
    public List<Project> getAllUsers(){
        return loadAllProjectsUseCase.getAllProjects();
    }

    @PostMapping("/addproject")
    public Project addProject(@RequestBody Project project){
        return registerProjectUseCase.save(project);
    }

    @DeleteMapping("/{id}")
    public void deleteProjectById(@PathVariable(name = "id") Long id) {
        deleteProjectUseCase.deleteById(id);
    }


}
