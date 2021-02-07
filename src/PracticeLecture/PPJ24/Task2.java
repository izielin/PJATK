package PracticeLecture.PPJ24;

public class Task2 {
    public static void main(String[] args) {
        Welder welder = new Welder("Jacek", 20);
        System.out.println(welder.show());
    }
}


class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    String show (){
        return name;
    }
}

class Welder extends Person{
    int seniority;

    Welder(String name, int seniority){
        super(name);
        this.seniority = seniority;
    }

    @Override
    String show() {
        return super.show() + " " + seniority;
    }
}