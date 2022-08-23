public class Auto {
    public static int AnzahlReifen = 4;  //Statisches Feld
    private String Lackfarbe;            // Feld
    public int AnzahlTueren;

    public static int getAnzahlReifen(){        //static methode
        return AnzahlReifen;
    }
    public void setLackfarbe(String Farbe){     //methode
        Lackfarbe = Farbe;
    }

    Auto(String Lackfarbe, int AnzahlTueren){
        this.Lackfarbe = Lackfarbe;
        this.AnzahlTueren = AnzahlTueren;

    }
    public static void main(String[] args){
        Auto auto1 = new Auto("Rot",5);
    }
}
