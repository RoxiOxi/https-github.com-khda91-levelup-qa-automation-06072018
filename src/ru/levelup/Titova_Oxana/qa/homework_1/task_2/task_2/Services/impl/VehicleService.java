package ru.levelup.Titova_Oxana.qa.homework_1.task_2.task_2.Services.impl;

import ru.levelup.Titova_Oxana.qa.homework_1.task_2.task_2.Services.SaveLoadData;
import ru.levelup.Titova_Oxana.qa.homework_1.task_2.task_2.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleService implements SaveLoadData {

    private List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public void saveData(String path) {

    }

    @Override
    public void loadData(String path) {
        BufferedReader br = null;
        try {
            // FileInputStream fis = new FileInputStream(new File(path));
            br = new BufferedReader(new FileReader(path));
            String currentLine;

            while ((currentLine = br.readLine())!=null) {
                String[] vehiclesData = currentLine.split(";");
                Vehicle vehicle = new Vehicle(vehiclesData[0], Integer.valueOf(vehiclesData[1]), Long.valueOf(vehiclesData[2]), Long.valueOf(vehiclesData[3]));
                vehicles.add(vehicle);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null){
                    br.close();}
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
