package com.isi.hexa.jpa;

import com.isi.hexa.core.models.Laboratory;
import com.isi.hexa.core.models.Project;
import com.isi.hexa.core.port.out.LaboratoryRepository;
import com.isi.hexa.core.port.out.ProjectRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaProjectRepository extends JpaRepository<Project, Long> , ProjectRepository {
}
