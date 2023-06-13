package com.isi.hexa.core.service.laboratory;


import com.isi.hexa.core.models.Laboratory;
import com.isi.hexa.core.port.in.laboratory.RegisterLaboratoryUseCase;
import com.isi.hexa.core.port.out.LaboratoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddLaboratoryService implements RegisterLaboratoryUseCase {

    private LaboratoryRepository laboratoryRepository;


    @Autowired
    public AddLaboratoryService(LaboratoryRepository laboratoryRepository) {
        this.laboratoryRepository = laboratoryRepository;
    }

    @Override
    public Laboratory save(Laboratory e) {
        return laboratoryRepository.save(e);
    }

}

