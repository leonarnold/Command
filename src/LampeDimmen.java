public class LampeDimmen implements Command {

    private Lampe lampe;

    public LampeDimmen(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.dunkler();
    }

    @Override
    public void undo() {
        lampe.heller();
    }
}
