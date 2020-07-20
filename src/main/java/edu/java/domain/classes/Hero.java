package edu.java.domain.classes;

public abstract class Hero {
    private String name;
    private Integer health;
    private Integer strength;
    private Integer integer;
    private Integer agility;
    private Integer luck;
    private Integer eloquence;
    private Integer intimidation;

    private static final Integer MAX_HEALTH = 100;

    public Hero() {
        this.health = MAX_HEALTH;
    }

    public Hero(String name, Integer strength, Integer integer,
                Integer agility, Integer luck, Integer eloquence, Integer intimidation) {
        this.name = name;
        this.health = MAX_HEALTH;
        this.strength = strength;
        this.integer = integer;
        this.agility = agility;
        this.luck = luck;
        this.eloquence = eloquence;
        this.intimidation = intimidation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
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
