
public class NumeroVanidoso extends acm.program.ConsoleProgram {
	public void run() {
		println(muyVanidoso(22));
		println(muyVanidoso(23));
		println(muyVanidoso(24));
	}

	private boolean muyVanidoso(int numero){

		if ((numero % 11) == 0 || (numero % 11) == 1){
			return true;

		}
		
		return false;

	}
}


