package com.isi.hexa.core.port.in.eon;

import com.isi.hexa.core.models.Eon;


public interface DeleteEonUseCase {
    void delete(Eon obj);
    void deleteById(Long id);
}
