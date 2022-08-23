package Vererbung;

public abstract class Medien implements MedienPlayer {
    protected String name;
    protected String path;
    protected int filesize;
    public Medien(String name, String path, int filesize) {
        this.name = name;
        this.path = path;
        this.filesize = filesize;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize=filesize;
    }
}
