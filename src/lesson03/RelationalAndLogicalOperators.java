package lesson03;

public class RelationalAndLogicalOperators {
    public static void main(String[] args) {

        // Операторы сравнения:
        // > больше / >= больше или равно
        // < меньше / <= меньше или равно
        // == равно / != не равно

        int books = 30, students = 22;
        boolean result = books < students; // false
        result = books == students; //false
        result = books != students; //true

        //Логические операторы
        // && и - вернет true, если оба операнда true
        // || или - вернет true, если хотя бы один операнд - true
        // ! не - меняет булевое значение на противоположное

        int maxStudents = 100;
        result = students < maxStudents && students <= books;
        // true && true, и будет true
        result = students > maxStudents || students > books;

        boolean isActive = true, isStable = false;
        result = !isActive;   //false
        result = !(isActive && isStable);   //true
        result = !(students < maxStudents && students <= books);   //false

        // Тернарный оператор :?
        int startYear = 2024, endYear = 2029;
        int validationResult = endYear > startYear ? endYear - startYear : -1;
        // результат 5

        int sum = 1500;
        int sumA = 1000;
        double resultA = sum > sumA ? sum - (sum*10/100.0) : sum;
        System.out.println(resultA);

        double maxTemperatureValue = 1000;
        double currentTemperatureValue = 200.5;
        if (currentTemperatureValue > maxTemperatureValue) {
            System.out.println("Предупреждение ");
        }

        boolean requestResult = false;
        if (requestResult) System.out.println("Запрос успешно обработан");
        else System.out.println("Обработка запроса завершилась неудачей");


        var x = 5;
        var y = 7;
        var z = 10;
        if (x>y && x>z) {
            System.out.println(x);
        } else if (y>x && y>z) {
            System.out.println(y);
        } else {
                System.out.println(z);
        }

        /*
        Дана переменная currentScoreValue - количество очков,
         набранное пользователем.
         если пользователь набрал 90 и более очков, он занял первое место,
         если пользователь набрал от 80 до 89, он занял второе место,
         если пользователь набрал меньше 80, он не занял никакого места.
         Вывести в консоль, какое место занял пользователь.
         Сделать эту задачу!!!

         */
        /*

        var currentScoreValue;
        if (x>y && x>z) {
            System.out.println(x);
        } else if (y>x && y>z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

         */

        var floorNumber = 5;
        switch(floorNumber) {
            case 1, 2 -> System.out.println("7 квартир");
            case 3, 4 -> System.out.println("5 квартир");
            case 5 -> System.out.println("2 квартиры");

        }














    }
}
