

//Extending Thread
public class Threadd extends Thread{
	public void run() {
		int i=0;
		while(true) {
			System.out.println(i+ " Hello");
			i++;
		}
	}
	public static void main(String[] args) {
	Thread t=new Thread();
		t.start();
		
		int i=1;
		while(true) {
			System.out.println(i+" World");
		}
	}

}
