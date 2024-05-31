import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> commands = new HashMap<>();

    public void setCommand(String commandName, Command command) {
        commands.put(commandName, command);
    }

    public void pressButton(String commandName) {
        Command command = commands.get(commandName);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Command not found");
        }
    }
}
