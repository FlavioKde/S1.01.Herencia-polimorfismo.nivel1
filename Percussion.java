package S101HerenciaPolimorfismoNivel1;

public class Percussion extends Instrument {

    public Percussion(String name, double price){
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing");
    }

    @Override
    public String toString() {
        return "Percussion: "+"\n" + super.toString();
    }
}
