package edu.java.operations;

import edu.java.domain.classes.Guardian;
import edu.java.domain.classes.Hero;
import edu.java.domain.classes.Nobel;
import edu.java.domain.classes.Pirate;

public class LevelUpImpl implements LevelUp{
    public void lvlUp(Hero hero) {
        if(hero.getClass().equals(Pirate.class)) {
            System.out.println("ARRAR");
        }

        if(hero.getClass().equals(Nobel.class)) {
            System.out.println("MMMM");
        }


        if(hero.getClass().equals(Guardian.class)) {
            System.out.println("....");
        }
    }
}
