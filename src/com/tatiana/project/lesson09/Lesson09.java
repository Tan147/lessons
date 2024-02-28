package com.tatiana.project.lesson09;

public class Lesson09 {
    public static void main(String[] args) {
        Car car = new Car();
        Train train = new Train();

        Vehicle[] vehicles = {car, train};

        for (Vehicle vehicle : vehicles) {
            vehicle.breakVehicle();
            if (vehicle instanceof Car) { //проверка на принадлежность к типу кар
                Car vCar = (Car) vehicle; //привидение типов
                vCar.color("red");
            }
            /*if (vehicle instaceof Train t){
                 t.trainVoid();
                 }   это тоже самое: проверка и привидение типов, но для новой версии идеа
             */
        }
        Vehicle train003 = new Train(); //здесь будут доступны метода Vehicle


        //interface Colorable extends Runnable, Cloneable
        //class Building implements Colorable, Serializable
        //и мы можем обратиться к объекту по ссылке Билдинг, где будет вызыватьсяметод интерфейса

    }
}
