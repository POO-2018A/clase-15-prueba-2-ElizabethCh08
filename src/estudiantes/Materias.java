package estudiantes;

public class Materias {
    private String nombreMaterias;
    private int nivel;

    public Materias(String nombreMaterias, int nivel) {
        this.nombreMaterias = nombreMaterias;
        this.nivel = nivel;
    }

    public String getNombreMaterias() {
        return nombreMaterias;
    }

    public void setNombreMaterias(String nombreMaterias) {
        this.nombreMaterias = nombreMaterias;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return  nombreMaterias + nivel;}
}
