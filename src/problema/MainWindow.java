package problema;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Button;

public class MainWindow {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(650, 508);
		shell.setText("SWT Application");
		
		Label lblNoProduccin = new Label(shell, SWT.NONE);
		lblNoProduccin.setAlignment(SWT.CENTER);
		lblNoProduccin.setBounds(10, 6, 88, 15);
		lblNoProduccin.setText("No. Producci\u00F3n:");
		
		Spinner spinnerProduccion = new Spinner(shell, SWT.BORDER);
		spinnerProduccion.setBounds(97, 3, 47, 18);
		
		Label lblNoConsumo = new Label(shell, SWT.NONE);
		lblNoConsumo.setBounds(165, 6, 81, 15);
		lblNoConsumo.setText("No. Consumo:");
		
		Spinner spinnerConsumo = new Spinner(shell, SWT.BORDER);
		spinnerConsumo.setBounds(245, 3, 47, 18);
		
		Label lblTiemProduccin = new Label(shell, SWT.NONE);
		lblTiemProduccin.setBounds(309, 6, 100, 15);
		lblTiemProduccin.setText("Tiem. Producci\u00F3n:");
		
		Spinner spinnerTiemPro = new Spinner(shell, SWT.BORDER);
		spinnerTiemPro.setBounds(415, 3, 47, 18);
		
		Label lblTiemConsumo = new Label(shell, SWT.NONE);
		lblTiemConsumo.setBounds(488, 6, 88, 15);
		lblTiemConsumo.setText("Tiem. Consumo:");
		
		Spinner spinnerTiemCon = new Spinner(shell, SWT.BORDER);
		spinnerTiemCon.setBounds(577, 3, 47, 18);
		
		Label lblProcesoConsumidor = new Label(shell, SWT.NONE);
		lblProcesoConsumidor.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lblProcesoConsumidor.setBounds(70, 60, 156, 18);
		lblProcesoConsumidor.setText("PROCESO CONSUMIDOR");
		
		Label lblProcesoProductor = new Label(shell, SWT.NONE);
		lblProcesoProductor.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblProcesoProductor.setBounds(405, 63, 135, 15);
		lblProcesoProductor.setText("PROCESO PRODUCTOR");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblNewLabel.setBounds(70, 84, 88, 109);
		
		Label label = new Label(shell, SWT.NONE);
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		label.setBounds(438, 84, 88, 109);
		
		ProgressBar progressBuffer = new ProgressBar(shell, SWT.NONE);
		progressBuffer.setBounds(148, 326, 323, 24);
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_1.setBounds(165, 84, 47, 85);
		
		Label sem1Verde = new Label(shell, SWT.NONE);
		sem1Verde.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		sem1Verde.setBounds(175, 90, 25, 25);
		
		Label sem1Rojo = new Label(shell, SWT.NONE);
		sem1Rojo.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		sem1Rojo.setBounds(175, 123, 25, 25);
		
		Label label_1_1 = new Label(shell, SWT.NONE);
		label_1_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_1_1.setBounds(385, 84, 47, 85);
		
		Label sem2Verde = new Label(shell, SWT.NONE);
		sem2Verde.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		sem2Verde.setBounds(395, 90, 25, 25);
		
		Label sem2Rojo = new Label(shell, SWT.NONE);
		sem2Rojo.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		sem2Rojo.setBounds(395, 123, 25, 25);
		
		Label lblSemaforos = new Label(shell, SWT.NONE);
		lblSemaforos.setFont(SWTResourceManager.getFont("Segoe UI", 7, SWT.NORMAL));
		lblSemaforos.setBounds(214, 224, 66, 15);
		lblSemaforos.setText("SEMAFOROS:");
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		label_2.setBounds(220, 241, 10, 10);
		
		Label lbl = new Label(shell, SWT.NONE);
		lbl.setFont(SWTResourceManager.getFont("Segoe UI Historic", 7, SWT.NORMAL));
		lbl.setBounds(237, 239, 164, 15);
		lbl.setText("Rojo: no puede seguir trabajando");
		
		Label label_2_1 = new Label(shell, SWT.NONE);
		label_2_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		label_2_1.setBounds(220, 259, 10, 10);
		
		Label lblVerdeNoPuede = new Label(shell, SWT.NONE);
		lblVerdeNoPuede.setText("Verde: se puede seguir trabajando");
		lblVerdeNoPuede.setFont(SWTResourceManager.getFont("Segoe UI Historic", 7, SWT.NORMAL));
		lblVerdeNoPuede.setBounds(237, 257, 164, 15);
		
		Label lblCeldasDelBuffer = new Label(shell, SWT.NONE);
		lblCeldasDelBuffer.setText("CELDAS DEL BUFFER:");
		lblCeldasDelBuffer.setFont(SWTResourceManager.getFont("Segoe UI", 7, SWT.NORMAL));
		lblCeldasDelBuffer.setBounds(214, 275, 93, 15);
		
		Label label_2_2 = new Label(shell, SWT.NONE);
		label_2_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_YELLOW));
		label_2_2.setBounds(220, 292, 10, 10);
		
		Label lblCeldaConElementos = new Label(shell, SWT.NONE);
		lblCeldaConElementos.setText("Celda con elementos");
		lblCeldaConElementos.setFont(SWTResourceManager.getFont("Segoe UI Historic", 7, SWT.NORMAL));
		lblCeldaConElementos.setBounds(237, 290, 164, 15);
		
		Label label_1_2 = new Label(shell, SWT.NONE);
		label_1_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_1_2.setBounds(295, 366, 47, 85);
		
		Label sem3Verde = new Label(shell, SWT.NONE);
		sem3Verde.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		sem3Verde.setBounds(305, 372, 25, 25);
		
		Label sem3Rojo = new Label(shell, SWT.NONE);
		sem3Rojo.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		sem3Rojo.setBounds(305, 405, 25, 25);
		
		Label lblBuffer = new Label(shell, SWT.NONE);
		lblBuffer.setBounds(158, 356, 55, 15);
		lblBuffer.setText("Buffer");

	}
}
