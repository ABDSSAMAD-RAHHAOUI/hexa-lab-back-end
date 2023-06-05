package com.isi.hexa.api.security.service;

import com.isi.hexa.core.models.User;
import com.isi.hexa.core.models.UserRole;
import com.isi.hexa.core.port.in.user.FindUserByEmailUseCase;
import com.isi.hexa.core.port.in.user.RegisterUserUseCase;
import lombok.AllArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private RegisterUserUseCase registerUser;
    private FindUserByEmailUseCase findByEmail;

   private PasswordEncoder passwordEncoder;

    @Override
    public User addNewUser(String username, String password, String email) {
        User user = findByEmail.findByEmail(email);
        if(user!=null) throw new RuntimeException("this user already exist");

        return registerUser.save(User.builder()
                        .username(username)
                        .email(email)
                        .password(passwordEncoder.encode(password))
                .build());
    }



    @Override
    public void deleteRoleFromUser(String username, UserRole userRole) {

    }

    @Override
    public User loadUserByEmail(String email) {
        return findByEmail.findByEmail(email);
    }




}
