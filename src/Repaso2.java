/*
 * 
 */
import acm.graphics.*;


public class Repaso2 extends acm.program.GraphicsProgram{
	
	 //declaro una variable de instacia para almacenar el rect�ngulo
	//como es de instancia, se ve el init y desde el run
	
	GRect rectangulo;
	
	 //declaro otra variable de instancia que guardar� el punto X de la
	//pantalla en que empezar� a pintarse el rect�ngulo
	
	int distanciaX;
	
	public void init(){
		
		// cambio el tama�o de la pantalla
		
		setSize (800,600);
		
		// creo un rect�ngulo de 120 de ancho po 80 de alto
		  
		rectangulo= new GRect(120,80);
		add(rectangulo);
		
	}
	public void run(){
		// divido el ancho de la pantalla en 2 para saber donde est� la mitad
		// exacta de la pantalla
		distanciaX= getWidth()/2;
		rectangulo.setLocation(distanciaX-80/2,0);
	}
	
	

}
