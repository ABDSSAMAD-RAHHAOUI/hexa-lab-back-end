package com.isi.hexa.core.service.endowment;

import com.isi.hexa.core.models.Endowment;
import com.isi.hexa.core.port.in.endowment.LoadAllEndowmentsUseCase;
import com.isi.hexa.core.port.out.EndowmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadAllEndowmentsService implements LoadAllEndowmentsUseCase {

    private EndowmentRepository endowmentRepository;


    @Autowired
    public LoadAllEndowmentsService(EndowmentRepository endowmentRepository) {
        this.endowmentRepository = endowmentRepository;
    }


    @Override
    public List<Endowment> getAllEndowments() {
        return endowmentRepository.findAll();
    }
}
