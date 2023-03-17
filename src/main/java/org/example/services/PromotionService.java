package org.example.services;

import org.example.entities.Promotions;
import org.example.entities.User;

public interface PromotionService {
    public void add(User user, Promotions promotions);
    public void delete(User user, Promotions promotions);
    public void update(User user, Promotions promotions);
}
