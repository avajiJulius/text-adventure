package edu.java.domain.classes;

public abstract class Hero {
    private String name;
    private Integer level;
    private Integer health;
    private Integer strength;
    private Integer intelligence;
    private Integer agility;
    private Integer luck;
    private Integer eloquence;
    private Integer intimidation;

    private static final Integer MAX_HEALTH = 100;
    private static final Integer START_LEVEL = 1;

    public Hero() {
        this.level = START_LEVEL;
        this.health = MAX_HEALTH;
    }

    public Hero(String name, Integer level, Integer strength, Integer intelligence,
                Integer agility, Integer luck, Integer eloquence, Integer intimidation) {
        this.name = name;

        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.luck = luck;
        this.eloquence = eloquence;
        this.intimidation = intimidation;
    }

    public abstract void showStats();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public Integer getEloquence() {
        return eloquence;
    }

    public void setEloquence(Integer eloquence) {
        this.eloquence = eloquence;
    }

    public Integer getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(Integer intimidation) {
        this.intimidation = intimidation;
    }

    public static Integer getMaxHealth() {
        return MAX_HEALTH;
    }

}
