
public class MenorPor10 extends acm.program.ConsoleProgram {
	
	public void run() {
		println(menorPor10(1,7,11));
		println(menorPor10(1,10,7));
		println(menorPor10(11,7,1));
	
	}
	
	private boolean menorPor10 (int n1, int n2, int n3) {
		if(n1==n2+10 || n1==n3+10||n2==n1+10||n2==n3+10||n3==n1+10||n3==n2+10){
			return true;
		}
		return false;
	}

}
