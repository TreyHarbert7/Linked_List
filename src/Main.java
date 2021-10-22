import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) {
        LinkedList<Double> data = new LinkedList<>();

        double q = 0;

        Scanner input = new Scanner(System.in);

        while (q < 10) {
            System.out.println("please enter a decimal number: ");
            double temp = input.nextDouble();
            data.add(temp);
            q++;
        }

    System.out.println("Your list is " + data);
    System.out.println(data.size());
    }
}
