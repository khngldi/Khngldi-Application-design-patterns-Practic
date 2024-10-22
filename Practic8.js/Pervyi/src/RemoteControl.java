import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;
    private List<String> commandLog;

    public RemoteControl() {
        this.commandLog = new ArrayList<>();
    }

    public void setCommands(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pressOnButton() {
        if (onCommand != null) {
            onCommand.execute();
            logCommand("On");
        } else {
            System.out.println("Ошибка: Команда для включения не назначена.");
        }
    }

    public void pressOffButton() {
        if (offCommand != null) {
            offCommand.execute();
            logCommand("Off");
        } else {
            System.out.println("Ошибка: Команда для выключения не назначена.");
        }
    }

    public void pressUndoButton() {
        if (onCommand != null) {
            onCommand.undo();
            logCommand("Undo");
        } else {
            System.out.println("Ошибка: Команда для отмены не назначена.");
        }
    }

    private void logCommand(String commandType) {
        commandLog.add(commandType);
        System.out.println("Команда '" + commandType + "' выполнена.");
    }

    public void showCommandLog() {
        System.out.println("\nИстория команд:");
        for (String log : commandLog) {
            System.out.println(log);
        }
    }
}
