package com.javarush.island.voetsky.Model;

import com.javarush.island.voetsky.Database.Database;
import com.javarush.island.voetsky.Database.Island;
import com.javarush.island.voetsky.Model.animals.Animal;
import com.javarush.island.voetsky.Model.plants.Plant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Model {

    public static Island island = Island.getInstance();
    public static Database database = Database.getInstance();
    public static List<Animal> predatorList = new ArrayList<>();
    public static ArrayList<Nature> simulationList = new ArrayList<>();
    public static List<Plant> plantList = new ArrayList<>();
    public static List<Animal> herbivoreList = new ArrayList<>();
    public static ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);

    public void fillAllLists(){
        UtilityClass.fillAllLists();
    }

    public void makeIsland(int x,int y, int tick) {
        island.makeIsland(x,y,tick);
    }
    public void fillSimulationList(int herbivores, int plants , int predators){
        UtilityClass.fillSimulationList(herbivores, plants , predators);
    }
    public void setStartRandomPosition(){
        island.setStartRandomPosition(simulationList);
    }
    public void startPool(int secondsPeriod) {
        scheduledThreadPool.scheduleWithFixedDelay(island, 0, secondsPeriod, TimeUnit.SECONDS);
        island.startNature();
    }

    public void runDefaultSim() {
        UtilityClass.fillAllLists();
        island.makeIsland(3, 3,30);
        UtilityClass.fillSimulationList(3, 3 , 0);
        island.setStartRandomPosition(simulationList);
        scheduledThreadPool.scheduleWithFixedDelay(island, 0, 2, TimeUnit.SECONDS);
        island.startNature();
    }
}
