package prc;

public class Vehiculo {
	private int numPuertas;
	private int numRuedas;

	public	Vehiculo(int numPuertas, int numRuedas)	{
	this.numPuertas	=numPuertas;
	this.numRuedas=numRuedas;
}
	
	
	public	void showinfo()	{
	System.out.println("Soy un vehiculo");
	}

}