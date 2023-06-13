package com.isi.hexa.core.port.in.laboratory;

import com.isi.hexa.core.models.Laboratory;


public interface DeleteLaboratoryUseCase {
    void delete(Laboratory obj);
    void deleteById(Long id);
}
