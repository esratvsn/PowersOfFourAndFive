import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);

        System.out.print("Enter a limit number:");
        int limit=inp.nextInt();

        System.out.println("Powers of 4:");
        for (int i = 4; i <= limit; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5:");
        for (int i = 5; i <= limit; i *= 5) {
            System.out.println(i);
        }
    }
}