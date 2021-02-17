public class Persona{

	private String nombre; // Atributos de clase
	private String apPaterno;
	private String apMaterno;
	private int edad;
	private String curp;

	
	public Persona(){ //Metodo Constructor
		nombre = "No asignado";
	}

	/*
	Metodo de acceso getNombre()
	para el atributo Nombre
	No recibe parametro de entrada,
	pero regresa el valor de nombre.
	*/

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String n){
		this.nombre = n;
	}

}