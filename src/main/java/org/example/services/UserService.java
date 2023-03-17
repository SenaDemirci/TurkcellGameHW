package org.example.services;

import org.example.entities.User;

public interface UserService {

    public void add(User user);
    public void delete(User user);
    public void update(User user);
}
