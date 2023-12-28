package inversiondependencia;


public class Boton {
    private Interruptor interruptor;

    public Boton(Interruptor interruptor) {this.interruptor =interruptor;}

    public void pulsar(boolean presionar){
        if(presionar){
            interruptor.encender();
        } else {
            interruptor.apagar();
        }
    }
}