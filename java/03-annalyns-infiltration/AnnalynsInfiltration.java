// https://exercism.org/tracks/java/exercises/annalyns-infiltration/edit
class AnnalynsInfiltration {

    // Task 1: Check if a fast attack can be made
    // Implement the (static) AnnalynsInfiltration.canFastAttack() method that takes a boolean value that indicates if the knight is awake. This method returns true if a fast attack can be made based on the state of the knight. Otherwise, returns false:
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake = true) {
          return knightIsAwake;  
        } 
        return !knightIsAwake;
    }    

    // Task 2: Check if the group can be spied upon
    // Implement the (static) AnnalynsInfiltration.canSpy() method that takes three boolean values, indicating if the knight, archer and the prisoner, respectively, are awake. The method returns true if the group can be spied upon, based on the state of the three characters. Otherwise, returns false:
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
      if (knightIsAwake || archerIsAwake || prisonerIsAwake == true) {
        return true;  
    } else {
        return false;        
    }
}    

    // Task 3: Check if the prisoner can be signalled
    // Implement the (static) AnnalynsInfiltration.canSignalPrisoner() method that takes two boolean values, indicating if the archer and the prisoner, respectively, are awake. The method returns true if the prisoner can be signalled, based on the state of the two characters. Otherwise, returns false:
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
      if (archerIsAwake == false && prisonerIsAwake == true) {
        return true;  
      } else {
        return false;        
      }
    }

    // Task 4: Check if the prisoner can be freed
    // Implement the (static) AnnalynsInfiltration.canFreePrisoner() method that takes four boolean values. The first three parameters indicate if the knight, archer and the prisoner, respectively, are awake. The last parameter indicates if Annalyn's pet dog is present. The method returns true if the prisoner can be freed based on the state of the three characters and Annalyn's pet dog presence. Otherwise, it returns false:
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
      if (knightIsAwake == true && archerIsAwake == false && petDogIsPresent == true) {
        return true;
      } else if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == false) {
        return true;
      } else {
        return false;
      }      
    }
}


