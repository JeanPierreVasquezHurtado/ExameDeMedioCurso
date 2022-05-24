package Pregunta5;

public class MainTienda {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jean Pierre");
        System.out.println(cliente.getNombre());

        cliente.agregarCarro(new Carro("Toyota",7524124));
        cliente.agregarCarro(new Carro("Ferrari",16586523));
        cliente.agregarCarro(new Carro("Huynda",12773));
        cliente.agregarCarro(new Carro("Audi",733782));
        cliente.agregarCarro(new Carro("Lamborguini",236783));

        for (Carro carro: cliente.mostrarCarro())
        {
            System.out.println("Marca: "+carro.getMarca()+"              "+"Numero de Placa: "+carro.getNmrPlaca());
        }
        System.out.println("----------------------");

        //Si se quiere tener otro cliente con mas carros, intanciar otro objeto

        Cliente cliente1 = new Cliente("Rody");
        System.out.println(cliente1.getNombre());

        cliente1.agregarCarro(new Carro("Ford",4366223));
        cliente1.agregarCarro(new Carro("BMW",853353));
        cliente1.agregarCarro(new Carro("VolsBaguen",267613));
        cliente1.agregarCarro(new Carro("Toyota",256762));
        cliente1.agregarCarro(new Carro("Audi",53561));

        for (Carro carro: cliente1.mostrarCarro())
        {
            System.out.println("Marca: "+ carro.getMarca()+"            "+"Numero de Placa: "+carro.getNmrPlaca());
        }
        System.out.println("--------------------");

    }
}
