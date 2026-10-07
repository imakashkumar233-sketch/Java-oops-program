import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        while (b < n)
        { 
            int c = a + b;
            a = b;
            b = c;
        }
        if (b == n)
            System.out.println(n + " is a Fibonacci number.");
        else
            System.out.println(n + " is not a Fibonacci number.");
    }
}