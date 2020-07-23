package edu.java.domain.items.health;

import edu.java.domain.classes.Hero;
import edu.java.domain.items.ItemStatus;

public class BigHealthPotion extends HealthPotion{
    public BigHealthPotion() {
        setItemId(3);
        setItemName("Big Health Potion");
        setItemLevel(7);
        setItemStatus(ItemStatus.SPENDING);
        setHealAmount(75);
    }



    @Override
    public void heal(Hero hero) {
        Integer health = hero.getHealth();
        hero.setHealth(health + getHealAmount());
    }
}
