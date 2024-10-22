public class TelevisionOnCommand implements Command {
    private Television tv;

    public TelevisionOnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
