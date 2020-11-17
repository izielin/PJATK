package ScoredTask.BitShift;

public class MyCode {
    public static void main(String[] args) {
        int firstInteger = 103685;
        int secondInteger = 77502;
        String result = Integer.toOctalString(firstInteger % secondInteger);
        System.out.println(result);
        int resultOct = 063107;
        byte lowestByte = (byte) (resultOct & 0xFF);
        byte secondLowestByte = (byte) ((resultOct >> 8) & 0xFF);


        String lowByte = String.format("%8s", Integer.toBinaryString(lowestByte & 0xFF)).replace(' ', '0');
        String slowByte = String.format("%8s", Integer.toBinaryString(secondLowestByte & 0xFF)).replace(' ', '0');

        System.out.println(lowByte);

        System.out.println(slowByte);

        if (lowByte.charAt(7) == '1') System.out.print('2');
        else System.out.print('G');
        if (lowByte.charAt(6) == '1') System.out.print('r');
        else System.out.print('Q');
        if (lowByte.charAt(5) == '1') System.out.print('a');
        else System.out.print('}');
        if (lowByte.charAt(4) == '1') System.out.print('L');
        else System.out.print('t');
        if (lowByte.charAt(3) == '1') System.out.print('2');
        else System.out.print('u');
        if (lowByte.charAt(2) == '1') System.out.print('P');
        else System.out.print('l');
        if (lowByte.charAt(1) == '1') System.out.print('a');
        else System.out.print('4');
        if (lowByte.charAt(0) == '1') System.out.print('J');
        else System.out.print('c');

        System.out.println();

    }
}
