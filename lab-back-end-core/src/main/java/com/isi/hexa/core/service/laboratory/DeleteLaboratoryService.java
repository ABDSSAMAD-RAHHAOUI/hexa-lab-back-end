package com.isi.hexa.core.service.laboratory;

import com.isi.hexa.core.models.Laboratory;
import com.isi.hexa.core.port.in.laboratory.DeleteLaboratoryUseCase;
import com.isi.hexa.core.port.out.LaboratoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteLaboratoryService implements DeleteLaboratoryUseCase {
    private LaboratoryRepository laboratoryRepository;


    @Autowired
    public DeleteLaboratoryService(LaboratoryRepository laboratoryRepository) {
        this.laboratoryRepository = laboratoryRepository;
    }


    @Override
    public void delete(Laboratory obj) {
        laboratoryRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        laboratoryRepository.deleteById(id);
    }
}
