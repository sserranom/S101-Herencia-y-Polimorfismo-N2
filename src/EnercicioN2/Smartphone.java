package EnercicioN2;

public class Smartphone extends Telefono implements Camara, Reloj {

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
		
	}
	
	public void fotografiar() {
		System.out.println("Se esta haciendo una Fotografia");
	}
	
	public void alarma() {
		System.out.println("Esta sonando la Alarma");
	}

}
