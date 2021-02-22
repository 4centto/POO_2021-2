
package mx.unam.aragon.fes;

public class Persona {
    
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private String curp;

    public Persona() {
        this.nombre = "No asignado";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "\n\ttapPaterno=" + apPaterno + "\n\tapMaterno=" + apMaterno + "\n\tedad=" + edad + "\n\tcurp=" + curp + "}";
    }
    
}
