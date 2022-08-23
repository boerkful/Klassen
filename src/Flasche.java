public class Flasche {
    public static String DeckelForm = "Rund" ;
    public int FlaschenVolumen;

    public static String getDeckelForm(){
        return DeckelForm;
    }
    public void SetFlaschenVolumen(int Volumen){
        FlaschenVolumen = Volumen;
    }
    Flasche(int FlaschenVolumen){
        this.FlaschenVolumen = FlaschenVolumen;
    }
    public static void main(String[] args){
        Flasche Flasche1 = new Flasche(5);
    }
}
