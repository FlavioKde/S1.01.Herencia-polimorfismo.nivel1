package S101HerenciaPolimorfismoNivel1;

public class Wind extends Instrument {

    public Wind(String name, double price){
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");
    }

    @Override
    public String toString() {
        return "Wind: " +"\n" + super.toString();
    }
}
