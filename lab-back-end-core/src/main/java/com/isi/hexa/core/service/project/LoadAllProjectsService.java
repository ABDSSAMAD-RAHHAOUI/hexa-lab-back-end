package com.isi.hexa.core.service.project;

import com.isi.hexa.core.models.Project;
import com.isi.hexa.core.port.in.project.LoadAllProjectsUseCase;
import com.isi.hexa.core.port.out.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadAllProjectsService implements LoadAllProjectsUseCase {

    private ProjectRepository projectRepository;


    @Autowired
    public LoadAllProjectsService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}
