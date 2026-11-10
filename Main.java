
import java.util.Scanner;

class Workout {
    String type;
    int duration;
    void showWorkout() {
        System.out.println("Workout: " + type);
        System.out.println("Duration:" + duration + " minutes");
    }
}

class RunningWorkout extends Workout {
    double distance;

    void showDetails() {
        showWorkout();
        System.out.println("Distance:" + distance + " km");
        System.out.println("Calories burned: " + (distance * 60));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RunningWorkout run = new RunningWorkout();
        System.out.print("Enter workout type: ");
        run.type = input.nextLine();
        System.out.print("Enter duration (minutes):");
        run.duration = input.nextInt();
        System.out.print("Enter distance (km): ");
        run.distance = input.nextDouble();
        System.out.println("Workout Summary ");
        run.showDetails();

        input.close();
    }
}
