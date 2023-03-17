package org.example;

import org.example.core.utils.EDevlet;
import org.example.entities.Games;
import org.example.entities.Promotions;
import org.example.entities.User;
import org.example.services.manager.GamesManager;
import org.example.services.manager.UserManager;

public class Main {
    public static void main(String[] args) {
        EDevlet mernis = new EDevlet();

        User user1 = new User();

        user1.setId(1);
        user1.setFirstName("mert");
        user1.setLastName("kayatay");
        user1.setBirthDate("1999.09.29");
        user1.setNationalityId("01234567890");

        UserManager userManager = new UserManager();
        userManager.add(user1);
        System.out.println(user1.getFirstName() + user1.getLastName() + " Validating...");

        boolean isValid = mernis.validation(user1.getFirstName(), user1.getLastName(), user1.getBirthDate(), user1.getNationalityId());
        if(isValid){
            System.out.println("User validated");
        }else{
            System.out.println("User cannot validated");
        }

        Promotions promotions = new Promotions();
        promotions.setPromotionDescription("Black Friday");
        promotions.setId(1);
        promotions.setDiscountRate(30.0);

        Games games = new Games();
        GamesManager gamesManager = new GamesManager();
        games.setPrice(1);
        games.setName("CSGO");
        games.setPrice(60);
        gamesManager.add(games);
        gamesManager.sell(games, user1, promotions);









    }
}