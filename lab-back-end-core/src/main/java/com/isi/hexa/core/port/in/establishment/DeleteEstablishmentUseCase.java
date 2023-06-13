package com.isi.hexa.core.port.in.establishment;

import com.isi.hexa.core.models.Establishment;


public interface DeleteEstablishmentUseCase {
    void delete(Establishment obj);
    void deleteById(Long id);
}
