public class LampeAn implements Command {

    private Lampe lampe;

    public LampeAn(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.an();
    }

    @Override
    public void undo() {
        lampe.aus();
    }
}
