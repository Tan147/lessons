package com.tatiana.project.lesson17;

import com.tatiana.project.lesson15.User;

import java.util.*;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;

public class Lesson17 {
    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("Москва", 790);
        customers.put("Ростов", 300);
        customers.put("Новгород", 210);
        System.out.println(customers.size()); // 3
        customers.put("Ростов", 290); //значение ключа перезаписалось на 290
        System.out.println(customers.size()); // 3
        customers.put(null, 1000);
        customers.put("Самара", 530);
        customers.put("Спб", null);
        System.out.println(customers.size());

        //Удаление
        customers.remove(null); //вернет 1000
        customers.remove(null); //вернет null, потому что ключа нет
        customers.remove("Спб"); //вернет null (как значение удаленного ключа)

        customers.remove("Ростов", 300); //перегружернный remove есть, вернет false
        customers.remove("СПб", null); //вернет false, потому что уже удалили ранее

        //замена
        customers.put("Ростов", 290); //если ключ сущ-ет, заменит зн-ие и вернет новое зн-ие
        customers.replace("Самара", 940); //если ключ сущ-ет, то перезапишет и вернет старое значение
        customers.replace("Самара", 940, 944); // перегруж. реплейс должен найти и ключ и
        // старое значение, вернет true

        //получение значение по ключу
        System.out.println(customers.get("Москва")); //вернет 790
        System.out.println(customers.get("СПб")); //вернет null, т.к. нет ключа

        Integer spbValue = customers.getOrDefault("СПб", -1); //важно, что если в нашем мапе бывает
        // null зн-ие, то тип здесь не должен быть int, а Integer подойдет
        if (spbValue == null || spbValue == -1)
            System.out.println("Информация о городе отсутствует");
        else System.out.println(spbValue);

        if (customers.containsKey("Ростов")) {  //true
            System.out.println("Ключ присутствует в мапе");
            int newValue = customers.get("Ростов") * 2;
            customers.replace("Ростов", newValue);
        }

        if (customers.containsValue(1000)) {  //true если найдет такое значение
            System.out.println("Количество покупателей 1000 содержится в мапе");

        }

        //коллекция значений
        Collection<Integer> values = customers.values();
        //множество ключей
        Set<String> keys = customers.keySet();
        //множество пар
        Set<Map.Entry<String, Integer>> pairs = customers.entrySet();

        for (Map.Entry<String, Integer> pair : pairs) {
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());

            if (pair.getValue() > 1000) {
                System.out.println("В городе " + pair.getKey() +
                        " более 1000 покупателей");
            }
        }

        // [USER, ADMIN, MODERATOR]
        //index 0, 1, 2
        //внутри EnumMap есть массив, внутри массива только значения
        // values[0] = new ...
        // values[1] = new ...
        EnumMap<ClientAuthData.Role, List<ClientAuthData>> clientsByRole =
                new EnumMap<>(ClientAuthData.Role.class);
        clientsByRole.put(ClientAuthData.Role.USER, new ArrayList<>());
        ClientAuthData client01 =
                new ClientAuthData("qwe", "123", ClientAuthData.Role.ADMIN);
        ClientAuthData client02 =
                new ClientAuthData("asd", "234", ClientAuthData.Role.ADMIN);
        ArrayList<ClientAuthData> clientList = new ArrayList<>();
        clientList.add(client01);
        clientList.add(client02);
        clientsByRole.put(ClientAuthData.Role.ADMIN, clientList);

        ClientAuthData client03 =
                new ClientAuthData("user01", "123", ClientAuthData.Role.USER);
        clientsByRole.get(ClientAuthData.Role.USER).add(client03);


    }

    //Задача 2
    public static void addClientData(EnumMap<ClientAuthData.Role, List<ClientAuthData>> map,
                                     ClientAuthData clientData){
        if (map == null || clientData == null || clientData.getRole() == null) return;
        //EnumMap<ClientAuthData.Role здесь у нас ключи
        //clientData.getRole()
        map.get(clientData.getRole()).add(clientData);

        if (!map.containsKey(clientData.getRole())){
            ArrayList<ClientAuthData> list = new ArrayList<>();
            list.add(clientData);
            map.put(clientData.getRole(), list);
        }

        //map.put(clientData.getRole(), map.getOrDefault(clientData.getRole(), new ArrayList<>())).add(clientData);
    }




    //Задача 3
    public static Map<String, String> getUserData(EnumMap<ClientAuthData.Role,
            List<ClientAuthData>> map){
        if (map == null) throw new IllegalArgumentException();

        List<ClientAuthData> userData = map.get(ClientAuthData.Role.USER);
        if (userData == null) throw new IllegalArgumentException();

        Map<String, String> result = new HashMap<>();
        for (ClientAuthData user : userData) {
            result.put(user.getUserName(),user.getPassword());
        }
        return result;
    }



    //Задача 1
    /*
    public static List<String> citiesList(HashMap<String, Integer> map, int max) {
        if (map == null || max < 0) throw new IllegalArgumentException();
        if (map.isEmpty()) return Collection.emptyList();
        List<String> cities = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != null && entry.getValue() < max) {
                cities.add(entry.getKey());
            }
        }
        return cities;
    }
    */


    // интерфейс Map<KeyType, ValueType>
    // предоставляет набор методов для работы с ассоциациями: ключ - значение
    // одному ключу всегда соответствует только одно значение
    // ключи не могут дублироваться
    // порядок хранения ключей и связанных с ними значений зависит от конкретных реализаций
    // есть возможность получения: set ключей, collection значений, set пар (ключ+значение)


    // Реализации:

    // 1. HashMap<KeyType, ValueType>
    // неупорядоченная по ключам ассоциация
    // позволяет использовать null в качестве ключа
    // реализована на основе hash таблицы
    // capacity = 16

    // 2. LinkedHashMap<KeyType, ValueType>
    // упорядоченная по ключам ассоциация
    // позволяет использовать null в качестве ключа
    // реализована на основе hash таблицы

    // 3. EnumMap<KeyTypeEnum, ValueType>
    // использует только элементы перечислений в качестве ключей
    // хранит только массив значений
    // при создании экземпляра необходимо передавать ссылку на класс перечисления

    // 4. TreeMap<KeyType, ValueType>
    // хранит пары в отсортированном по ключам виде
    // для KeyType должен быть определен натуральный порядок сортировки или
    // в конструктор TreeMap необходимо передать экземпляр Comparator
    // нельзя использовать null в качестве ключа

    // 5. WeakHashMap<KeyType, ValueType>
    // неупорядоченная по ключам ассоциация
    // реализована на основе hash таблицы
    // очищается сборщиком, когда на ключи не остаётся сильных ссылок

}

