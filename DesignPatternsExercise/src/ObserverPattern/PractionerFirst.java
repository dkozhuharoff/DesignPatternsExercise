package ObserverPattern;

public class PractionerFirst implements PractionerObserver {
    @Override
    public void doExercise(String exercise) {
        System.out.println("First practioner did " + exercise + " succesfully !");
    }
}
