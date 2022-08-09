// https://exercism.org/tracks/java/exercises/lasagna
import java.util.Scanner;

public class TimeToCook {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Lasagna lasagna = new Lasagna();
        
        System.out.println();
        System.out.println("Task 1 - Define the expected oven time in minutes");
        System.out.println(lasagna.expectedMinutesInOven());

        System.out.println("Task 2 - Calculate the remaining oven time in minutes");
        System.out.print("How long has the lasagna been in the oven? ");        
        int timeInOven = Scanner.nextInt();
        System.out.println(lasagna.remainingMinutesInOven(timeInOven));

        System.out.println("Task 3 - Calculate the preparation time in minutes");
        System.out.print("How many layers of lasagna? ");
        int layers = Scanner.nextInt();
        System.out.println(lasagna.preparationTimeInMinutes(layers));
        
        System.out.println("Task 4 - Calculate the total working time in minutes");
        System.out.println("Time spend to prepare + time at the cooking: " + lasagna.totalTimeInMinutes(layers, timeInOven));

        //(#¹) My way of solving Task 4, but the Exercise website didn't accept it. So I did it in the way explicitly requested in the question.
        // System.out.println("Time spend to prepare + time at the cooking: " + lasagna.totalTimeInMinutes(lasagna.preparationTimeInMinutes(layers), timeInOven));

    }
}