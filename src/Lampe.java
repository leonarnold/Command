
// Receiver

public class Lampe {

    private int volume = 0;


    public void an() {
        System.out.println("TV ist an");
    }


    public void aus() {
        System.out.println("TV ist aus");
    }


    public void heller() {
        volume++;
        System.out.println("Helligkeit ist bei " + volume);
    }


    public void dunkler() {
        volume--;
        System.out.println("Helligkeit ist bei " + volume);
    }
}
