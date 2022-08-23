public class Handy {
    public String Brand;
    public double Bildschirmdiagonale;
    public String Betriebssystem;
    public static int AnzahlLockButtons = 1;

    public void setBetriebssystem(String betriebssystem) {
        Betriebssystem = betriebssystem;
    }
    public static int getAnzahlLockButtons(){
        return AnzahlLockButtons;
    }

    Handy(String Brand, double Bildschirmdiagonale, String Betriebssystem){
        this.Brand = Brand;
        this.Bildschirmdiagonale = Bildschirmdiagonale;
        this.Betriebssystem = Betriebssystem;
    }
    public static void main(String[] args){
        Handy handy1 = new Handy ("Samsung", 6.5, "Android");
    }
}
