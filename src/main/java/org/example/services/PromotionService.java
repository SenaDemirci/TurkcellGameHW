package org.example.services;

import org.example.entities.Games;
import org.example.entities.Promotions;
import org.example.entities.User;

public interface PromotionService {
    public void add(Games games, Promotions promotions);
    public void delete(Games games, Promotions promotions);
    public void update(Games games, Promotions promotions);
}
