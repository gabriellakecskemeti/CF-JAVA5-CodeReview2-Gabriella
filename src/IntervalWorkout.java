import java.sql.SQLOutput;
import java.util.ArrayList;

public class IntervalWorkout {

    ArrayList <String> intervalExercises = new ArrayList<>();
    int numOfRepetitions;
    int breakTime;                  //Break time in seconds

    public IntervalWorkout(ArrayList<String> intervalExercises, int numOfRepetitions, int breakTime) {
        this.intervalExercises = intervalExercises;
        this.numOfRepetitions = numOfRepetitions;
        this.breakTime = breakTime;
    }

    public void intervalReport(){
        System.out.println("\n***************************");
        System.out.println("Interval Workout STARTS!!!!");
        System.out.println("***************************");

        for(int i =0; i<this.numOfRepetitions;i++){
            System.out.println("==========================");
            System.out.println("ROUND "+(i+1)+":");
            for(int x=0; x<intervalExercises.size();x++){
                System.out.println(intervalExercises.get(x));
            }

            System.out.println("==========================");
            System.out.println("DO THE BREAK ("+this.breakTime+" SECONDS)");
        }

        System.out.println("***************************");
        System.out.println("CONGRATS - YOU ARE DONE !!!");
        System.out.println("***************************");
    }



    @Override
    public String toString() {
        return "IntervalWorkout{" +
                "intervalExercises=" + intervalExercises +
                ", numOfRepetitions=" + numOfRepetitions +
                ", breakTime=" + breakTime +
                '}';
    }
}
