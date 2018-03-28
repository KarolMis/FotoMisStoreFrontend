package com.fotomis.storefrontend.service;

import com.fotomis.storefrontend.domain.User;
import com.fotomis.storefrontend.repository.PasswordResetTokenRepository;
import com.fotomis.storefrontend.security.PasswordResetToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fotomis.storefrontend.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordResetTokenRepository passwordResetTokenRepository;

    @Override
    public PasswordResetToken getPasswordResetToken(final String token) {
        return passwordResetTokenRepository.findByToken(token);
    }

    @Override
    public void createPasswordResetTokenForUser(final User user, final String token){
        final PasswordResetToken myToken = new PasswordResetToken(token, user);
        passwordResetTokenRepository.save(myToken);
    }

}
