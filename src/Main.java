import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;

        System.out.print("What is your age?: ");

        age = in.nextInt();
        in.nextLine();
        if (age >= 21)
        {
            System.out.println("You get a wrist band!");
        }

    }
}