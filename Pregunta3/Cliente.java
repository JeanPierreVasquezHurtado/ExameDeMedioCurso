package Pregunta3;

public class Cliente {
    public String nombre;
    public String apePat;
    public String apeMat;
    public int dni;

    public Cliente(String nombre, String apePat, String apeMat, int dni) {
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApePat() {
        return apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public int getDni() {
        return dni;
    }

}
