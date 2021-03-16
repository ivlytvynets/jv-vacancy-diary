package com.dev.service;

import com.dev.model.User;

public interface UserService {
    User add(User user);

    User findByEmail(String email);

    User get(Long id);

    User update(User user);

    void delete(User user);
}
