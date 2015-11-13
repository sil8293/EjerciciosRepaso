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
		/// cambio el tamaño de la pantalla
		setSize(800,600);

		//crear el rectángulo
		rectangulo =new GRect (120,80);

		// inserto el "escuchador" del ratón
		addMouseListeners();
	}


	public void run(){
		//añado al rectángulo en el centro de la pantalla
		//alto de la pantalla entre dos menos el alto del rectangulo
		//asi comoel ancho para que quede totalment centrado
		add(rectangulo,
				getWidth()/2-rectangulo.getWidth()/2,
				getHeight()/2-rectangulo.getHeight()/2);

	}

	//añado el método que escucha el evento del clic del ratón

	public void mouseClicked(MouseEvent evento){

		// si en ka posicion em la que se ha hecho clic
		//está el rectangulo entonces lo relleno
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
