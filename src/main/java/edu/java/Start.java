package edu.java;

import edu.java.domain.classes.Guardian;
import edu.java.domain.classes.Hero;
import edu.java.domain.classes.Nobel;
import edu.java.domain.classes.Pirate;
import edu.java.domain.enemies.CrazyFrog;
import edu.java.operations.LevelUp;
import edu.java.operations.LevelUpImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

    private final static String PIRATE = "pirate".intern();
    private final static String NOBEL = "nobel".intern();
    private final static String GUARDIAN = "guardian".intern();
    private static Hero hero;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose your hero class!\n Type guardian, pirate or nobel");
        String heroClass = br.readLine();
        hero = createHero(heroClass);
        LevelUp up = new LevelUpImpl();
        up.lvlUp(hero);
        System.out.println("Enter your name: ");
        String name = br.readLine();
        hero.setName(name);
        System.out.printf("Greetings, %s the %s!", name, heroClass);
        hero.showStats();

        CrazyFrog frog = new CrazyFrog();
        frog.hit();
        hero.showStats();
    }

    private static Hero createHero(String heroClass) {

        if(heroClass.equals(PIRATE)) {
            Hero hero = new Pirate();
            return hero;
        }
        if(heroClass.equals(NOBEL)) {
            Hero hero = new Nobel();
            return hero;
        }
        if(heroClass.equals(GUARDIAN)) {
            Hero hero = new Guardian();
            return hero;
        }
        return null;
    }

    public static Hero getHero() {
        return hero;
    }
}
