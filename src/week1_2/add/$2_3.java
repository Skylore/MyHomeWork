package week1_2.add;
  //count 'a' in line
import java.util.Scanner;

public class $2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word ");
        String line = scanner.next();

        System.out.println("Quantity of 'a' in this word is: " + count(line));
    }

    public static int count(String line) {

        char[] chMas = line.toCharArray();
        int size = chMas.length;

        int counter = 0;

        for (int i = 0; i < size; i++) {
            if (chMas[i] == 'a' || chMas[i] == 'A')
                counter += 1;
        }

        return counter;
    }
}
