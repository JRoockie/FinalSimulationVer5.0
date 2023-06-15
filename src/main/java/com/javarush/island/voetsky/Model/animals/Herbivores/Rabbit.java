package com.javarush.island.voetsky.Model.animals.Herbivores;

import com.javarush.island.voetsky.Model.animals.Animal;
import com.javarush.island.voetsky.Model.plants.Grass;
public class Rabbit extends Animal {

    public Rabbit() {
            this(40);
        }

    public Rabbit(int maxAge) {
            this.eatMap.put(Grass.class, 80);
            this.maxAge = maxAge;
            this.weight = 15;
            this.maxMovementSpeed = 1;
            this.maxNatureCount = 50;
        }


    @Override
    public String toString() {
        return "\uD83D\uDC07";
    }

}
