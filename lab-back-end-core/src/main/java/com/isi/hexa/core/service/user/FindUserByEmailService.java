package com.isi.hexa.core.service.user;

import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.user.FindUserByEmailUseCase;
import com.isi.hexa.core.port.out.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindUserByEmailService implements FindUserByEmailUseCase {

    private UserRepository userRepository;

    @Autowired
    public FindUserByEmailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }




    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
