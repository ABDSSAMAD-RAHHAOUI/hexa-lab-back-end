package com.isi.hexa.core.port.in.project;

import com.isi.hexa.core.models.Project;


public interface DeleteProjectUseCase {
    void delete(Project obj);
    void deleteById(Long id);
}
