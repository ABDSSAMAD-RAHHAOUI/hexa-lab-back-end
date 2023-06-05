package com.isi.hexa.core.port.out;


import com.isi.hexa.core.models.User;

public interface UserRepository extends BaseRepository<User,Long> {

    User findByEmail(String email);

}
