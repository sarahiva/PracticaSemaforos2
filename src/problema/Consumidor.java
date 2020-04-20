package problema;

public class Consumidor implements Runnable {
	BufferLimitado b = null;
	int num_consumos = 0;
	int t_consumos = 0;
	
	public Consumidor(BufferLimitado initb, int num_con, int t_con)
	{
		b = initb;
		num_consumos = num_con;
		t_consumos = t_con;
		new Thread(this).start();
	}
	
	public void run()
	{
		double item;
		int i = 0;
		while(i < num_consumos){
			item = b.fetch();
			System.out.println("Articulo extraido " + item);
			Main_Window.CambiarSemaforo1(true);
			Util.mySleep(t_consumos);
			Main_Window.CambiarSemaforo1(false);
			i++;
			if(i == (num_consumos-1)){
				Main_Window.CambiarLinea1(true);
			}
		}
	}
}
