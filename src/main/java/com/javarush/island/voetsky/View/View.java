package com.javarush.island.voetsky.View;


import com.javarush.island.voetsky.Controller.Controller;
import com.javarush.island.voetsky.Database.Island;

import java.util.*;
import java.util.stream.Collectors;


public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }


    public boolean runDefaultSim() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n0 - Запуск стандартной симуляции" +
                    "\n1 - Запуск кастом симуляции");
            String input = scanner.nextLine();
            try {
                int i = Integer.parseInt(input);
                if (i == 0) {
                    return true;
                } else if (i == 1) {
                    return false;
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                System.err.println("Вы ввели не число, или число выходит за пределы количества функций");
            }
        }
    }


    public void setIslandStats() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите размер острова по x,y,кол-тво тиков. Пример:150 20 30");
            String input = scanner.nextLine();
            String[] params = input.split(" ");
            if (params.length != 3) {
                System.err.println("Некорректный ввод. Пожалуйста, убедитесь, что ввод содержит три числа, разделенных пробелом.");
                continue;
            }
            try {
                int x = Integer.parseInt(params[0]);
                int y = Integer.parseInt(params[1]);
                int tick = Integer.parseInt(params[2]);
                controller.makeIsland(x, y, tick);

                break;
            } catch (NumberFormatException e) {
                System.err.println("Некорректный ввод. Пожалуйста, убедитесь, что ввод содержит только числовые значения.");
            }
        }
    }

    public void setIslandAnimals() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите количество травоядных,растений,хищников. Пример:20 43 96");
            String input = scanner.nextLine();
            String[] params = input.split(" ");
            if (params.length != 3) {
                System.err.println("Некорректный ввод. Пожалуйста, убедитесь, что ввод содержит три числа, разделенных пробелом.");
                continue;
            }
            try {
                int x = Integer.parseInt(params[0]);
                int y = Integer.parseInt(params[1]);
                int z = Integer.parseInt(params[2]);
                controller.fillSimulationList(x, y, z);
                controller.setStartRandomPosition();
                break;
            } catch (NumberFormatException e) {
                System.err.println("Некорректный ввод. Пожалуйста, убедитесь, что ввод содержит только числовые значения.");
            }
        }
    }

    public void startPool() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nМассив заполнен. " +
                    "\nВведите время обновления симуляции в секундах. Пример:20 (Обновление симуляции раз в 20 секунд)");
            String input = scanner.nextLine();

            try {
                int seconds = Integer.parseInt(input);
                controller.startPool(seconds);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Некорректный ввод. Пожалуйста, убедитесь, что ввод содержит только числовые значения.");
            }
        }
    }

    public void fillAllLists() {
        controller.fillAllLists();
    }


    public void init() throws Exception {
        if (runDefaultSim()) {
            controller.runDefaultSim();
        } else {
            fillAllLists();
            setIslandStats();
            setIslandAnimals();
            startPool();
        }
//        UtilityClass.fillAllLists();
//        UtilityClass.fillSimulationList(400, 1000 , 300);
//        System.out.println(simulationList.toString());
//        island.setStartRandomPosition(simulationList);


    }
}
