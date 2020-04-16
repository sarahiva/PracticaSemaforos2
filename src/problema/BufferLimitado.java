package problema;

public class BufferLimitado {
	int size = 10; //final
	double buffer[] = new double[size];
	int inBuf = 0, outBuf = 0;
	
	SemaforoBinario mutex = new SemaforoBinario(true);
	SemaforoContador isEmpty = new SemaforoContador(0);
	SemaforoContador isFull = new SemaforoContador(size);
	
	public void deposit(double value)
	{
		isFull.P();								//espera si el fuffer esta lleno
			mutex.P();							//asegura la exclusion mutua
				buffer[inBuf] = value;
				inBuf = (inBuf + 1) % size;
			mutex.V();
		isEmpty.V();							//notifuca a algun consumidor en espera 
	}
	
	public double fetch()
	{
		double value;
		isEmpty.P();							//esperar si el buffer esta vacio
			mutex.P();							//asegura la exclusion mutua
				value = buffer[outBuf];			// lee desde el buffer
				outBuf = (outBuf+1) % size;
			mutex.V();
		isFull.V();								// notifica a cualquien productor en espera
		return value;
	}
}
