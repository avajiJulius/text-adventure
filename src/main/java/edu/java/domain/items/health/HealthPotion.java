package edu.java.domain.items.health;

import edu.java.domain.classes.Hero;
import edu.java.domain.items.Item;
import edu.java.domain.items.ItemStatus;

public abstract class HealthPotion extends Item {

    private Integer healAmount;

    public HealthPotion() {
    }

    public HealthPotion(Integer healAmount) {
        this.healAmount = healAmount;
    }

    public HealthPotion(Integer itemId, String itemName, Integer itemLevel, ItemStatus itemStatus, String description, Integer healAmount) {
        super(itemId, itemName, itemLevel, itemStatus, description);
        this.healAmount = healAmount;
    }

    public abstract void heal(Hero hero);

    public Integer getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(Integer healAmount) {
        this.healAmount = healAmount;
    }

    @Override
    public String getDescription() {
        String description = getItemName() +
                "\n" + getItemStatus() +
                "\nItem level:" + getItemLevel() +
                "\nThis potion restore " + getHealAmount() +" hp";
        return description;
    }
}
