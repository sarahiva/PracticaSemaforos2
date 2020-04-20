package problema;

public class BufferLimitado extends javax.swing.JFrame {
	final int size = 10; 
	double buffer[] = new double[size];
	int inBuf = 0, outBuf = 0;
	int progresobuffer = 0;
	
	SemaforoBinario mutex = new SemaforoBinario(true);
	SemaforoContador isEmpty = new SemaforoContador(0);
	SemaforoContador isFull = new SemaforoContador(size);
	
	public int getProgreso(){
		return progresobuffer;
	}
	
	public void deposit(double value)
	{
		isFull.P();								//espera si el fuffer esta lleno
			mutex.P();							//asegura la exclusion mutua
				Main_Window.CambiarSemaforo2(true);
				Main_Window.CambiarLinea1(true);
				buffer[inBuf] = value;
				inBuf = (inBuf + 1) % size;
			mutex.V();
			Main_Window.CambiarLinea1(false);
		isEmpty.V();							//notifuca a algun consumidor en espera
		Main_Window.CambiarSemaforo2(false);
		progresobuffer++;
		Main_Window.ActualizaProgreso(progresobuffer * 10); 
	}
	
	public double fetch()
	{
		double value;
		isEmpty.P();							//esperar si el buffer esta vacio
			mutex.P();							//asegura la exclusion mutua
				Main_Window.CambiarSemaforo1(true);
				Main_Window.CambiarLinea2(true);
				value = buffer[outBuf];			// lee desde el buffer
				outBuf = (outBuf+1) % size;
			mutex.V();
			Main_Window.CambiarLinea2(false);
		isFull.V();								// notifica a cualquien productor en espera
		Main_Window.CambiarSemaforo1(false);
		progresobuffer--;
		Main_Window.ActualizaProgreso(progresobuffer * 10); 
		return value;
	}
}
