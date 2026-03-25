package pantalla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Pantalla {

	private JFrame frmPacksmarketingJimenez;
	private JTextField textEntradaAny;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla window = new Pantalla();
					window.frmPacksmarketingJimenez.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPacksmarketingJimenez = new JFrame();
		frmPacksmarketingJimenez.setTitle("PacksMarketing Jimenez");
		frmPacksmarketingJimenez.setResizable(false);
		frmPacksmarketingJimenez.setBounds(100, 100, 490, 576);
		frmPacksmarketingJimenez.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPacksmarketingJimenez.getContentPane().setLayout(null);
		
		JPanel panel_Dades_Clilent = new JPanel();
		panel_Dades_Clilent.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dades Clients", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Dades_Clilent.setBounds(31, 28, 339, 104);
		frmPacksmarketingJimenez.getContentPane().add(panel_Dades_Clilent);
		panel_Dades_Clilent.setLayout(null);
		
		JLabel lblAntiguitat = new JLabel("Antiguitat");
		lblAntiguitat.setBounds(39, 23, 43, 13);
		panel_Dades_Clilent.add(lblAntiguitat);
		
		textEntradaAny = new JTextField();
		textEntradaAny.setBounds(111, 20, 96, 19);
		panel_Dades_Clilent.add(textEntradaAny);
		textEntradaAny.setColumns(10);
		
		JLabel lblAny = new JLabel("any");
		lblAny.setBounds(236, 23, 16, 13);
		panel_Dades_Clilent.add(lblAny);
		
		JButton btnValicar = new JButton("VALIDAR");
		btnValicar.setBounds(96, 74, 84, 20);
		panel_Dades_Clilent.add(btnValicar);
		
		JPanel panel_Campanya = new JPanel();
		panel_Campanya.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Campanya", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Campanya.setBounds(31, 144, 173, 104);
		frmPacksmarketingJimenez.getContentPane().add(panel_Campanya);
		panel_Campanya.setLayout(null);
		
		JPanel panel_PREUS = new JPanel();
		panel_PREUS.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "PREUS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_PREUS.setBounds(31, 271, 173, 104);
		frmPacksmarketingJimenez.getContentPane().add(panel_PREUS);
		panel_PREUS.setLayout(null);
		
		JPanel panel_Errors_Alertes = new JPanel();
		panel_Errors_Alertes.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Error i Alertes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Errors_Alertes.setBounds(31, 400, 173, 104);
		frmPacksmarketingJimenez.getContentPane().add(panel_Errors_Alertes);
		panel_Errors_Alertes.setLayout(null);
	}
}
