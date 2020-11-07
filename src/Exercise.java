


public class Exercise {

    String exerciseName;
    String description;
    int duration;                       //duration in sec.
    String position;                    //two values are possible: floor or standup


    public Exercise(String exerciseName, String description, int duration, String position) {
        this.exerciseName = exerciseName;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    public String printExercises(){
        return "\n"+this.exerciseName+"                                       " +"DURATION:  "+this.duration+"  seconds."
                +"\n---------------------------------------------------------------------------"+
                "\nDescription:  " + this.description;

    }

    @Override
    public String toString() {
        return "Exercise{" +
                "exerciseName='" + exerciseName + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", position='" + position + '\'' +
                '}';
    }
}
