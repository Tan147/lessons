package com.tatiana.project.lesson09;

public class Lesson09 {
    public static void main(String[] args) {
        Car car = new Car("yellow", 240);
        Train train = new Train(310, 10);

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

        for (Vehicle vehicle : vehicles) {
            vehicle.breakVehicle();
            // если объект принадлежит типу Runnable,
            // оператор instanceof вернет true
            if (vehicle instanceof Runnable) {
                Runnable runnableVehicle = (Runnable) vehicle;
                runnableVehicle.run();
            }
            // если объект принадлежит типу Runnable,
            // оператор instanceof вернет true
            // и выполнит приведение к типу Colorable
            // colorableVehicle -доступ к объекту по новой ссылке
            if (vehicle instanceof Colorable colorableVehicle){
                colorableVehicle.setDefaultColor();
            }
        }

        Vehicle train003 = new Train(220, 123456); //здесь будут доступны метода Vehicle


        //interface Colorable extends Runnable, Cloneable
        //class Building implements Colorable, Serializable
        //и мы можем обратиться к объекту по ссылке Билдинг, где будет вызыватьсяметод интерфейса


        Building building = new Building();
        Colorable colorableBuilding = new Building();
        Runnable runnableBuilding = new Building();

        ColorEvent colorEvent = new ColorEvent();
        colorEvent.setColorables(new Colorable[]{colorableBuilding, car});
        colorEvent.changeColor();

    }
}
