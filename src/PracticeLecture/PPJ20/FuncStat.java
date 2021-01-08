package PracticeLecture.PPJ20;

public class FuncStat {
    public static int fiboR(int n) {
        if (n <= 1)
            return n;
        else
            return fiboR(n - 1) + fiboR(n - 2);
    }

    public static int fiboI(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static int factR(int n) {
        if (n >= 1)
            return n * factR(n - 1);
        else
            return 1;
    }

    public static int factI(int n) {
        int res = 1;
        for (int j = 1; j <= n; j++)
            res *= j;
        return res;
    }

    public static int gcdI(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static int gcdR(int a, int b) {
        if (b != 0)
            return gcdR(b, a % b);
        else
            return a;
    }

    public static int maxElem(int[] arr, int from) {
        if (from == arr.length - 1) return arr[from];
        else if (from >= arr.length) return 0;
        return Math.max(arr[from], maxElem(arr, from + 1));
    }

    public static int numEven(int[] arr, int from, int sum) {
        if (from == arr.length - 1) {
            return (arr[from] % 2 == 1) ? sum : sum + 1;
        } else if (from >= arr.length) return 0;
        if (arr[from] % 2 == 0) sum++;
        return numEven(arr, from + 1, sum);

    }

    public static void reverse(int[] arr, int from) {
        if (from < arr.length / 2) {
            int temp = arr[from];
            arr[from] = arr[arr.length - 1 - from];
            arr[arr.length - 1 - from] = temp;
            reverse(arr, from + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fiboI(5));
        System.out.println(fiboR(5));
        System.out.println(factR(5));
        System.out.println(factI(5));
        System.out.println(gcdI(8, 4));
        System.out.println(gcdR(4, 8));

    }
}
