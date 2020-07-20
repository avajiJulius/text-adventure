package edu.java;

import edu.java.domain.classes.Guardian;
import edu.java.domain.classes.Hero;
import edu.java.domain.classes.Nobel;
import edu.java.domain.classes.Pirate;
import edu.java.operations.LevelUp;
import edu.java.operations.LevelUpImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose your hero!\n Type guardian, pirate or nobel");
        Hero hero = createHero(br.readLine());
        LevelUp up = new LevelUpImpl();
        up.lvlUp(hero);
    }

    private static Hero createHero(String heroClass) {
        if(heroClass.equals("pirate")) {
            Hero hero = new Pirate();
            return hero;
        }
        if(heroClass.equals("nobel")) {
            Hero hero = new Nobel();
            return hero;
        }
        if(heroClass.equals("guardian")) {
            Hero hero = new Guardian();
            return hero;
        }
        return null;
    }


}
