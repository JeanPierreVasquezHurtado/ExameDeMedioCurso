package Pregunta3;

public class ClienteControlador {

    public Cliente cliente[];
    public int contador;

    public ClienteControlador(int contador) {
        this.contador = 0;
        this.cliente = new Cliente[5];
    }

    public void agregarCliente(Cliente cliente){
        this.cliente[this.contador] = cliente;
        this.contador++;
    }

    public Cliente[] listarCliente()
    {
        return this.cliente;
    }
    public void buscarCLiente()
    {

    }
    public void editarCliente()
    {

    }
    public void eliminarCliente()
    {

    }
}
