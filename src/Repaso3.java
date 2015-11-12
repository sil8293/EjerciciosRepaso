/*
 * Autor : Silvia Sassa
 * ********************
 * tiene que dibujar con la esquina superior izquierda tiene que estar en el centro de la pantalla
 * 
 */
import acm.graphics.*;


public class Repaso3 extends acm.program.GraphicsProgram{
	
	 //declaro una variable de instacia para almacenar el rectángulo
	//como es de instancia, se ve el init y desde el run
	
	GRect rectangulo;
	
	
	 //declaro otra variable de instancia que guardará el punto X de la
	//pantalla en que empezará a pintarse el rectángulo
	int anchoRectangulo = 120;
	int altoRectangulo = 80;
	int distanciaX;
	int distanciaY;
	
	public void init(){
		
		// cambio el tamaño de la pantalla
		
		setSize (800,600);
		
		// creo un rectángulo de 120 de ancho po 80 de alto
		  
		rectangulo= new GRect(anchoRectangulo,altoRectangulo);
		add(rectangulo);
		
	}
	public void run(){
		// divido el ancho de la pantalla en 2 para saber donde está la mitad
		// exacta de la pantalla
		distanciaX= getWidth()/2;
		// divido el alto de la pantalla en 2 para saber donde está la mitad
		// exacta de la pantalla
		distanciaY= getHeight()/2;
		
		rectangulo.setLocation(distanciaX-anchoRectangulo/2,distanciaY-altoRectangulo/2);
	}
	
	

}
