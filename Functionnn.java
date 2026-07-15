import java.util.Scanner;

public class Functionnn {

    // Sum Function
    static int sum(int a, int b) {
        return a + b;
    }

    // Max Function
    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // Min Function
    static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + sum(a, b));
        System.out.println("Maximum = " + max(a, b));
        System.out.println("Minimum = " + min(a, b));

        sc.close();
    }
}