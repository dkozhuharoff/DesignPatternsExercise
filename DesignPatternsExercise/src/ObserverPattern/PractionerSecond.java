package ObserverPattern;

public class PractionerSecond implements PractionerObserver {
    @Override
    public void doExercise(String exercise) {
        System.out.println("Second practioner did " + exercise + " succesfully !");
    }
}
