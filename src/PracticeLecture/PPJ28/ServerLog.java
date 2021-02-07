package PracticeLecture.PPJ28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//task 1
// \+{0,1}\d+((\((\d+|\.)\))|.*)\d+
public class ServerLog {
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/PracticeLecture/PPJ28/serverLog.txt");
            while (fileInputStream.available() > 0) {
                stringBuilder.append((char) fileInputStream.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String regexIP = "(\\d+\\.){3}\\d+";
        String regexDate = "(\\d+/){2}\\d+";
        String regexMessage = "(?<=> ).*";

        String[][] array = new String[100][3];
        int index = 0;
        Pattern pattern = Pattern.compile(regexIP);
        Pattern pattern2 = Pattern.compile(regexDate);
        Pattern pattern3 = Pattern.compile(regexMessage);
        Matcher matcher = pattern.matcher(stringBuilder);
        Matcher matcher2 = pattern2.matcher(stringBuilder);
        Matcher matcher3 = pattern3.matcher(stringBuilder);
        while (matcher.find() && matcher2.find() && matcher3.find() && index < 100) {
            array[index][0] = matcher.group();
            array[index][1] = matcher2.group();
            array[index][2] = matcher3.group();
            index++;
        }
        ArrayList<Message> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            String[] date = array[i][1].split("/");
            Message message = new Message(array[i][0], Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
            arrayList.add(message);
        }

        arrayList.forEach(element -> System.out.println(element.toString()));
    }
}
class Message{
    String IP;
    int day, month, year;

    public Message(String IP, int day, int month, int year) {
        this.IP = IP;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Message{" +
                "IP='" + IP + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}

