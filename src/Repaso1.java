/*
 * Repaso1: pinta un rect�ngulo en la esquina superior izquierda
 */
//importamos la libreria acm para los objetos gr�ficos
import acm.graphics.*;


public class Repaso1  extends acm.program.GraphicsProgram{

	// declaro una variable de instancia para guadar el rect�ngulo
	// es decir desde aqui se puede puede ver en todos lados 
	//es decir da igual el metodo

	//clase:Grect variable:rectangulo

	GRect rectangulo;


	// recuerda que el init se ejecuta siempre antes que el run
	public void init(){
		//cambia el tama�o de pantalla
		setSize(800,600);
		//el primer parametro es el ancho
		//el segundo el alto
		// los dos ultimos la posicion x e y
		rectangulo= new GRect(120,80);
	}
	public void run(){
		//a�ado el objeto GRect al lienzo para que se muestre 
		// si mo especifico la posicion aparace en (0,0)
		add (rectangulo);
	}


}
