package com.javarush.island.voetsky;

import com.javarush.island.voetsky.Controller.Controller;
import com.javarush.island.voetsky.Database.Database;
import com.javarush.island.voetsky.Database.Island;
import com.javarush.island.voetsky.Model.Model;
import com.javarush.island.voetsky.View.View;

public class MainMVC {
    public static Island island = Island.getInstance();
    public static Database database = Database.getInstance();

    public static void main(String[] args) throws Exception {

        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);

        model.init();

    }
}