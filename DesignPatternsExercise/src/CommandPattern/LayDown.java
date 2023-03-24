package CommandPattern;

public class LayDown implements Exercise {
    private ExercisePerformer exercisePerformer;

    public LayDown(ExercisePerformer exercisePerformer) {
        this.exercisePerformer = exercisePerformer;
    }
    @Override
    public void execute() {
        exercisePerformer.layDown();
    }

    @Override
    public String getStringNameOfExercise() {
        return "lay down";
    }
}
