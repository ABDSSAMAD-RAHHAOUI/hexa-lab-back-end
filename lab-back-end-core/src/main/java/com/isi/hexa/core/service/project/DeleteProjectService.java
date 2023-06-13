package com.isi.hexa.core.service.project;

import com.isi.hexa.core.models.Project;
import com.isi.hexa.core.port.in.project.DeleteProjectUseCase;
import com.isi.hexa.core.port.out.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteProjectService implements DeleteProjectUseCase {
    private ProjectRepository projectRepository;


    @Autowired
    public DeleteProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    @Override
    public void delete(Project obj) {
        projectRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }
}
