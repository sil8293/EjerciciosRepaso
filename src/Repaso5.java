/*
 * Repaso 5 añade soporte al programa para poder escuchar 
 * los clic del ratón
 * Lo que hará es cambiar el color de relleno aleatoriamente de un 
 * rectángulo
 * cada vez que se pulse clic
 */


import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;


public class Repaso5 extends acm.program.GraphicsProgram{

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
		if(evento.getButton()==MouseEvent.BUTTON1){
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
		
		}
	}
}
