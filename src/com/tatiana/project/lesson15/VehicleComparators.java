package com.tatiana.project.lesson15;

import com.tatiana.project.lesson09.Vehicle;

import java.util.Comparator;

public class VehicleComparators {
    public static class LevelOfWareComparator implements Comparator<Vehicle> {

        //чем больше уровень износа, тем меньше объект
        //если < 0 - то  o1 < o2
        //если > 0 - то  o1 > o2
        //если == 0 - то  o1 == o2
        @Override
        public int compare(Vehicle o1, Vehicle o2) {
            //if (o1.LevelOfWareComparator < o2.LevelOfWareComparator) return 1;
            //if (o1.LevelOfWareComparator > o2.LevelOfWareComparator) return -1;
            return o2.getLevelOfWare() - o1.getLevelOfWare();
        }

    }

   /* public static class NumberComparator implements Comparator<Vehicle>{
        //по алфавиту с учетом регистра (number - String)
        @Override
        public int compare(Vehicle o1, Vehicle o2) {
            return o1.getNumber().compareTo(o2.getNumber());
        }
    }*/
}

//VehicleComparators.LevelOfWareComparator LevelOfWareComp = new VehicleComparators.NumberComparator();