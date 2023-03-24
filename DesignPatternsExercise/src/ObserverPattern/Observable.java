package ObserverPattern;

import java.util.LinkedList;
import java.util.List;

public class Observable {
    private List<PractionerObserver> practioners;
    private String currentExercise;

    public Observable() {
        practioners = new LinkedList<>();
    }

    public void addObserver(PractionerObserver practionerObserver) {
        practioners.add(practionerObserver);
    }

    public void callForExercise(String exercise) {
        this.currentExercise = exercise;
        notifyAllObservers();
    }
    public void notifyAllObservers() {
        for (PractionerObserver po : practioners) {
            po.doExercise(currentExercise);
        }
    }
}
