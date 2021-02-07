package PracticeLecture.PPJ27;

import java.io.*;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        String[] alphabet = new String[52];
        int[] countingArray = new int[52];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = Character.toString('A' + i);
        }
        for (int i = 0; i < 26; i++) {
            alphabet[26+i] = Character.toString('a' + i);
        }


        try {
            FileInputStream inputStream = new FileInputStream("src/PracticeLecture/PPJ27/loremIpsum.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = bufferedReader.readLine();
            String[] letters = line.split("");
            for (int i = 0; i < alphabet.length; i++) {
                for (String letter : letters) {
                    if (alphabet[i].equals(letter))
                        countingArray[i] += 1;
                }
            }

            for (int i = 0; i < alphabet.length; i++) {
                System.out.println("Letter: " + alphabet[i] + " amount: " + countingArray[i]);
            }


            FileInputStream inputStream1 = new FileInputStream(".java");
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream1));

            String[] keys = {"for", "while", "void", "class"};
            String line1;
            int counter=0;
            while((line1= bufferedReader1.readLine())!=null){
                for (String key : keys) {
                    if (line1.contains(key)) {
                        counter++;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
