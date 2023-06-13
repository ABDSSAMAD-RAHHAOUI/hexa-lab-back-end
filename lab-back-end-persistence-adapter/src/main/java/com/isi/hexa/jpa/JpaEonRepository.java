package com.isi.hexa.jpa;

import com.isi.hexa.core.models.Endowment;
import com.isi.hexa.core.models.Eon;
import com.isi.hexa.core.port.out.EndowmentRepository;
import com.isi.hexa.core.port.out.EonRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEonRepository extends JpaRepository<Eon,Long>, EonRepository {

}
