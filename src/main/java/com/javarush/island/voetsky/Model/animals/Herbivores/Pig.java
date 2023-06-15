package com.javarush.island.voetsky.Model.animals.Herbivores;

import com.javarush.island.voetsky.Model.animals.Animal;
import com.javarush.island.voetsky.Model.plants.Grass;
public class Pig extends Animal {

    public Pig() {
        this(40);
    }

    public Pig(int maxAge) {
        this.eatMap.put(Grass.class, 80);
        this.maxAge = maxAge;
        this.weight = 50;
        this.maxMovementSpeed = 2;
        this.maxNatureCount = 40;
    }

    @Override
    public String toString ()  {
        return "\uD83D\uDC16";
    }
}
