// https://exercism.org/tracks/java/exercises/annalyns-infiltration/edit
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        boolean knightIsAwake;
        boolean archerIsAwake;
        boolean prisonerIsAwake;
        boolean petDogIsPresent;

        System.out.println();
        System.out.println("--- Task 1: Check if a fast attack can be made ---");
        System.out.print("Is the knight awake (true/false)? " );   
        knightIsAwake = scanner.nextBoolean();
        System.out.println("A fast attack can be made: " + AnnalynsInfiltration.canFastAttack(knightIsAwake));
        System.out.println();

        System.out.println("--- Task 2 Check if the group can be spied upon ---");
        System.out.print("Is the knight awake (true/false)? " );   
        knightIsAwake = scanner.nextBoolean();
        System.out.print("Is the archer awake (true/false)? " );   
        archerIsAwake = scanner.nextBoolean();
        System.out.print("Is the prisoner awake (true/false)? " );   
        prisonerIsAwake = scanner.nextBoolean();
        System.out.println("The group can be spied upon: " + AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println();

        System.out.println("--- Task 3: Check if the prisoner can be signalled ---");
        System.out.print("Is the archer awake (true/false)? " );   
        archerIsAwake = scanner.nextBoolean();
        System.out.print("Is the prisoner awake (true/false)? " );   
        prisonerIsAwake = scanner.nextBoolean();
        System.out.println("The prisoner can be signalled: " + AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println();

        System.out.println("--- Task 4: Check if the prisoner can be freed ---");
        System.out.print("Is the knight awake (true/false)? " );   
        knightIsAwake = scanner.nextBoolean();
        System.out.print("Is the archer awake (true/false)? " );   
        archerIsAwake = scanner.nextBoolean();
        System.out.print("Is the prisoner awake (true/false)? " );   
        prisonerIsAwake = scanner.nextBoolean();
        System.out.print("Is the dog present (true/false)? " );   
        petDogIsPresent = scanner.nextBoolean();
        System.out.println("The prisoner can be freed: " + AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
        System.out.println();
    }
}