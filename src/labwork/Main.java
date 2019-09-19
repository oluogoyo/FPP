package labwork;

public class Main {

	public static void main(String[] args) {
		
		Accountlab a1 = new Accountlab("01","first acc",null, 100.0);
		
		a1.MakeDeposite(10000);
		System.out.println("new account:"+ a1.getBalance());
        a1.WithDraw(200);
        System.out.println("new account:" +a1.getBalance());
        
			
		}


	}


