package PracticeLecture.PPJ25;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[11];
        Person person = new Person("Jan", "Nowak", "009-891-112");
        Person person2 = new Person("Agnieszka", "Kubańska", "115-331-998");
        Person person3 = new Person("Jacek", "Kowalski", "113-331-998");
        Person person4 = new Person("Kuba", "Walczak", "110-331-998");
        Person person5 = new Person("Natalia", "Król", "111-331-998");
        Person person6 = new Person("Agata", "Czarnecka", "118-331-998");
        Person person7 = new Person("Dawid", "Krawczyński", "117-331-998");
        Person person8 = new Person("Hubert", "Kowalski", "116-331-998");
        Person person9 = new Person("Kuba", "Dudek", "113-301-998");
        Person person10 = new Person("Jacek", "Nowak", "113-211-998");
        Person person11 = new Person("Jacek", "Zieliński", "113-331-998");
        people[0] = person;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;
        people[5] = person6;
        people[6] = person7;
        people[7] = person8;
        people[8] = person9;
        people[9] = person10;
        people[10] = person11;

        Telephone[] telephones = new Telephone[3];

        Smartphone smartphone = new Smartphone("interfejs", "czarny", new String[10], new Person[10]);
        for (int j = 0; j < 10; j++) {
            smartphone.addFriend(people[(int) (Math.random() * (people.length))]);
        }

        telephones[0] = new Telephone("interfejs", "czarny");
        telephones[1] = new Mobile("interfejs", "czarny", new String[10]);
        telephones[2] = smartphone;


        String[] numbers = {
                "009-891-112", "019-891-112", "115-331-998", "891-872-122", "113-331-998", "012-872-122",
                "110-331-998", "063-872-122", "111-331-998", "021-872-122", "118-331-998", "073-872-122",
                "117-331-998", "092-872-122", "116-331-998", "011-872-122", "113-301-998", "063-872-122",
                "113-211-998", "900-872-122", "113-000-998", "900-872-112", "113-331-998"
        };

        for (Telephone telephone : telephones) {
            for (int j = 0; j < 10; j++) {
                telephone.call(numbers[(int) (Math.random() * (numbers.length))]);
            }

        }

        for (Telephone telephone : telephones) {
            telephone.showHistory();
            System.out.println();
            System.out.println();
        }


    }
}

class Person {
    String firstName;
    String lastName;
    String number;

    public Person(String firstName, String lastName, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

}

class Telephone {
    String communicationInterface;
    String color;

    public Telephone(String communicationInterface, String color) {
        this.communicationInterface = communicationInterface;
        this.color = color;
    }

    void call(String number) {
        System.out.println(number);
    }

    void showHistory() {
        System.out.println("brak historii");
    }
}

class Mobile extends Telephone {
    String[] callHistory;
    int numberOfCalls = 0;

    public Mobile(String communicationInterface, String color, String[] callHistory) {
        super(communicationInterface, color);
        this.callHistory = callHistory;
    }

    @Override
    void call(String number) {
        if (numberOfCalls >= callHistory.length) {
            for (int i = callHistory.length - 1; i > 0; i--) {
                callHistory[i] = callHistory[i - 1];
            }
            callHistory[0] = number;
        } else {
            callHistory[numberOfCalls] = number;
        }
        numberOfCalls++;
    }

    @Override
    void showHistory() {
        for (String s : callHistory) {
            System.out.println(s);
        }
    }
}


class Smartphone extends Mobile {
    Person[] friends;

    public Smartphone(String communicationInterface, String color, String[] callHistory, Person[] friends) {
        super(communicationInterface, color, callHistory);
        this.friends = friends;
    }

    public void addFriend(Person person) {
        int counter = 0;
        for (Person friend : friends) {
            if (friend != null)
                counter++;
        }

        if (counter >= friends.length) {
            System.out.println("Brak miejsca na nowy kontakt");
        } else {
            friends[counter] = person;
        }
    }


    @Override
    void call(String number) {
        super.call(number);
    }

    @Override
    void showHistory() {
        for (String s : callHistory) {
            boolean searched = false;
            for (Person friend : friends) {
                if (friend != null && s.equals(friend.number)) {
                    System.out.println(friend.firstName + " " + friend.lastName + " " + friend.number);
                    searched = true;
                }
            }
            if (!searched) {
                System.out.println(s);
            }
        }
    }
}