package com.isi.hexa.core.service.user;



import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.user.LoadAllUsersUseCase;
import com.isi.hexa.core.port.out.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadAllUsersService implements LoadAllUsersUseCase {


    private UserRepository userRepository;

    @Autowired
    public LoadAllUsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
