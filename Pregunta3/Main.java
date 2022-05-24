package Pregunta3;

public class Main {
    public static void main(String[] args) {
        ClienteControlador clienteControlador = new ClienteControlador(1);

        System.out.println(clienteControlador.listarCliente());

        clienteControlador.agregarCliente(new Cliente("Jean Pierre","Vasquez","Hurtado",71240978));

        for (Cliente cliente: clienteControlador.listarCliente())
        {
            System.out.println(cliente.getNombre()+" "+cliente.getApePat()+" "+cliente.getApeMat()+" "+cliente.getDni());
        }
    }
}
