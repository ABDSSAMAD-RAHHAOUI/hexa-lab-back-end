package com.isi.hexa.core.port.in.endowment;

import com.isi.hexa.core.models.Endowment;


public interface DeleteEndowmentUseCase {
    void delete(Endowment obj);
    void deleteById(Long id);
}
