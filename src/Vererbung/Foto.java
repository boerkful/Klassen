package Vererbung;

public class Foto extends Visuelle_Medien{

    public String Kameramodell;
    public String AufnahmeDatum;
    public double Blendenzahl;
    public Foto(String name, String path, String Bildformat, Integer Aufloesung, int filesize, String Kameramodell, String AufnahmeDatum, double Blendenzahl) {
        super(name, path, Bildformat, Aufloesung, filesize);
        this.Kameramodell = Kameramodell;
        this.AufnahmeDatum= AufnahmeDatum;
        this.Blendenzahl= Blendenzahl;
    }

    public String getKameramodell() {
        return Kameramodell;
    }

    public void setKameramodell(String kameramodell) {
        Kameramodell = kameramodell;
    }

    public String getAufnahmeDatum() {
        return AufnahmeDatum;
    }

    public void setAufnahmeDatum(String aufnahmeDatum) {
        AufnahmeDatum = aufnahmeDatum;
    }

    public double getBlendenzahl() {
        return Blendenzahl;
    }

    public void setBlendenzahl(double blendenzahl) {
        Blendenzahl = blendenzahl;
    }

    @Override
    public void play() {

    }
}
