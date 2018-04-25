

// Invoker

public class Taste {

    private Command command;

    public Taste(Command command) {
        this.command = command;
    }

    public void gedrueckt(){
        command.execute();
    }

    public void gedruecktUndo(){
        command.undo();
    }
}
