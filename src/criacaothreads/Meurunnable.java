package criacaothreads;

public class Meurunnable implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName(); 
        System.out.println(name);
	}

}
