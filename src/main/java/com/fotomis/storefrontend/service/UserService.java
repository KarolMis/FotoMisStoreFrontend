package com.fotomis.storefrontend.service;

import com.fotomis.storefrontend.domain.User;
import com.fotomis.storefrontend.security.PasswordResetToken;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);



}
