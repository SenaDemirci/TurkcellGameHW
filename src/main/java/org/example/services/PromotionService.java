package org.example.services;

import org.example.entities.Promotions;

public interface PromotionService {

    public void add(Promotions promotions);
    public void delete(Promotions promotions);
    public void update(Promotions promotions);
}
