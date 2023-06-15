package com.javarush.island.voetsky.Model.animals.Herbivores;

import com.javarush.island.voetsky.Model.animals.Animal;
import com.javarush.island.voetsky.Model.plants.Grass;
public class Grasshopper extends Animal {
    public Grasshopper() {
        this(40);
    }

    public Grasshopper(int maxAge) {
        this.eatMap.put(Grass.class, 80);
        this.maxAge = maxAge;
        this.weight = 1;
        this.maxMovementSpeed = 1;
        this.maxNatureCount = 100;
    }
    @Override
    public String toString() {
        return "\uD83E\uDD97";
    }
}
