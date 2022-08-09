// https://exercism.org/tracks/java/exercises/lasagna
public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public Integer expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method (use "int")
    public int remainingMinutesInOven(int timeInOven) {
        return expectedMinutesInOven() - timeInOven;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    //TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int timeInOven) {
        return  (layers * 2) + timeInOven;
    }
    
    //(#¹) My way of solving Task 4, but the Exercise website didn't accept it. So I did it in the way explicitly requested in the question.
    // public int totalTimeInMinutes(int preparationTimeInMinutes, int timeInOven) {
    //     return  preparationTimeInMinutes + timeInOven;
    // }
}
