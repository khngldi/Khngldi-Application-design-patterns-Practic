public class AirConditionerOffCommand implements Command {
    private AirConditioner ac;

    public AirConditionerOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }

    @Override
    public void undo() {
        ac.on();
    }
}
