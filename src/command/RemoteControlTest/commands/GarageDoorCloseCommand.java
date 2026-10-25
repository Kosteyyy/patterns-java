package commands;

import devices.GarageDoor;
import core.Command;

public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public void execute() {
        garageDoor.down();
    }

    public void undo() {
        garageDoor.up();
    }
}