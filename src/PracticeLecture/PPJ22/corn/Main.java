package PracticeLecture.PPJ22.corn;

import java.sql.SQLOutput;

class Main {
    public static void main(String[] args) {
        Corn corn = new Corn(7);
        Popcorn[] array = corn.makePopcorn();

        for (Popcorn p : array) {
            System.out.println(p);
        }
    }


}

class Corn {

    int cornCount;

    Corn(int cornCount) {
        this.cornCount = cornCount;
    }

    public Popcorn[] makePopcorn() {
        int random = (int) (Math.random() + cornCount);
        Popcorn[] popcorn = new Popcorn[random];
        for (int i = 0; i < random; i++) {
            popcorn[i] = new Popcorn();
        }
        return popcorn;
    }

}

class Popcorn {
    Popcorn() {
    }
}