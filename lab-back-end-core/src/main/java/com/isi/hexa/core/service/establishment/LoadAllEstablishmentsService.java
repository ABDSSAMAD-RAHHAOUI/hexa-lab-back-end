package com.isi.hexa.core.service.establishment;

import com.isi.hexa.core.models.Establishment;
import com.isi.hexa.core.port.in.establishment.LoadAllEstablishmentsUseCase;
import com.isi.hexa.core.port.out.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadAllEstablishmentsService implements LoadAllEstablishmentsUseCase {

    private EstablishmentRepository establishmentRepository;


    @Autowired
    public LoadAllEstablishmentsService(EstablishmentRepository establishmentRepository) {
        this.establishmentRepository = establishmentRepository;
    }


    @Override
    public List<Establishment> getAllEstablishments() {
        return establishmentRepository.findAll();
    }
}
