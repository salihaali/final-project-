import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> eventName() {
        System.out.println("Please enter event name: ");
        Scanner scanner = new Scanner(System.in);
        String event = scanner.nextLine();
        ArrayList<String> events = new ArrayList<>();
        events.add(event);
        return events;
    }

    public static ArrayList<String> eventDate() {
        System.out.println("Please enter event date: ");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        ArrayList<String> dates = new ArrayList<>();
        dates.add(date);
        return dates;
    }

    public static void choose(int n) {
        if (n == 1) {
            eventName();

            eventDate();

        } else if (n == 2) {
            System.out.println("Daily schedule");

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter: " + "\n" + "1 - Create an event; 2 - Daily schedule; 3 - Search  event: ");

        int n = scanner.nextInt();
        choose(n);

       // System.out.println("Your appointment details : " + events.get(0) + " on " +dates.get(0) );


    }
}