/*
 * Autor : Silvia Sassa
 * ********************
 * tiene que dibujar con la esquina superior izquierda tiene que estar en el centro de la pantalla
 * 
 */
import acm.graphics.*;


public class Repaso3 extends acm.program.GraphicsProgram{
	
	 //declaro una variable de instacia para almacenar el rect�ngulo
	//como es de instancia, se ve el init y desde el run
	
	GRect rectangulo;
	
	
	 //declaro otra variable de instancia que guardar� el punto X de la
	//pantalla en que empezar� a pintarse el rect�ngulo
	int anchoRectangulo = 120;
	int altoRectangulo = 80;
	int distanciaX;
	int distanciaY;
	
	public void init(){
		
		// cambio el tama�o de la pantalla
		
		setSize (800,600);
		
		// creo un rect�ngulo de 120 de ancho po 80 de alto
		  
		rectangulo= new GRect(anchoRectangulo,altoRectangulo);
		add(rectangulo);
		
	}
	public void run(){
		// divido el ancho de la pantalla en 2 para saber donde est� la mitad
		// exacta de la pantalla
		distanciaX= getWidth()/2;
		// divido el alto de la pantalla en 2 para saber donde est� la mitad
		// exacta de la pantalla
		distanciaY= getHeight()/2;
		
		rectangulo.setLocation(distanciaX-anchoRectangulo/2,distanciaY-altoRectangulo/2);
	}
	
	

}
