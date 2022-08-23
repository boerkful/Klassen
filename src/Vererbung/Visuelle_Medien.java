package Vererbung;

public class Visuelle_Medien extends Medien{
    public String Bildformat;
    public Integer Aufloesung;
    
    public Visuelle_Medien(String name, String path, String Bildformat, Integer Aufloesung, int filesize) {
        super(name, path, filesize);
        this.Bildformat= Bildformat;
        this.Aufloesung=Aufloesung;
    }

    public String getBildformat() {
        return Bildformat;
    }

    public Integer getAufloesung() {
        return Aufloesung;
    }

    public void setBildformat(String bildformat) {
        Bildformat = bildformat;
    }

    public void setAufloesung(Integer aufloesung) {
        Aufloesung = aufloesung;
    }

    @Override
    public void play() {

    }
}
