package edu.java.domain.enemies;

import java.lang.Math.*;

public abstract class Enemy {
    private String enemyName;
    private Integer enemyLevel;
    private Integer enemyDamage;
//    Skill


    public Enemy() {
    }

    public abstract void hit();

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public Integer getEnemyLevel() {
        return enemyLevel;
    }

    public void setEnemyLevel(Integer enemyLevel) {
        this.enemyLevel = enemyLevel;
    }

    public Integer getEnemyDamage() {
        return enemyDamage;
    }

    public void setEnemyDamage(Integer enemyDamage) {
        this.enemyDamage = enemyDamage;
    }
}
