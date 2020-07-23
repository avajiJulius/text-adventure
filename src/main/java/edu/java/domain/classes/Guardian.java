package edu.java.domain.classes;


public class Guardian extends Hero {
    public Guardian() {
        setStrength(10);
        setAgility(4);
        setIntelligence(2);
        setLuck(4);
        setEloquence(2);
        setIntimidation(10);
    }

    @Override
    public void showStats() {
        System.out.printf("\nYour class Guardian\nLevel: %d\nHealth: %d\n" +
                        "Strength: %d\nAgility: %d\nIntelligence: %d\nLuck: %d\n" +
                        "Eloquence %d\nIntimidation: %d\n", getLevel(),getHealth(), getStrength(), getAgility(),
                getIntelligence(),getLuck(),getEloquence(),getIntimidation());
    }

}
