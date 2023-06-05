package com.isi.hexa.core.port.in.user;


import com.isi.hexa.core.models.User;

public interface RegisterUserUseCase {
    User save(User u);
}
