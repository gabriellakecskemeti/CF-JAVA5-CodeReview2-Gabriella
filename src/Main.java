
import java.util.*;


public class Main {

    public static void main(String[] args) {

        ArrayList <Exercise> allExercises = new ArrayList<>();

        allExercises.add(new Exercise("Push-up      ","Place your hands on the floor. Raise up onto your toes so that all of your body weight\n" +
                "is on your hands and your feet. Bend your elbows and lower your chest down toward the floor.\n" +
                "Then, push off the floor and extend them so that you return to the starting position.",30,"floor"));

        allExercises.add(new Exercise("Plank        ","Start on the floor on your hands and knees. Lower your forearms to the floor with\n" +
                "elbows positioned under your shoulders and your hands shoulder-width apart. \n" +
                "Maintain a straight line from heels through the top of your head, \n" +
                "looking down at the floor. Now, tighten your abs and hold.",90,"floor"));

        allExercises.add(new Exercise("Squats       ","Stand with feet a little wider than shoulder-width apart,\n" +
                "hips stacked over knees, and knees over ankles.\n" +
                "Extend arms out straight so they are parallel with the ground, palms facing down.\n" +
                "Goto a squat and exhale, then explode back up to standing.",45,"standup"));

        allExercises.add(new Exercise("Backward Kick","Get in an all-fours position with your knees and hands on the floor.\n" +
                "Your back is straight. Lift your leg up, and straighten it. \n" +
                "Form a 90 degree angle in the ankle.  \n" +
                "Raise your leg with your heel pushing \n" +
                "up and constantly forming a 90 degree angle in between the legs. \n" +
                "Return to the starting position and repeat.",60,"floor"));

        allExercises.add(new Exercise("Quad Stretch ", "Stand upright. Shift your weight to  one feet and pull another heel toward \n" +
                "your buttocks.\n" +
                "Stay for 15 seconds, then repeat with your other leg.",90,"standup"));

        allExercises.add(new Exercise("Side Bends   ","Stand with your feet aligned with your hips. As you exhale, lift your right\n" +
                "hand over your head, bringing it to the left side. As you do this, bend your\n" +
                "waist towards the left as well.Repeat with other hand. ",60,"standup"));


        for (Exercise element: allExercises) {
            int i= allExercises.indexOf(element);
            System.out.println(allExercises.get(i).printExercises());
        }


        System.out.println("\n************Exercises that are on the floor***********************");
        for (Exercise element: allExercises) {
            int i= allExercises.indexOf(element);
            if (element.position.equals("floor")) {
                System.out.println(allExercises.get(i).printExercises());
            }
        }

        System.out.println("\n************Exercises that are on the floor and take more than a minute**************");
        for (Exercise element: allExercises) {
            int i= allExercises.indexOf(element);
            if (element.position.equals("floor") && element.duration>60) {
                System.out.println(allExercises.get(i).printExercises());
            }
        }

        //----------IntervalWorkout----------------------------------
        ArrayList<String> interval = new ArrayList<String>();
        interval.add(allExercises.get(0).exerciseName);
        interval.add(allExercises.get(2).exerciseName);
        interval.add(allExercises.get(1).exerciseName);


        IntervalWorkout IW1 = new IntervalWorkout(interval,3,60);
        IW1.intervalReport();

    }

}
