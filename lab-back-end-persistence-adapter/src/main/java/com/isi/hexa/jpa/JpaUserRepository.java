package com.isi.hexa.jpa;

import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.out.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaUserRepository extends JpaRepository<User, Long> ,UserRepository {
    User findByEmail(String email);
}
