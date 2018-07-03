package ru.levelup.Titova_Oxana.qa.homework_1.task_2.task_2;

import ru.levelup.Titova_Oxana.qa.homework_1.task_2.task_2.Services.impl.VehicleService;

import java.io.FileNotFoundException;

public class Main {

    public static void main (String[]  args) {
        VehicleService vehicleService = new VehicleService();
        vehicleService.loadData("D:\\КУРСЫ ТЕСТИРОВАНИЯ\\Homework\\src\\recources\\vehicle");
        System.out.println(vehicleService.getVehicles());
    }
}
