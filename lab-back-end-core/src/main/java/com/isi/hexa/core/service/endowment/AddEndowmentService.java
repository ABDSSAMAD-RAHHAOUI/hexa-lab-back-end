package com.isi.hexa.core.service.endowment;


import com.isi.hexa.core.models.Endowment;
import com.isi.hexa.core.port.in.endowment.RegisterEndowmentUseCase;
import com.isi.hexa.core.port.out.EndowmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddEndowmentService implements RegisterEndowmentUseCase {

    private EndowmentRepository endowmentRepository;


    @Autowired
    public AddEndowmentService(EndowmentRepository endowmentRepository) {
        this.endowmentRepository = endowmentRepository;
    }

    @Override
    public Endowment save(Endowment e) {
        return endowmentRepository.save(e);
    }

}

