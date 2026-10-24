package commands;

import devices.GarageDoor;
import core.Command;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public void execute() {
        garageDoor.up();
    }
}