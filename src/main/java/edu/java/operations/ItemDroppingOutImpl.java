package edu.java.operations;

import edu.java.domain.classes.Hero;

import java.util.Random;

public class ItemDroppingOutImpl implements ItemDroppingOut{
    @Override
    public void itemDrop(Hero hero) {
        Random random = new Random();
        Integer randomItem = random.nextInt(4);

    }


}
