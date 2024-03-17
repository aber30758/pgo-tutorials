import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Provide a number");
        Scanner sc = new Scanner(System.in);
        int var1 = sc.nextInt();

        if (var1 == 0) {
            System.out.println("The value equals 0");
        } else if (var1 > 0) {
            System.out.println("The value is positive");
        }
        else if (var1<0){ System.out.println("The value is negative");}


    };}