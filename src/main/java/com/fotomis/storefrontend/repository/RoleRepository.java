package com.fotomis.storefrontend.repository;

import com.fotomis.storefrontend.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
