public class CommandPatternExample {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand("on", turnOnCommand);
        remoteControl.setCommand("off", turnOffCommand);

        // Pressing the buttons
        remoteControl.pressButton("on");
        remoteControl.pressButton("off");

        // Trying an unknown command
        remoteControl.pressButton("unknown");
    }
}
