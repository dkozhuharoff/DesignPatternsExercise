package CommandPattern;

import ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Trainer {
    private String name;
    private List<Exercise> exercises;
    private Observable observable;

    public Trainer(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
        exercises = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public Trainer() {
        exercises = new ArrayList<>();
    }

    public void addExerciseToWorkout(Exercise exercise) {
        exercises.add(exercise);
    }

    public void callPerformer() {
        for (Exercise ex : exercises) {
            ex.execute();
            notifyPractioners(ex);
        }

        exercises.clear();
    }

    public void notifyPractioners(Exercise exercise) {
        observable.callForExercise(exercise.getStringNameOfExercise());
    }
}
