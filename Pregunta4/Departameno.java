package Pregunta4;

public class Departameno {

    private String nombre;
    private Provincia[] provincia;
    private Distrito[] distrito;
    private int contador;
    private int contador2;

    public String getNombre() {
        return nombre;
    }

    public Departameno(String nombre)
    {
        this.nombre= nombre;
        this.provincia = new Provincia[2];
        this.distrito = new  Distrito[2];
        this.contador = 0;
        this.contador2 = 0;
    }

    public void agregarProvincia(Provincia provincia)
    {
        this.provincia[this.contador]= provincia;
        this.contador++;
    }

    public void agregarDistrito(Distrito distrito)
    {
        this.distrito[this.contador2]= distrito;
        this.contador2++;
    }

    public Provincia[] mostrarProvincia()
    {
        return this.provincia;
    }

    public Distrito[] mostrarDistrito()
    {
        return this.distrito;
    }
}
