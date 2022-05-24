package Pregunta4;

public class MainDeparta {
    public static void main(String[] args) {

        Departameno departameno = new Departameno("Departamento: Huanuco");

        System.out.println(departameno.getNombre());


        departameno.agregarProvincia(new Provincia(" Ambo"));
        departameno.agregarProvincia(new Provincia(" Dos de Mayo"));


        for (Provincia provincia: departameno.mostrarProvincia())
        {
            System.out.println("Provincia :"+provincia.getNombre());
        }


        departameno.agregarDistrito(new Distrito("La union"));
        departameno.agregarDistrito(new Distrito("La union"));
        for (Distrito distrito: departameno.mostrarDistrito())
        {
            System.out.println("Distrito :"+distrito.getNombre());
        }


        System.out.println("----------");

    }
}
