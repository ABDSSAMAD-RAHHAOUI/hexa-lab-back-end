package com.isi.hexa.core.service.user;

import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.user.RegisterUserUseCase;
import com.isi.hexa.core.port.out.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddUserService implements RegisterUserUseCase {
    private UserRepository userRepository;

    @Autowired
    public AddUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User save(User u) {
        return userRepository.save(u);
    }
}
