package com.dev.security;

import com.dev.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
