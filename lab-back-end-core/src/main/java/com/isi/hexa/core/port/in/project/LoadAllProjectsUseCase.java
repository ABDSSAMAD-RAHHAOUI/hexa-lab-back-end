package com.isi.hexa.core.port.in.project;

import com.isi.hexa.core.models.Project;
import com.isi.hexa.core.models.User;

import java.util.List;


public interface LoadAllProjectsUseCase {

    List<Project> getAllProjects();

}
