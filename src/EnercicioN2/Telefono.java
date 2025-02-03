package EnercicioN2;

public class Telefono {

	protected String marca;
	protected String modelo;
	
	
	public Telefono(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	public boolean validarNumero(String numero) {
		
		return numero.matches("\\d{9}");
	}
	
	protected String numero;
	public void llamar(String numero) {
		this.numero = 	numero;			
		System.out.println("Llamando al numero " + numero + "..." );

	}
	
}
