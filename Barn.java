
import animal.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Barn {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Cow> cows = new ArrayList<Cow>();
    private static ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public static void main(String[] args) {

        System.out.print("How many animals do you want to add? ");
        int num = input.nextInt();
        input.nextLine(); // consume newline

        for (int i = 0; i < num; i++) {
            System.out.print("Enter animal type (cow/chicken): ");
            String type = input.nextLine();

            if (type.equals("cow")) {
                System.out.print("Enter milk per day (liters): ");
                int milk = input.nextInt();
                input.nextLine(); // consume newline
                cows.add(new Cow(milk));
            } else if (type.equals("chicken")) {
                System.out.print("Enter egg color: ");
                String color = input.nextLine();
                chickens.add(new Chicken(color));
            } else {
                System.out.println("Unknown animal type.");
            }
        }

        System.out.println("\n--- Animal Details ---");

        for (Cow cow : cows) {
            System.out.println(cow.getDetails());
        }

        for (Chicken chicken : chickens) {
            System.out.println(chicken.getDetails());
        }

        input.close();
    }
}
