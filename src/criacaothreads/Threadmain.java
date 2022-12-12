package criacaothreads;

public class Threadmain {

	public static void main(String[] args) {

	Thread t0 = new Thread(new Meurunnable());	
		
		
		
		
  //Com lambda	
  //  Thread t0 = new Thread(() -> {System.out.println(Thread.currentThread().getName());}); 
	Thread t1 = new Thread(() -> {System.out.println(Thread.currentThread().getName());});	
	Thread t2 = new Thread(() -> {System.out.println(Thread.currentThread().getName());});	

	// inicia na mesma thread 
	// t0.run();
	
	t0.start(); // cria uma nova thread
	t1.start();
	t2.start();
	
	
	}

}
