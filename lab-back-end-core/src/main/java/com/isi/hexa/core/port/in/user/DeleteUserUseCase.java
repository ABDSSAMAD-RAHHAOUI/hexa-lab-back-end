package com.isi.hexa.core.port.in.user;

import com.isi.hexa.core.models.User;


public interface DeleteUserUseCase {
    void delete(User obj);
    void deleteById(Long id);
}
