package com.fotomis.storefrontend.service;

import com.fotomis.storefrontend.domain.User;
import com.fotomis.storefrontend.security.PasswordResetToken;
import com.fotomis.storefrontend.security.UserRole;

import javax.jws.soap.SOAPBinding;
import java.util.Set;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);

    User findByUsername(String username);

    User findByEmail(String email);

    User createUser(User user, Set<UserRole> userRoles)throws Exception;

    User save(User user);



}
