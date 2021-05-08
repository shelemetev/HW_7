package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Person me = new Person("Kirill", "Don`twanttotalk", Gender.MALE);
        Person friend = new Person("Danil", "Gernumbli", Gender.MALE);
        Person girl = new Person("Polina", "Niberkryker", Gender.FEMALE);
        Person secondGirl = new Person("Polina", "Niberkryker", Gender.FEMALE);
        Person secondMe = new Person("Kirill", "Don`twanttotalk", Gender.MALE);


        //List демонстрация
        ArrayList<Person> listPersons = new ArrayList<>();
        listPersons.add(me);
        listPersons.add(secondMe);
        listPersons.add(girl);
        listPersons.add(secondGirl);
        listPersons.add(friend);

        outputCollection(listPersons);


        //Set демонстрация
        Set<Person> setPersons=new HashSet<>();
        setPersons.add(me);
        setPersons.add(secondMe);
        setPersons.add(girl);
        setPersons.add(secondGirl);
        setPersons.add(friend);

        outputSet(setPersons);


        //Map демонстрация
        Map<Integer,Person> mapPersons=new HashMap<>();
        mapPersons.put(1,me);
        mapPersons.put(2,secondMe);
        mapPersons.put(3,girl);
        mapPersons.put(4,secondGirl);
        mapPersons.put(5,friend);

        outputMap(mapPersons);
    }

    public static void outputCollection(List<Person> list) {
        System.out.println();

        for (Person person : list) {
            System.out.print(person + " \n");
        }

        System.out.println(list.size());
    }


    public static void outputSet(Set<Person> set) {
        System.out.println("Вывод: ");

        for (Person number : set) {
            System.out.println(number + " ");
        }

        System.out.println(set.size());
    }


    public static void outputMap(Map<Integer,Person> map) {
        System.out.println("Вывод: ");

        for (Map.Entry<Integer,Person> keyValuePair:map.entrySet()) {
            System.out.println(keyValuePair.getValue() + " "+keyValuePair.getKey());
        }

        System.out.println(map.size());

    }

}
