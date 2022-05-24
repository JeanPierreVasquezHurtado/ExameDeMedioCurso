package Pregunta5;

public class Carro {
    private String marca;
    private int nmrPlaca;

    public Carro(String marca, int nrmPlaca){
        this.marca = marca;
        this.nmrPlaca = nrmPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public int getNmrPlaca() {
        return nmrPlaca;
    }
}
