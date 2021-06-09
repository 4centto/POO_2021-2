package ico.fes.dispositivos;

public class SmartPhone {
    
    private String marca;
    private String color;
    private String modelo;
    private float tamanio;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String color, String modelo, float tamanio) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tamanio = tamanio;
    }

    public SmartPhone(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", tamano=" + tamanio + '}';
    }
    
    public boolean encender(){
        System.out.println("Encendiendo el equipo " + this.marca);
        return true;
    }
    
    public int llamar(int numero){
        System.out.println("Llamando al numero: " + numero);
        return 60;
    }
    
    public void tomarFoto(){
        System.out.println("Tomando foto...");
    }
    
}
