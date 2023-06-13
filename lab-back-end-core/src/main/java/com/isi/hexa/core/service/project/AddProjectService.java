package com.isi.hexa.core.service.project;


import com.isi.hexa.core.models.Project;
import com.isi.hexa.core.port.in.project.RegisterProjectUseCase;
import com.isi.hexa.core.port.out.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddProjectService implements RegisterProjectUseCase {

    private ProjectRepository projectRepository;


    @Autowired
    public AddProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project e) {
        return projectRepository.save(e);
    }

}

