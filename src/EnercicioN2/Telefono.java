package EnercicioN2;

public class Telefono {

	protected String marca;
	protected String modelo;
	boolean tiene_letra = false;
	
	public Telefono(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
	}
	
	protected String numero;
	public void llamar(String numero) {
		this.numero = 	numero;
		
		
		for(int i=0; i<numero.length(); i++) {
			
			char letra = numero.charAt(i);
			if(Character.isLetter(letra)) {
				tiene_letra = true;
				break;
			}
			
		}
		
		if(tiene_letra) {
			System.out.println("El numero Introducido es incorrecto");
		}else {
			
			System.out.println("Llamando al numero " + numero + "..." );
		}
		
		
		
	}
	
}
