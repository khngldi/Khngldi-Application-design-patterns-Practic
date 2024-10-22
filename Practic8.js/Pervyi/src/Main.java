public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Television tv = new Television();
        AirConditioner ac = new AirConditioner();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        Command tvOn = new TelevisionOnCommand(tv);
        Command tvOff = new TelevisionOffCommand(tv);

        Command acOn = new AirConditionerOnCommand(ac);
        Command acOff = new AirConditionerOffCommand(ac);
        Command acEcoMode = new AirConditionerEcoModeCommand(ac);

        RemoteControl remote = new RemoteControl();

        remote.setCommands(lightOn, lightOff);
        System.out.println("Управление светом:");
        remote.pressOnButton();
        remote.pressOffButton();
        remote.pressUndoButton();

        remote.setCommands(tvOn, tvOff);
        System.out.println("\nУправление телевизором:");
        remote.pressOnButton();
        remote.pressOffButton();

        remote.setCommands(acOn, acOff);
        System.out.println("\nУправление кондиционером:");
        remote.pressOnButton();
        remote.setCommands(acEcoMode, null);
        remote.pressOnButton();

        Command[] partyModeCommands = { lightOn, tvOn, acOn };
        MacroCommand partyMode = new MacroCommand(partyModeCommands);

        System.out.println("\nАктивируем режим вечеринки:");
        partyMode.execute();

        System.out.println("\nОтмена режима вечеринки:");
        partyMode.undo();
    }
}
