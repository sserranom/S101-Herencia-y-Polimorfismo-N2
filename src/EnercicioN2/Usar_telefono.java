package EnercicioN2;

public class Usar_telefono {

	public static void main(String[] args) {
		
		Smartphone iphone = new Smartphone("Iphone", "6s");
		Smartphone samsung = new Smartphone("Galaxi", "S21");
		
		System.out.println("Telefono " + iphone.marca + " " + iphone.modelo);
		
		iphone.llamar("664446610");
		
		iphone.fotografiar();
		
		iphone.alarma();
		
		System.out.println("\n");
		
		System.out.println("Telefono " + samsung.marca + " " + samsung.modelo);
		samsung.llamar("77777968");
		samsung.fotografiar();
		samsung.alarma();
		

	}

}
