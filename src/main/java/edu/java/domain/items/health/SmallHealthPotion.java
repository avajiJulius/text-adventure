package edu.java.domain.items.health;

import edu.java.domain.classes.Hero;
import edu.java.domain.items.ItemStatus;

public class SmallHealthPotion extends HealthPotion {

    public SmallHealthPotion() {
        setItemId(1);
        setItemName("Small Health Potion");
        setItemLevel(1);
        setItemStatus(ItemStatus.SPENDING);
        setHealAmount(20);
    }

    @Override
    public void heal(Hero hero) {
        Integer health = hero.getHealth();
        hero.setHealth(health + getHealAmount());
    }

}
