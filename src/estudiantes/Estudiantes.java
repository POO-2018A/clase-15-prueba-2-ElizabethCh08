package estudiantes;

import java.util.Objects;

public class Estudiantes {
    private String nombre;
    private Materias materias;
    private int edad;


    public Estudiantes(String nombre, Materias materias, int edad) {
        this.nombre = nombre;
        this.materias = materias;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +" "+ "Edad: " + edad +" "+  "Materias: "
                + materias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiantes)) return false;
        Estudiantes that = (Estudiantes) o;
        return edad == that.edad &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(materias, that.materias);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, materias, edad);
    }
}
