package org.example.services.manager;

import org.example.entities.Promotions;
import org.example.entities.User;
import org.example.services.PromotionService;

public class PromotionManager implements PromotionService {

    public void add(User user, Promotions promotions){
        System.out.println(promotions.getPromotionDescription() + " promotion has been assigned to " + user.getFirstName());
    }

    public void delete(User user, Promotions promotions){
        System.out.println(user.getFirstName() + "'s " + promotions.getPromotionDescription() + " promotion has been deleted");
    }

    @Override
    public void update(User user, Promotions promotions) {
        System.out.println(user.getFirstName() + "'s " + promotions.getPromotionDescription() + " promotion has been updated");
    }
}
