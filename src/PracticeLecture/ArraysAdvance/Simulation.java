package PracticeLecture.ArraysAdvance;

public class Simulation {
    public static void main(String[] args) {
        int attempts = 10;
        int avg = 0;

        for (int i = 0; i < attempts; i++) {
            int[] room = new int[364 + 1];
            boolean isRepeat = false;
            int people = 0;

            for (int j = 0; j < room.length; j++) {
                int day = (int) (Math.random() * 365);
                for (int k = 0; k < room.length; k++) {
                    if (room[j] == day) {
                        isRepeat = true;
                        break;
                    }
                }
                if (!isRepeat) {
                    room[j] = day;
                    people++;
                }
            }
            avg += people;
        }
        avg /= attempts;
        System.out.println(avg);
    }
}
