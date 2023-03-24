package ObserverPattern;

public class PractionerThird implements PractionerObserver {
    @Override
    public void doExercise(String exercise) {
        System.out.println("Third practioner did " + exercise + " succesfully !");
    }
}
