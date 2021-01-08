package PracticeLecture.PPJ22.person;

import java.sql.SQLOutput;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        Person person1 = new Person("Jan", 2000);
        Person person2 = new Person("Kazik", 1999);
        Person person3 = new Person("Kasia", 2010);
        Person person4 = new Person("Monika", 1980);

        people[0] = person1;
        people[2] = person2;
        people[3] = person3;
        people[1] = person4;

        System.out.println("Działanie metody getName(): " + person1.getName());
        System.out.println("Działanie metody getAge(): " + person2.getAge());
        System.out.println("Działanie metody getOlder(): " + Person.getOlder(person1, person3).getName());
        System.out.println("Działanie metody getOldest(): " + Person.getOldest(people).getName());

        Person.sortByAge(people);

        System.out.println("Posortowana tablica: ");
        for (Person person : people) {
            System.out.print(person.getName() + ", ");
        }

    }
}

class Person {
    private String name;
    private int BirthYear;

    Person() {
    }

    Person(String name) {
        this.name = name;
        this.BirthYear = 1990;
    }

    Person(String name, int year) {
        this.name = name;
        this.BirthYear = year;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - this.BirthYear;
    }

    static Person getOlder(Person person1, Person person2) {
        return (person1.getAge() > person2.getAge()) ? person1 : person2;
    }

    static Person getOldest(Person[] people) {
        Person oldest = people[0];
        for (Person person : people) {
            if (person.getAge() > oldest.getAge())
                oldest = person;
        }
        return oldest;
    }

    static void sortByAge(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > key.getAge()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = key;
        }
    }
}