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



        int maxScoreValue = 100;
        int currentScoreValue01 = 20;
        if (currentScoreValue01 == maxScoreValue) {
            System.out.println("Вы набрали достаточное " +
                    "количество очков");
        } else {
            System.out.println("Вы не успели набрать достаточное " +
                    "количество очков. Попробуйте еще раз");
        }

        char currentChar = 'a';
        if (currentChar == 'a' || currentChar == 'z') {
            System.out.println("Ваша роль - пользователь");
        } else if (currentChar == 'x') {
            System.out.println("Ваша роль - администратор");
        } else {
            System.out.println("Вам еще не выдана роль");
        }

        // фигурные скобки можно опустить, если if соответствует одна инструкция
        /* boolean requestResult = false;
        if (requestResult) System.out.println("Запрос успешно обработан");
        else System.out.println("Обработка запроса завершилась неудачей");

        if (requestResult)
            System.out.println("Запрос успешно обработан");
        else
            System.out.println("Обработка запроса завершилась неудачей");

        if (requestResult) {
            System.out.println("Запрос успешно обработан");
        } else {
            System.out.println("Обработка запроса завершилась неудачей");
            System.out.println("Попробуйте в следующий раз");
        }

         */


        // if (requestResult/* == true*/) System.out.println("Запрос успешно обработан");
        // if (!requestResult/* == false*/) System.out.println("Запрос успешно обработан");

        // В чём разница?
        currentChar = 'a';
        if (currentChar == 'a' || currentChar == 'z') {
            System.out.println("Ваша роль - пользователь");
        } else if (currentChar == 'x') {
            System.out.println("Ваша роль - администратор");
        }

        currentChar = 'a';
        if (currentChar == 'a' || currentChar == 'z') {
            System.out.println("Ваша роль - пользователь");
        }
        if (currentChar == 'x') {
            System.out.println("Ваша роль - администратор");
        }




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
         */

        int currentScoreValue;
        currentScoreValue = 91;
        if (currentScoreValue >= 90) {
            System.out.println("1 место");
        } else if (currentScoreValue >=80 && currentScoreValue <= 89) {
            System.out.println("2 место");
        } else {
            System.out.println("0 место");
        }



        var floorNumber = 5;
        switch(floorNumber) {
            case 1, 2 -> System.out.println("7 квартир");
            case 3, 4 -> System.out.println("5 квартир");
            case 5 -> System.out.println("2 квартиры");

        }

















    }
}
