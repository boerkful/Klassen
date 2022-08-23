package Vererbung;

public class Film extends Visuelle_Medien{
    public int Filmdauer;


    public Film(String name, String path, String Bildformat, Integer Aufloesung, int filesize, int Filmdauer){
        super(name, path, Bildformat, Aufloesung, filesize);
        this.Filmdauer = Filmdauer;
    }
    public void setFilmdauer(int Filmdauer){
        this.Filmdauer = Filmdauer;
    }
    public int getFilmdauer(){
        return Filmdauer;
    }
    @Override
    public  void play(){

    }
}
