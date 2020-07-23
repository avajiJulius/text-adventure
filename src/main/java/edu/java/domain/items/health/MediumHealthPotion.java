package edu.java.domain.items.health;

import edu.java.domain.classes.Hero;
import edu.java.domain.items.ItemStatus;

public class MediumHealthPotion extends HealthPotion{
    public MediumHealthPotion() {
        setItemId(2);
        setItemName("Medium Health Potion");
        setItemLevel(4);
        setItemStatus(ItemStatus.SPENDING);
        setHealAmount(50);
    }


    @Override
    public void heal(Hero hero) {
        Integer health = hero.getHealth();
        hero.setHealth(health + getHealAmount());
    }
}
