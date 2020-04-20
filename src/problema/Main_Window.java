package problema;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_Window {

	private JFrame frame;
	public static JLabel Sem1Verde;
	public static JLabel Sem1Rojo;
	public static JLabel Sem2Verde;
	public static JLabel Sem2Rojo;
	public static JLabel sem3Verde;
	public static JLabel Sem3Rojo;
	public static JProgressBar progressBar;
	public static JLabel line_sem11;
	public static JLabel line_sem12;
	public static JLabel line_sem21;
	public static JLabel line_sem22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Window window = new Main_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 684, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("No. Productos:");
		label.setBounds(150, 10, 76, 22);
		frame.getContentPane().add(label);
		
		JSpinner spinnerNumPro = new JSpinner();
		spinnerNumPro.setModel(new SpinnerNumberModel(new Integer(15), new Integer(0), null, new Integer(0)));
		spinnerNumPro.setBounds(230, 12, 50, 22);
		frame.getContentPane().add(spinnerNumPro);
		
		JLabel lblNoConsumo = new JLabel("No. Consumo:");
		lblNoConsumo.setBounds(10, 10, 68, 22);
		frame.getContentPane().add(lblNoConsumo);
		
		JSpinner spinnerNumCon = new JSpinner();
		spinnerNumCon.setModel(new SpinnerNumberModel(new Integer(6), new Integer(0), null, new Integer(1)));
		spinnerNumCon.setBounds(85, 12, 50, 20);
		frame.getContentPane().add(spinnerNumCon);
		
		JLabel lblTiempoProduccion = new JLabel("Tiempo Produccion:");
		lblTiempoProduccion.setBounds(310, 10, 99, 22);
		frame.getContentPane().add(lblTiempoProduccion);
		
		JSpinner TiemPro = new JSpinner();
		TiemPro.setModel(new SpinnerNumberModel(new Integer(4000), new Integer(10), null, new Integer(1)));
		TiemPro.setBounds(410, 10, 60, 22);
		frame.getContentPane().add(TiemPro);
		
		JLabel lblTiempoConsumo = new JLabel("Tiempo Consumo:");
		lblTiempoConsumo.setBounds(480, 10, 92, 22);
		frame.getContentPane().add(lblTiempoConsumo);
		
		JSpinner spinnerTiemCon = new JSpinner();
		spinnerTiemCon.setModel(new SpinnerNumberModel(new Integer(200), new Integer(10), null, new Integer(1)));
		spinnerTiemCon.setBounds(570, 10, 50, 22);
		frame.getContentPane().add(spinnerTiemCon);
		
		JLabel lblProcesoConsumidor = new JLabel("PROCESO CONSUMIDOR");
		lblProcesoConsumidor.setBounds(113, 88, 149, 14);
		frame.getContentPane().add(lblProcesoConsumidor);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(105, 110, 82, 88);
		frame.getContentPane().add(lblNewLabel);
		
		Sem1Verde = new JLabel("");
		Sem1Verde.setBackground(Color.LIGHT_GRAY);
		Sem1Verde.setOpaque(true);
		Sem1Verde.setBounds(207, 120, 25, 25);
		frame.getContentPane().add(Sem1Verde);
		
		Sem1Rojo = new JLabel("");
		Sem1Rojo.setBackground(Color.LIGHT_GRAY);
		Sem1Rojo.setOpaque(true);
		Sem1Rojo.setBounds(207, 155, 25, 25);
		frame.getContentPane().add(Sem1Rojo);
		
		JLabel lblProcesoProductor = new JLabel("PROCESO PRODUCTOR");
		lblProcesoProductor.setBounds(487, 88, 133, 14);
		frame.getContentPane().add(lblProcesoProductor);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(Color.BLUE);
		label_1.setOpaque(true);
		label_1.setBounds(534, 110, 86, 88);
		frame.getContentPane().add(label_1);
		
		Sem2Verde = new JLabel("");
		Sem2Verde.setBackground(Color.LIGHT_GRAY);
		Sem2Verde.setOpaque(true);
		Sem2Verde.setBounds(490, 120, 25, 25);
		frame.getContentPane().add(Sem2Verde);
		
	    Sem2Rojo = new JLabel("");
		Sem2Rojo.setBackground(Color.LIGHT_GRAY);
		Sem2Rojo.setOpaque(true);
		Sem2Rojo.setBounds(490, 156, 25, 25);
		frame.getContentPane().add(Sem2Rojo);
		
		progressBar = new JProgressBar();
		progressBar.setBackground(Color.YELLOW);
		progressBar.setBounds(165, 271, 360, 35);
		frame.getContentPane().add(progressBar);
		
		sem3Verde = new JLabel("");
		sem3Verde.setBackground(Color.LIGHT_GRAY);
		sem3Verde.setOpaque(true);
		sem3Verde.setBounds(348, 330, 25, 25);
		frame.getContentPane().add(sem3Verde);
		
		Sem3Rojo = new JLabel("");
		Sem3Rojo.setBackground(Color.LIGHT_GRAY);
		Sem3Rojo.setOpaque(true);
		Sem3Rojo.setBounds(348, 364, 25, 25);
		frame.getContentPane().add(Sem3Rojo);
		
		JButton Iniciar = new JButton("Inicia");
		Iniciar.setBackground(new Color(240, 240, 240));
		Iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numc = (int)spinnerNumCon.getValue();
				int nump = (int)spinnerNumPro.getValue();
				int tiemC = (int)spinnerTiemCon.getValue();
				int tiemP = (int)TiemPro.getValue();
				
				BufferLimitado buffer = new BufferLimitado();
				Productor productor = new Productor(buffer, nump, tiemP);
				Consumidor consumidor = new Consumidor(buffer, numc, tiemC);
				progressBar.setValue(buffer.getProgreso() * 100);
			}
		});
		Iniciar.setBounds(309, 124, 89, 23);
		frame.getContentPane().add(Iniciar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(197, 113, 46, 85);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(Color.ORANGE);
		label_2.setOpaque(true);
		label_2.setBounds(478, 113, 46, 85);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBackground(Color.ORANGE);
		label_3.setOpaque(true);
		label_3.setBounds(338, 318, 46, 80);
		frame.getContentPane().add(label_3);
		
		line_sem21 = new JLabel("");
		line_sem21.setBackground(Color.DARK_GRAY);
		line_sem21.setOpaque(true);
		line_sem21.setBounds(570, 198, 7, 150);
		frame.getContentPane().add(line_sem21);
		
		line_sem11 = new JLabel("");
		line_sem11.setBackground(Color.DARK_GRAY);
		line_sem11.setOpaque(true);
		line_sem11.setBounds(125, 198, 7, 178);
		frame.getContentPane().add(line_sem11);
		
		line_sem22 = new JLabel("");
		line_sem22.setBackground(Color.DARK_GRAY);
		line_sem22.setOpaque(true);
		line_sem22.setBounds(383, 340, 193, 7);
		frame.getContentPane().add(line_sem22);
		
		line_sem12 = new JLabel("");
		line_sem12.setBackground(Color.DARK_GRAY);
		line_sem12.setOpaque(true);
		line_sem12.setBounds(125, 375, 212, 7);
		frame.getContentPane().add(line_sem12);
	}
	
	public static void ActualizaProgreso(int i){
		progressBar.setValue(i);
	}
	
	public static void CambiarSemaforo1(boolean val){
		if(val == true){
			Sem1Verde.setBackground(Color.GREEN);
			Sem1Rojo.setBackground(Color.GRAY);
		}else{
			Sem1Verde.setBackground(Color.GRAY);
			Sem1Rojo.setBackground(Color.RED);
		}
	}
	
	public static void CambiarSemaforo2(boolean val){
		if(val == true){
			Sem2Verde.setBackground(Color.GREEN);
			Sem2Rojo.setBackground(Color.GRAY);
		}else{
			Sem2Verde.setBackground(Color.GRAY);
			Sem2Rojo.setBackground(Color.RED);
		}
	}
	
	public static void CambiarSemaforo3(boolean val){
		if(val == true){
			sem3Verde.setBackground(Color.GREEN);
			Sem3Rojo.setBackground(Color.GRAY);
		}else{
			sem3Verde.setBackground(Color.GRAY);
			Sem3Rojo.setBackground(Color.RED);
		}
	}
	
	public static void CambiarLinea1(boolean val){
		if(val == true){
			line_sem11.setBackground(Color.RED);
			line_sem12.setBackground(Color.RED);
			Sem3Rojo.setBackground(Color.RED);
		}else{
			line_sem11.setBackground(Color.DARK_GRAY);
			line_sem12.setBackground(Color.DARK_GRAY);
			Sem3Rojo.setBackground(Color.GRAY);
		}
	}
	
	public static void CambiarLinea2(boolean val){
		if(val == true){
			line_sem21.setBackground(Color.RED);
			line_sem22.setBackground(Color.RED);
			sem3Verde.setBackground(Color.RED);
		}else{
			line_sem21.setBackground(Color.DARK_GRAY);
			line_sem22.setBackground(Color.DARK_GRAY);
			sem3Verde.setBackground(Color.GRAY);
		}
	}
}
