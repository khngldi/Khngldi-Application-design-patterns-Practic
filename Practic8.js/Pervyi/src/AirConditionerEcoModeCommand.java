public class AirConditionerEcoModeCommand implements Command {
    private AirConditioner ac;

    public AirConditionerEcoModeCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.setEcoMode();
    }

    @Override
    public void undo() {
        System.out.println("Отмена режима экономии энергии.");
    }
}
