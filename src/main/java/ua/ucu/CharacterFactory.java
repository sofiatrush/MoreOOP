package ua.ucu;

import java.util.Random;

public class CharacterFactory {
    private static final Random RANDOM = new Random();
    
    public Character createCharacter() {
        int type = RANDOM.nextInt(4);
        switch (type) {
            case 0: 
                return new Hobbit();
            case 1: 
                return new Elf();
            case 2: 
                return new King();
            case 3: 
                return new Knight();
            default: 
                return null;
        }
    }
}
