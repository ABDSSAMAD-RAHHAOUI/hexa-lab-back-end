package com.isi.hexa.core.service.eon;


import com.isi.hexa.core.models.Eon;
import com.isi.hexa.core.port.in.eon.RegisterEonUseCase;
import com.isi.hexa.core.port.out.EonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddEonService implements RegisterEonUseCase {

    private EonRepository eonRepository;


    @Autowired
    public AddEonService(EonRepository eonRepository) {
        this.eonRepository = eonRepository;
    }

    @Override
    public Eon save(Eon e) {
        return eonRepository.save(e);
    }

}

