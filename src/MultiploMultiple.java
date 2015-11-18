
public class MultiploMultiple extends acm.program.ConsoleProgram {
	
	public void run() {
		println(menorPor10(3));
		println(menorPor10(10));
		println(menorPor10(15));
	
	}
	
	private boolean menorPor10 (int n1) {
		
		if((n1 % 3) ==0 &&(n1 % 5) == 0){
			return false;
		}
		
		
		if((n1 % 3) == 0||(n1 % 5) == 0){
			return true;
		}
		return false;
	}
	

}
