package inversiondependencia;

public class Televisor implements Interruptor{
    @Override
    public void encender() {
        System.out.println("Encendi el Televisor");
    }

    @Override
    public void apagar() {
        System.out.println("Apague el Televisor");
    }
}
