package CommandPattern;

public class StandUp implements Exercise {
    private ExercisePerformer exercisePerformer;

    public StandUp(ExercisePerformer exercisePerformer) {
        this.exercisePerformer = exercisePerformer;
    }
    @Override
    public void execute() {
        exercisePerformer.standUp();
    }

    @Override
    public String getStringNameOfExercise() {
        return "stand up";
    }
}
