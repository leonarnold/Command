public class MitBedienungSpielen {
    public static void main(String[] args) {

        Lampe lampe = new Lampe();

        LampeAn anCommand = new LampeAn(lampe);

        Taste tasteAnDruecken = new Taste(anCommand);

        tasteAnDruecken.gedrueckt();
        tasteAnDruecken.gedruecktUndo();

        System.out.println("##############################################");

        LampeAus ausCommand = new LampeAus(lampe);

        Taste tasteAusDruecken = new Taste(ausCommand);

        tasteAusDruecken.gedrueckt();

        System.out.println("##############################################");


        LampeHeller hellerCommand = new LampeHeller(lampe);

        Taste tasteHellerDruecken = new Taste(hellerCommand);

        tasteHellerDruecken.gedrueckt();
        tasteHellerDruecken.gedrueckt();
        tasteHellerDruecken.gedrueckt();



    }
}
