package com.javarush.island.voetsky.Model.animals.Herbivores;

import com.javarush.island.voetsky.Model.animals.Animal;
import com.javarush.island.voetsky.Model.plants.Grass;

public class Chicken extends Animal {
    public Chicken() {
        this(30);
    }

    public Chicken(int maxAge) {
        this.eatMap.put(Grass.class, 80);
        this.maxAge = maxAge;
        this.weight = 10;
        this.maxMovementSpeed = 1;
        this.maxNatureCount = 60;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC14";
    }
}
