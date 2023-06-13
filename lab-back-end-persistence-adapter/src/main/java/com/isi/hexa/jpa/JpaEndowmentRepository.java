package com.isi.hexa.jpa;

import com.isi.hexa.core.models.Endowment;
import com.isi.hexa.core.port.out.EndowmentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaEndowmentRepository extends JpaRepository<Endowment,Long>,EndowmentRepository {

}
