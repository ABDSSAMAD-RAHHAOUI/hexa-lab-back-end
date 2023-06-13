package com.isi.hexa.core.service.establishment;


import com.isi.hexa.core.models.Establishment;
import com.isi.hexa.core.port.in.establishment.RegisterEstablishmentUseCase;
import com.isi.hexa.core.port.out.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddEstablishmentService implements RegisterEstablishmentUseCase {

    private EstablishmentRepository establishmentRepository;


    @Autowired
    public AddEstablishmentService(EstablishmentRepository establishmentRepository) {
        this.establishmentRepository = establishmentRepository;
    }

    @Override
    public Establishment save(Establishment e) {
        return establishmentRepository.save(e);
    }

}

