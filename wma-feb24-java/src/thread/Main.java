package thread;

public class Main implements Runnable{

	public void run() {
		System.out.println("this code is running is a thread");
	}
	
	
	public static void main(String[] args) {
		Main m=new Main();
		m.run();
		
	}
	
}
