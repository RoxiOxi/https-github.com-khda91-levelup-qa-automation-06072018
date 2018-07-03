package ru.levelup.Titova_Oxana.qa.homework_1.task_2.task_2;

import java.util.List;

public class Aircompany { //Авиакомпания

    private String name; //Наименование авиакомпании
    private List<Vehicle> vehicles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Aircompany{" +
                "name='" + name + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }

    public long getСarryingCapacityKg () { //Поиск общей грухоподъемности

        long сarryingCapacityKg = 0; //грузоподъемность

        for (Vehicle vehicle : vehicles) {
            сarryingCapacityKg += vehicle.getCarryingCapacityKg(); //Общая грузоподъемность
        }

        return сarryingCapacityKg;
    }

//    public int getCapacityPerson () { //Поиск общей вместимости
//
//        int сapacityPerson = 0; //вместимость
//
//        for (Vehicle vehicle : vehicles) {
//            сapacityPerson += vehicle.getCapacityPerson(); //вместимость
//        }
//
//        return сapacityPerson;
//    }
//
//    //найдем самолет, у которого дольность меньше 1000 км и грузоподъемность больше 50000 кг
//    public List findVehicle(int rangeKm, long carryingCapacityKg) {
//        for (Vehicle vehicle : vehicles) {
//            if (vehicle.getRangeKm()<1000 && vehicle.getCapacityPerson()>50000)
//               System.out.println(vehicle.getTitle());
//            else
//                System.out.println("Не найдено");
//        }
//    }
//    public void sortVehicle(List vehicles, PlaneGen rangeKm){
//
//        for (int i=0; i<vehicle.getRangeKm(); i++) {
//            vehicles.sort(vehicles, rangeKm);
//        }
//
//    /*    boolean flag = true;
//        int temp;
//
//        while (flag) {
//            flag = false;
//            for (int j = 0; j < elem.length - 1; j++) {
//                if (elem[j] > elem[j + 1]) {
//                    temp = elem[j];
//                    elem[j] = elem[j + 1];
//                    elem[j + 1] = temp;
//                    flag = true;
//                }
//            }
//        }*/
//    }
}
