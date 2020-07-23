package edu.java.domain.classes;

public class Pirate extends Hero {
    public Pirate() {
        setStrength(3);
        setAgility(10);
        setIntelligence(3);
        setLuck(10);
        setEloquence(3);
        setIntimidation(3);
    }

    @Override
    public void showStats() {
        System.out.printf("\nYour class Pirate\nLevel: %d\nHealth: %d" +
                        "\nStrength: %d\nAgility: %d\nIntelligence: %d\nLuck: %d\n" +
                        "Eloquence %d\nIntimidation: %d\n", getLevel(),getHealth(),getStrength(), getAgility(),
                getIntelligence(),getLuck(),getEloquence(),getIntimidation());
    }
}
