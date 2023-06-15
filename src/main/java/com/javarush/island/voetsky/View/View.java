package com.javarush.island.voetsky.View;


import com.javarush.island.voetsky.Controller.Controller;
import com.javarush.island.voetsky.Model.Nature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

//    public void showIsland(){
//
//
//
//
//    }
//    public void generalNatureStats(Object[][] matrix) {
//        List<Nature> statsList = new ArrayList<>();
//        HashMap<String, Long> natureStats = new HashMap<>();
//        for (int x = 0; x < matrix.length; x++) {
//            for (int y = 0; y < matrix[x].length; y++) {
//                ArrayList<Nature> tempList = (ArrayList<Nature>) matrix[x][y];
//                if (!tempList.isEmpty()) {
//                    statsList.addAll(tempList);
//                    for (var i : statsList.stream().map(Object::toString).collect(Collectors.toSet())) {
//                        natureStats.put(i, statsList.stream().filter(k -> Objects.equals(k.toString(), i)).count());
//                    }
//                }
//            }
//        }
//        System.out.println("----------------------------------------------\n");
//        System.out.println("Статистика по острову:\n");
//        System.out.println("\t" + natureStats);
//        System.out.println("\n----------------------------------------------");
//    }
//
//    public void fillDisplayMatrix(Object[][] matrix, int xSize, int ySize) throws Exception {
//        System.out.println("Как работает дисплей пользователя:\n");
//        HashMap<String, Long>[][] result = new HashMap[xSize][ySize];
//
//        for (int x = 0; x < matrix.length; x++) {
//            for (int y = 0; y < matrix[x].length; y++) {
//                ArrayList<Nature> tempList = (ArrayList<Nature>) matrix[x][y];
//                if (!tempList.isEmpty()) {
//                    HashMap<String, Long> currentIndexNature = new HashMap<>();
//                    for (var i : tempList.stream().map(Object::toString).collect(Collectors.toSet())) {
//                        currentIndexNature.put(i, tempList.stream().filter(f -> Objects.equals(f.toString(), i)).count());
//                    }
//                    result[x][y] = currentIndexNature;
//                }
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                if (result[i][j] == null) {
//                    System.out.print("\t{}");
//                } else {
//                    System.out.print("\t" + result[i][j]);
//                }
//            }
//            System.out.println();
//        }
//    }
//

}
