package CommandPattern;

public class ExercisePerformer {
    private String name;

    public ExercisePerformer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void layDown() {
        System.out.println(name + " is laying down.");
    }

    public void standUp() {
        System.out.println(name + " is standing up.");
    }
}
