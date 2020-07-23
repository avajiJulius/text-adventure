package edu.java.domain.enemies;

import edu.java.Start;
import edu.java.domain.classes.Hero;

public class CrazyFrog extends Enemy {

    public CrazyFrog() {
        setEnemyName("Crazy Frog");
        setEnemyLevel(1 + (int) (Math.random() * 3));
        setEnemyDamage(getEnemyLevel() * 3);
    }

    @Override
    public void hit() {
        Hero hero = Start.getHero();
        Integer health = hero.getHealth();
        hero.setHealth(health - getEnemyDamage());
    }
}
