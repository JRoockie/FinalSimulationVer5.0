package com.javarush.island.voetsky.Model.plants;

import com.javarush.island.voetsky.Database.Island;
import com.javarush.island.voetsky.Model.Factories.NatureFactory;
import com.javarush.island.voetsky.Model.Nature;
import com.javarush.island.voetsky.Model.UtilityClass;
import com.javarush.island.voetsky.Model.behavior.CouldMultiply;

import java.lang.reflect.InvocationTargetException;


abstract public class Plant extends Nature implements CouldMultiply {
    private int chanceOfExpansion = 10;


    public boolean wantMultiply() {
        return currentMultiplyLevel == maxMultiplyLevel;
    }
    @Override
    public void multiply() {
        int newY = yPos;
        int newX = xPos;
        currentMultiplyLevel = 0;

            synchronized (Island.class) {
                Island island = Island.getInstance();
                if (chanceOfExpansion > UtilityClass.random(100)) {
                    int randomX = UtilityClass.randomMove(maxMovementSpeed);
                    int randomY = UtilityClass.randomMove(maxMovementSpeed);
                    if (randomX + xPos < 0 || randomY + yPos < 0) {
                        if (randomX + xPos < 0) {
                            randomX = Math.abs(randomX);
                        }
                        if (randomY + yPos < 0) {
                            randomY = Math.abs(randomY);
                        }
                    }
                    if (randomX + xPos > island.getxSize() - 1 || randomY + yPos > island.getySize() - 1) {
                        if (randomX + xPos > island.getxSize()) {
                            randomX = -randomX;
                        }
                        if (randomY + yPos > island.getySize()) {
                            randomY = -randomY;
                        }
                    }
                    if (xPos + randomX < island.getxSize() && yPos + randomY < island.getySize()) {
                        newY = yPos + randomY;
                        newX = xPos + randomX;
                    }
                }
            }
            Island.getInstance().setAnimalPosition(newX, newY, NatureFactory.create(this.getClass()));
        }

    public void action() {

        while (age < maxAge && !isEaten && Island.getInstance().isOver()) {
            if (currentMultiplyLevel < maxMultiplyLevel) {
                currentMultiplyLevel++;
            } else {
                currentMultiplyLevel = maxMultiplyLevel;
            }
            if (wantMultiply()) {
                multiply();

            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Island island = Island.getInstance();
        island.removeDead(this, xPos, yPos);
        Thread.currentThread().interrupt();
    }


}
