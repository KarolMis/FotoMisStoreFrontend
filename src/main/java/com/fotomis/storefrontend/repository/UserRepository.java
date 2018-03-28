package com.fotomis.storefrontend.repository;

import com.fotomis.storefrontend.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);

    User findByEmail(String email);
}
