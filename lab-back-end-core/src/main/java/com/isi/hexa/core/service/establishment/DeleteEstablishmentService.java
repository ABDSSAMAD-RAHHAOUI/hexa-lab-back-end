package com.isi.hexa.core.service.establishment;

import com.isi.hexa.core.models.Establishment;
import com.isi.hexa.core.port.in.establishment.DeleteEstablishmentUseCase;
import com.isi.hexa.core.port.out.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEstablishmentService implements DeleteEstablishmentUseCase {
    private EstablishmentRepository establishmentRepository;


    @Autowired
    public DeleteEstablishmentService(EstablishmentRepository establishmentRepository) {
        this.establishmentRepository = establishmentRepository;
    }


    @Override
    public void delete(Establishment obj) {
        establishmentRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        establishmentRepository.deleteById(id);
    }
}
