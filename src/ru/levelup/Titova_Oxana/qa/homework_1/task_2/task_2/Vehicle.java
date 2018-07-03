package ru.levelup.Titova_Oxana.qa.homework_1.task_2.task_2;

import java.util.ArrayList;
import java.util.List;

public class Vehicle { //Транспортное средство

    private String title; //Наименование модели транспортного средства
    private int capacityPerson; //Вместимость, человек
    private long carryingCapacityKg; //Грузоподъемность, кг
    private long rangeKm; //Дальность полетов, км
    private List<VehicleType> vehiclesType;


    public Vehicle(String title, int capacityPerson, long carryingCapacityKg, long rangeKm) {
        this.title = title;
        this.capacityPerson = capacityPerson;
        this.carryingCapacityKg = carryingCapacityKg;
        this.rangeKm = rangeKm;
        this.vehiclesType = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacityPerson() {
        return capacityPerson;
    }

    public void setCapacityPerson(int capacityPerson) {
        this.capacityPerson = capacityPerson;
    }

    public long getCarryingCapacityKg() {
        return carryingCapacityKg;
    }

    public void setCarryingCapacityKg(long carryingCapacityKg) {
        this.carryingCapacityKg = carryingCapacityKg;
    }

    public long getRangeKm() {
        return rangeKm;
    }

    public void setRangeKm(long rangeKm) {
        this.rangeKm = rangeKm;
    }

    public List<VehicleType> getVehiclesType() {
        return vehiclesType;
    }

    public void setVehiclesType(List<VehicleType> vehiclesType) {
        this.vehiclesType = vehiclesType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "title='" + title + '\'' +
                ", capacityPerson=" + capacityPerson +
                ", carryingCapacityKg=" + carryingCapacityKg +
                ", rangeKm=" + rangeKm +
                ", vehiclesType=" + vehiclesType +
                '}';
    }
}
