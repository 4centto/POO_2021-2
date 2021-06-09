package repasobasico;
import ico.fes.dispositivos.SmartPhone;

public class RepasoBasico {
    public static void main(String[] args) {
        
        SmartPhone celular = new SmartPhone("Samsung");
        SmartPhone celular_dos = new SmartPhone("Huawei", "P40", "Gris", 5.5f);
        System.out.println(celular);
        System.out.println(celular_dos);
        
    }
}
