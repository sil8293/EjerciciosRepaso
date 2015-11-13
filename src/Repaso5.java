/*
 * Repaso 5 a�ade soporte al programa para poder escuchar 
 * los clic del rat�n
 * Lo que har� es cambiar el color de relleno aleatoriamente de un 
 * rect�ngulo
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
		if(evento.getButton()==MouseEvent.BUTTON1){
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
		
		}
	}
}
