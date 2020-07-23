package edu.java.domain.classes;


public class Nobel extends Hero {

    public Nobel() {
        setStrength(2);
        setAgility(4);
        setIntelligence(10);
        setLuck(5);
        setEloquence(10);
        setIntimidation(1);
    }

    @Override
    public void showStats() {
        System.out.printf("\nYour class Nobel\nLevel: %d\nHealth: %d\n" +
                        "Strength: %d\nAgility: %d\nIntelligence: %d\nLuck: %d\n" +
                "Eloquence %d\nIntimidation: %d\n", getLevel(),getHealth(),getStrength(), getAgility(),
                getIntelligence(),getLuck(),getEloquence(),getIntimidation());
    }
}
