//Thread Methods

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
		}
	
	public void run() {
		int count=0;
		while(true) {
			System.out.println(count++);
			try {
			Thread.sleep(100);
		    }
			catch(InterruptedException e) {
				System.out.println(e);
			}
	}
}
}
public class ThreaddTest {

	public static void main(String[] args) {
		MyThread t = new MyThread("My Thread 1");
		t.start();
//		System.out.println("ID " +t.getId());
//		System.out.println("Name " +t.getName());
//		System.out.println("Priority " +t.getPriority());
//		System.out.println("State " +t.getState());
//		System.out.println("Alive " + t.isAlive());
	}
}

