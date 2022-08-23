package Vererbung;

public class Audio_Medien extends Medien{
    public double Laenge;

    public Audio_Medien(String name, String path, int filesize, double Laenge) {
        super(name, path, filesize);
        this.Laenge = Laenge;
    }

    public double getLaenge() {
        return Laenge;
    }

    public void setLaenge(double laenge) {
        Laenge = laenge;
    }

    @Override
    public void play() {

    }
}
