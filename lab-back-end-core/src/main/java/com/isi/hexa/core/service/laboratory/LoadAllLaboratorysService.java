package com.isi.hexa.core.service.laboratory;

import com.isi.hexa.core.models.Laboratory;
import com.isi.hexa.core.port.in.laboratory.LoadAllLaboratorysUseCase;
import com.isi.hexa.core.port.out.LaboratoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadAllLaboratorysService implements LoadAllLaboratorysUseCase {

    private LaboratoryRepository laboratoryRepository;


    @Autowired
    public LoadAllLaboratorysService(LaboratoryRepository laboratoryRepository) {
        this.laboratoryRepository = laboratoryRepository;
    }


    @Override
    public List<Laboratory> getAllLaboratorys() {
        return laboratoryRepository.findAll();
    }
}
