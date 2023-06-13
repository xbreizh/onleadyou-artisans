package com.onleadyou.artisans.api.service.impl;

import com.onleadyou.artisans.api.service.contract.SessionService;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;
import java.util.Base64;

@Service
public class SessionServiceImpl implements SessionService {
    @Override
    public boolean validateAuthentication(final String token) {
        final String encodedPassword = Base64.getEncoder().encodeToString("admin".getBytes());
        try {
            final String stripped_token = token.replace("Basic ", "");
            if (stripped_token.equals(encodedPassword)){
                return true;
            } else {
                throw new BadCredentialsException("Missing or Invalid token");
            }
        } catch (final Throwable e) {
            throw new BadCredentialsException("Missing or Invalid token");
        }
    }
}
