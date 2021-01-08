package ScoredTasks;

import java.util.Arrays;

public
class Main {


    public static boolean mojaMetoda(char[] dane, char[] poszukiwane) {
        /*
        public static boolean mojaMetoda(char[] dane, char[] poszukiwane){
        boolean flag=false;
        int counter=0;
        for (int i = 0; i < dane.length; i++) {
            for (int j = 0; j < poszukiwane.length; j++) {
                if(dane[i]==poszukiwane[j]) flag=true;
            }
            if(flag)counter++;
            flag=false;
        }
        if(counter>=dane.length)return true;
        return false;
    }
        */


        char[] temp = new char[dane.length];
        for (int i = 0; i < dane.length; i++) {
            for (int j = 0; j < poszukiwane.length; j++) {
                if (dane[i] == poszukiwane[j]) {
                    temp[i] = ' ';
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != ' ')
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        char[] dane = {'a', 'b', 'a', 'a', 'd', 'c'};
        char[] poszukiwane = {'a', 'b', 'd', 'c'};
        System.out.println(mojaMetoda(dane, poszukiwane));


    }
}