package problema;

public class Consumidor implements Runnable {
	BufferLimitado b = null;
	
	public Consumidor(BufferLimitado initb)
	{
		b = initb;
		new Thread(this).start();
	}
	
	public void run()
	{
		double item;
		while(true){
			item = b.fetch();
			System.out.println("Articulo extraido " + item);
			Util.mySleep(200);
		}
	}
}
