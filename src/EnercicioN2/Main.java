package EnercicioN2;

public class Main {

	public static void main(String[] args) {
		
		Smartphone iphone = new Smartphone("Iphone", "6s");
		Smartphone samsung = new Smartphone("Galaxi", "S21");
		
		System.out.println("Telefono " + iphone.marca + " " + iphone.modelo);
		
		if(iphone.validarNumero("664446610")) {
			iphone.llamar("664446610");
		}else {
			System.out.println("El numero Introducido es incorrecto");
		}
		
		iphone.fotografiar();
		iphone.alarma();
		
		System.out.println("\n");
		
		System.out.println("Telefono " + samsung.marca + " " + samsung.modelo);
		
		if(samsung.validarNumero("664446610")) {
			samsung.llamar("664446610");
		}
		samsung.fotografiar();
		samsung.alarma();
		

	}

}
