package problema;
import java.util.Random;

public class Productor implements Runnable{
	BufferLimitado b = null;
	int num_productos = 0;
	int t_produccion =  0;
	
	public Productor(BufferLimitado initb, int num_pro, int t_pro)
	{
		b = initb;
		num_productos = num_pro;
		t_produccion = t_pro;
		new Thread(this).start();
	}
	
	public void run()
	{
		double item;
		Random r = new Random();
		int i = 0;
		while(i < num_productos){
			item = r.nextDouble();
			System.out.println("Articulo producido " + item);
			b.deposit(item);
			Main_Window.CambiarSemaforo2(true);
			Util.mySleep(t_produccion);
			Main_Window.CambiarSemaforo2(false);
			i++;
			if(i == (num_productos-1)){
				Main_Window.CambiarLinea2(true);
			}
		}
	}
}
