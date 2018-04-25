public class LampeHeller implements Command {

    private Lampe lampe;

    public LampeHeller(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.heller();
    }

    @Override
    public void undo() {
        lampe.dunkler();
    }
}
