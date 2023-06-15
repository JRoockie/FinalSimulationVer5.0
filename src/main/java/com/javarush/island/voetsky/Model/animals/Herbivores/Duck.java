package com.javarush.island.voetsky.Model.animals.Herbivores;

import com.javarush.island.voetsky.Model.animals.Animal;
import com.javarush.island.voetsky.Model.plants.Grass;
public class Duck extends Animal {
    public Duck() {
        this(40);
    }

    public Duck(int maxAge) {
        this.eatMap.put(Grass.class, 80);
        this.maxAge = maxAge;
        this.weight = 10;
        this.maxMovementSpeed = 2;
        this.maxNatureCount = 40;
    }
    @Override
    public String toString() {
        return "\uD83E\uDD86";
    }
}
