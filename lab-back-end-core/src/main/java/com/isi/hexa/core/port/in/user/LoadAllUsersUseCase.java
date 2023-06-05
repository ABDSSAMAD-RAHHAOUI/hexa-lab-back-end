package com.isi.hexa.core.port.in.user;

import com.isi.hexa.core.models.User;

import java.util.List;


public interface LoadAllUsersUseCase {

    List<User> getAllUsers();

}
