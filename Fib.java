import java.util.Scanner;

public class Fib {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    String input = myScanner.nextLine();
    System.out.println(fibonacciRecursive(Integer.parseInt(input)));
  }

  public static int fibonacciRecursive (int n) {

    if (n <= 1) {
        return n;
    }
    else {
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

  }















}
