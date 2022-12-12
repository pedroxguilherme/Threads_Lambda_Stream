package synchronized1;

public class Synchronized0 {
	static int i  = -1;
	static int j;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Meurunnable runnable = new Meurunnable();
		
		Thread t0 = new Thread(runnable);
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}




public static class Meurunnable implements Runnable{

	@Override
	public void run() {
		
		synchronized(this) {
		i++;
		j = i * 2;
		}
		double jelevado = Math.pow(j, 100);
		double raiz = Math.sqrt(jelevado);
		System.out.println(raiz);
	
	}
	
	
	
}
}