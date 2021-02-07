package PracticeLecture.PPJ26;

public class ExceptionsTasks {
    public static void main(String[] args) {
        DetektorDymu detektorDymu = new DetektorDymu();
        try {
            detektorDymu.czyJestDym(true);
        } catch (Alarm alarm) {
            alarm.printStackTrace();
        }

    }

}

class DetektorDymu {
    public DetektorDymu() {
    }

    public void czyJestDym(boolean dym) throws Alarm {
        if (dym){
            throw new Alarm();
        }
    }
}

class Alarm extends Exception{

}
