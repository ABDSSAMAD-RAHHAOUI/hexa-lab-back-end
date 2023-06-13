package com.isi.hexa.core.service.eon;

import com.isi.hexa.core.models.Eon;
import com.isi.hexa.core.port.in.eon.LoadAllEonsUseCase;
import com.isi.hexa.core.port.out.EonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadAllEonsService implements LoadAllEonsUseCase {

    private EonRepository eonRepository;


    @Autowired
    public LoadAllEonsService(EonRepository eonRepository) {
        this.eonRepository = eonRepository;
    }


    @Override
    public List<Eon> getAllEons() {
        return eonRepository.findAll();
    }
}
