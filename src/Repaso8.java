/*
 * Repaso 7 cuando se hace clic en un rectangulo central, genera un nuevo
 * rectangulo aleatorio
 */


import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;


public class Repaso8 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para guardar el rectangulo	
	GRect rectangulo;

	//declaro una variable de instancia de tipo aleatorio
	RandomGenerator aleatorio =new RandomGenerator();


	public void init(){
		/// cambio el tama�o de la pantalla
		setSize(800,600);

		//crear el rect�ngulo
		rectangulo =new GRect (120,80);

		// inserto el "escuchador" del rat�n
		addMouseListeners();
	}


	public void run(){
		//a�ado al rect�ngulo en el centro de la pantalla
		//alto de la pantalla entre dos menos el alto del rectangulo
		//asi comoel ancho para que quede totalment centrado
		add(rectangulo,
				getWidth()/2-rectangulo.getWidth()/2,
				getHeight()/2-rectangulo.getHeight()/2);

	}

	//a�ado el m�todo que escucha el evento del clic del rat�n

	public void mouseClicked(MouseEvent evento){

		// si en ka posicion em la que se ha hecho clic
		//est� el rectangulo entonces lo relleno
		// la funcion se llama getElementAt

		if(getElementAt(evento.getX(),evento.getY())==rectangulo){
			rectangulo.setFilled(true);
			rectangulo.setFillColor(aleatorio.nextColor());
			//double distanciaAlCentroDelRectangulo=evento.getX()-rectangulo.getX();

			if(getElementAt(evento.getX()-rectangulo.getWidth()/2,evento.getY())==rectangulo){
				
				rectangulo.move(10,0);
			}
			else{
				
				rectangulo.move(-10,0);
			}

		}


	}
}
