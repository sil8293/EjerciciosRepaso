
public class DigitoIgual extends acm.program.ConsoleProgram {

	public void run() {
		println(digitoIgual(12,23));
		println(digitoIgual(12,43));
		println(digitoIgual(12,44));
	
	}
		

	private boolean digitoIgual (int n1, int n2) {
		if(n1/10==n2/10||n1/10==n2%10||n1%10==n2/10||n1%10==n2%10){
			return true;
		}
		return false;
	}
}
