package org.example;

import org.example.core.utils.EDevlet;
import org.example.entities.Games;
import org.example.entities.Promotions;
import org.example.entities.User;
import org.example.services.manager.GamesManager;
import org.example.services.manager.PromotionManager;
import org.example.services.manager.UserManager;

public class Main {
    public static void main(String[] args) {
        EDevlet mernis = new EDevlet();

        User user1 = new User(1,"mert","kayatay","1999.09.29","01234567890");

        UserManager userManager = new UserManager();
        userManager.add(user1);
        System.out.println(user1.getFirstName() + " " + user1.getLastName() + " validating...");

        boolean isValid = mernis.validate(user1);
        if (isValid) {
            System.out.println("User validated");
        } else{
            System.out.println("User cannot validated!");
        }

        Promotions promotions = new Promotions();
        promotions.setPromotionDescription("Black Friday");
        promotions.setId(1);
        promotions.setDiscountRate(30.0);

        PromotionManager promotionManager = new PromotionManager();
        promotionManager.add(user1, promotions);

        Games games = new Games(1, "CSGO", 60);

        GamesManager gamesManager = new GamesManager();

        gamesManager.add(games);
        gamesManager.sell(games, user1, promotions);

    }
}