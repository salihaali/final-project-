import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        //Creating list of events
        List<calendarEvents> event = new ArrayList<calendarEvents>();
        //Creating events
        calendarEvents b1 = new calendarEvents(01, "java lecture", 12, 13, "nothing");
        calendarEvents b2 = new calendarEvents(02, "Dentist appointment", 14, 15, "yes");
        calendarEvents b3 = new calendarEvents(03, "school attendance", 17, 18, "no");
        //Adding Books to list
        event.add(b1);
        event.add(b2);
        event.add(b3);
        //Traversing list
        for (calendarEvents c : event) {
            System.out.println(c.date + " " + c.event + " " + c.time + " " + c.endTime + " " + c.notes);
        }
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}