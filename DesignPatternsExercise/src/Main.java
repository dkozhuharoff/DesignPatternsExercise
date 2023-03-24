import CommandPattern.*;
import ObserverPattern.Observable;
import ObserverPattern.PractionerFirst;
import ObserverPattern.PractionerSecond;
import ObserverPattern.PractionerThird;

public class Main {
    public static void main(String[] args) {
        Observable observable = new Observable();
        PractionerFirst practionerFirst = new PractionerFirst();
        observable.addObserver(practionerFirst);
        PractionerSecond practionerSecond = new PractionerSecond();
        observable.addObserver(practionerSecond);
        PractionerThird practionerThird = new PractionerThird();
        observable.addObserver(practionerThird);

        Trainer trainer = new Trainer("Arnold", observable);
        ExercisePerformer exercisePerformer = new ExercisePerformer("Evander Holyfield");
        LayDown layDownExercise = new LayDown(exercisePerformer);
        StandUp standUpExercise = new StandUp(exercisePerformer);

        trainer.addExerciseToWorkout(layDownExercise);
        trainer.addExerciseToWorkout(standUpExercise);
        trainer.addExerciseToWorkout(layDownExercise);
        trainer.addExerciseToWorkout(standUpExercise);
        trainer.callPerformer();

        System.out.println("Little pause.. 10 seconds..");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " second");
        }

        trainer.addExerciseToWorkout(layDownExercise);
        trainer.addExerciseToWorkout(standUpExercise);
        trainer.callPerformer();
    }
}