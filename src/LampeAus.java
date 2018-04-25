public class LampeAus implements Command {

    private Lampe lampe;

    public LampeAus(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.aus();
    }

    @Override
    public void undo() {
        lampe.an();
    }
}
