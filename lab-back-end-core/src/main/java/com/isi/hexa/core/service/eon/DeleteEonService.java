package com.isi.hexa.core.service.eon;

import com.isi.hexa.core.models.Eon;
import com.isi.hexa.core.port.in.eon.DeleteEonUseCase;
import com.isi.hexa.core.port.out.EonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEonService implements DeleteEonUseCase {
    private EonRepository eonRepository;


    @Autowired
    public DeleteEonService(EonRepository eonRepository) {
        this.eonRepository = eonRepository;
    }


    @Override
    public void delete(Eon obj) {
        eonRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        eonRepository.deleteById(id);
    }
}
