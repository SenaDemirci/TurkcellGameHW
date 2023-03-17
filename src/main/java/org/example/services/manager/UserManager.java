package org.example.services.manager;

import org.example.entities.User;
import org.example.services.UserService;

public class UserManager implements UserService {

    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "added");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "deleted");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "updated");
    }
}
