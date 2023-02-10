import java.util.Scanner;
import java.util.ArrayList;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();

    while (true) {
      System.out.print("Enter a number (0 to stop): ");
      int num = scanner.nextInt();
      if (num == 0) {
        break;
      }
      if (num % 2 == 0) {
        even.add(num);
      } else {
        odd.add(num);
      }
    }

    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + odd);
  }
}

