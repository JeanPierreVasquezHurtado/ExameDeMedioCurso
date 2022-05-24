package Pregunta5;

public class Cliente {

    private String nombre;
    private Carro[] carro;
    private int contador;

    public String getNombre() {
        return nombre;
    }

    public Cliente(String nombre)
    {
        this.nombre= nombre;
        this.carro= new Carro[5];
        this.contador = 0;
    }

    public void agregarCarro(Carro carro){
        this.carro[this.contador]= carro;
        this.contador++;
    }
    public Carro[] mostrarCarro(){
        return this.carro;
    }
}
