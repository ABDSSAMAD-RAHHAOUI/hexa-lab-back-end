package com.isi.hexa.core.service.endowment;

import com.isi.hexa.core.models.Endowment;
import com.isi.hexa.core.port.in.endowment.DeleteEndowmentUseCase;
import com.isi.hexa.core.port.out.EndowmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEndowmentService implements DeleteEndowmentUseCase {
    private EndowmentRepository endowmentRepository;


    @Autowired
    public DeleteEndowmentService(EndowmentRepository endowmentRepository) {
        this.endowmentRepository = endowmentRepository;
    }


    @Override
    public void delete(Endowment obj) {
        endowmentRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        endowmentRepository.deleteById(id);
    }
}
