package com.javarush.island.voetsky.Controller;


import com.javarush.island.voetsky.Model.Model;
import com.javarush.island.voetsky.Model.UtilityClass;

import java.util.concurrent.TimeUnit;

public class Controller {
    Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void fillAllLists() {
        model.fillAllLists();
    }


    public void makeIsland(int x, int y, int tick) {
        model.makeIsland(x, y, tick);
    }

    public void fillSimulationList(int herbivores, int plants, int predators) {
        model.fillSimulationList(herbivores, plants, predators);
    }

    public void setStartRandomPosition() {
        model.setStartRandomPosition();
    }

    public void startPool(int seconds) {
        model.startPool(seconds);
    }

    public void runDefaultSim() {
        model.runDefaultSim();
    }
//        System.out.println(simulationList.toString());







}
