package AuxiliaryFunctions;

public class Array {
    // printing arrays

    public static void printIntArray(int[] array) {
        int fill = array.length;
        for (int i = 0; i < fill; i++) {
            System.out.print(array[i] + ((i < fill - 1) ? ", " : ""));
        }
        System.out.println();
    }

    public static void printByteArray(byte[] array) {
        int fill = array.length;
        for (int i = 0; i < fill; i++) {
            System.out.print(array[i] + ((i < fill - 1) ? ", " : ""));
        }
        System.out.println();
    }

    public static void printBooleanArray(boolean[] array) {
        int fill = array.length;
        for (int i = 0; i < fill; i++) {
            System.out.print(array[i] + ((i < fill - 1) ? ", " : ""));
        }
        System.out.println();
    }

    public static void printLongArray(long[] array) {
        int fill = array.length;
        for (int i = 0; i < fill; i++) {
            System.out.print(array[i] + ((i < fill - 1) ? ", " : ""));
        }
        System.out.println();
    }

    public static void printCharArray(char[] array) {
        int fill = array.length;
        for (int i = 0; i < fill; i++) {
            System.out.print(array[i] + ((i < fill - 1) ? ", " : ""));
        }
        System.out.println();
    }

    public static void printStringArray(String[] array) {
        int fill = array.length;
        for (int i = 0; i < fill; i++) {
            System.out.print(array[i] + ((i < fill - 1) ? ", " : ""));
        }
        System.out.println();
    }

    public static void printDoubleArray(double[] array) {
        int fill = array.length;
        for (int i = 0; i < fill; i++) {
            System.out.print(array[i] + ((i < fill - 1) ? ", " : ""));
        }
        System.out.println();
    }

    public static void print2DArray(int[][] array) {
        for (int[] ints : array) {
            for (int n = 0; n < ints.length; n++) {
                System.out.print(ints[n] + ((n < ints.length - 1) ? " " : ""));
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void print2DArray(char[][] array) {
        for (char[] ints : array) {
            for (int n = 0; n < ints.length; n++) {
                System.out.print(ints[n] + ((n < ints.length - 1) ? " " : ""));
            }
            System.out.println();
        }
        System.out.println();

    }

    // fill array

    public static void fillIntArray(int[] array, int highRange, int lowRange) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (highRange - lowRange) + lowRange);
        }
    }

    public static void fillFloatArray(float[] array, double highRange, double lowRange) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (Math.random() * (highRange - lowRange) + lowRange);
        }
    }

    public static void fillDoubleArray(double[] array, double highRange, double lowRange) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (Math.random() * (highRange - lowRange) + lowRange);
        }
    }

    // append to existing array
    public static byte[] appendByteToExistingArray(byte[] array, byte element) {
        array = java.util.Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        return array;
    }

    public static boolean[] appendBooleanValueToExistingArray(boolean[] array, boolean element) {
        array = java.util.Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        return array;
    }

    public static int[] appendIntToExistingArray(int[] array, int element) {
        array = java.util.Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        return array;
    }

    // bubble sort
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // remove duplicates
    public static int[] removeDuplicates(int[] originArray, int n) {
        int length = originArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (originArray[i] == originArray[j]) {
                    originArray[j] = originArray[length - 1];
                    length--;
                    j--;
                }
            }
        }

        return java.util.Arrays.copyOf(originArray, length);

    }
}
