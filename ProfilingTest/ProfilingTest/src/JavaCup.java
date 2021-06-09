import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaCup {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        temp();
        eval(i, j, k);
    }
    public static void eval(int i, int j, int k)
    {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k)
        {
            System.out.println("YES");
        }
        else { System.out.println("NO"); }
    }

    public static void appendToFile(String fileName, List<Integer> arr) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            for (int a: arr) {
                out.write(String.valueOf(a));
            }
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }

    public static void temp() {
        for (int i = 0; i < 10000; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j < 20000; j++) {
                arr.add(i + j);
            }
            appendToFile("temp.txt", arr);
        }
    }
}
