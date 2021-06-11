package repasobasico;
import ico.fes.dispositivos.SmartPhone;

public class RepasoBasico {
    public static void main(String[] args) {
        
        SmartPhone celular = new SmartPhone("Samsung");
        SmartPhone celular_dos = new SmartPhone("Huawei", "P40", "Gris", 5.5f);
        System.out.println(celular);
        System.out.println(celular_dos);
        
        //Uso de metodos de acceso
        celular.setModelo("Galaxy Note S10");
        System.out.println(celular);
        
        //Uso de un atributo no protegido
        celular.tamanio = 626.5f;
        System.out.println(celular);
        
    }
}
