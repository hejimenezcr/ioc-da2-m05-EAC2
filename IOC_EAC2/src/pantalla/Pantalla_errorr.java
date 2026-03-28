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
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Pantalla_errorr {

	private JFrame frmPacksmarketingJimenez;
	private JTextField textEntradaAny;
	private JTextField textDte;
	private JTextField textBase;
	private JTextField textIVA;
	private JTextField textTotal;
	private JTextField textErrorAlertes;

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_errorr window = new Pantalla_errorr();
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
	public Pantalla_errorr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPacksmarketingJimenez = new JFrame();
		frmPacksmarketingJimenez.setTitle("PacksMarketing Jimenez");
		frmPacksmarketingJimenez.setResizable(false);
		frmPacksmarketingJimenez.setBounds(100, 100, 490, 716);
		frmPacksmarketingJimenez.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPacksmarketingJimenez.getContentPane().setLayout(null);

		// --- PANEL DADES CLIENT ---
		JPanel panel_Dades_Clilent = new JPanel();
		panel_Dades_Clilent.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Dades Clients", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Dades_Clilent.setBounds(31, 28, 339, 149);
		frmPacksmarketingJimenez.getContentPane().add(panel_Dades_Clilent);
		panel_Dades_Clilent.setLayout(null);

		JLabel lblAntiguitat = new JLabel("Antiguitat");
		lblAntiguitat.setBounds(28, 23, 64, 13);
		panel_Dades_Clilent.add(lblAntiguitat);

		textEntradaAny = new JTextField();
		textEntradaAny.setBounds(150, 20, 84, 19);
		panel_Dades_Clilent.add(textEntradaAny);
		textEntradaAny.setColumns(10);

		JLabel lblAny = new JLabel("any");
		lblAny.setBounds(271, 23, 34, 13);
		panel_Dades_Clilent.add(lblAny);

		JLabel lblPackDe = new JLabel("Pack de");
		lblPackDe.setBounds(28, 56, 64, 13);
		panel_Dades_Clilent.add(lblPackDe);

		JComboBox comboBoxPackDe = new JComboBox();
		comboBoxPackDe.setBounds(150, 49, 110, 20);
		comboBoxPackDe.addItem("BASIC");
		comboBoxPackDe.addItem("ESTANDAR");
		comboBoxPackDe.addItem("FULL");
		comboBoxPackDe.addItem("PREMIUM");
		panel_Dades_Clilent.add(comboBoxPackDe);

		JLabel lblTipusDe = new JLabel("Tipus de");
		lblTipusDe.setBounds(28, 83, 64, 13);
		panel_Dades_Clilent.add(lblTipusDe);

		JComboBox comboBoxTipusDe = new JComboBox();
		comboBoxTipusDe.setBounds(150, 79, 110, 20);
		comboBoxTipusDe.addItem("INDIVIDUAL");
		comboBoxTipusDe.addItem("EMPRESA");
		panel_Dades_Clilent.add(comboBoxTipusDe);

		// --- BOTÓN VALIDAR (Ahora sí puede ver todos los componentes) ---

		JButton btnValicar = new JButton("VALIDAR");
		btnValicar.setBounds(150, 109, 84, 20);
		panel_Dades_Clilent.add(btnValicar);

		// --- PANEL CAMPANYA ---
		JPanel panel_Campanya = new JPanel();
		panel_Campanya.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Campanya",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Campanya.setBounds(31, 197, 339, 182);
		frmPacksmarketingJimenez.getContentPane().add(panel_Campanya);
		panel_Campanya.setLayout(null);

		JLabel lblDte = new JLabel("Dte.");
		lblDte.setBounds(28, 25, 50, 20);
		panel_Campanya.add(lblDte);

		textDte = new JTextField();
		textDte.setBounds(145, 26, 80, 20);
		panel_Campanya.add(textDte);
		textDte.setColumns(10);

		JLabel lblEuros = new JLabel("€");
		lblEuros.setBounds(271, 30, 44, 12);
		panel_Campanya.add(lblEuros);
		
		JLabel lblGestioDeXXSS = new JLabel("Gestio de XXSS");
		lblGestioDeXXSS.setBounds(28, 60, 94, 12);
		panel_Campanya.add(lblGestioDeXXSS);
		
		JComboBox comboBoxGestioDeXXSS = new JComboBox();
		comboBoxGestioDeXXSS.setBounds(145, 55, 111, 20);
		comboBoxGestioDeXXSS.addItem("Sí");
		comboBoxGestioDeXXSS.addItem("No");
		panel_Campanya.add(comboBoxGestioDeXXSS);
		
		JLabel lblPublicitatsSEM = new JLabel("Publicitats SEM");
		lblPublicitatsSEM.setBounds(28, 89, 94, 12);
		panel_Campanya.add(lblPublicitatsSEM);

		JComboBox comboBoxPublicitatSEM = new JComboBox();
		comboBoxPublicitatSEM.setBounds(145, 89, 111, 20);
		comboBoxPublicitatSEM.addItem("Sí");
		comboBoxPublicitatSEM.addItem("No");
		panel_Campanya.add(comboBoxPublicitatSEM);
		
		JButton btnEsborrarTot = new JButton("ESBORRAR TOT");
		btnEsborrarTot.setBounds(131, 119, 148, 20);
		panel_Campanya.add(btnEsborrarTot);

		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(145, 149, 111, 20);
		panel_Campanya.add(btnCalcular);

		// --- PANEL PREUS ---
		JPanel panel_PREUS = new JPanel();
		panel_PREUS.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "PREUS",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_PREUS.setBounds(31, 403, 339, 130);
		frmPacksmarketingJimenez.getContentPane().add(panel_PREUS);
		panel_PREUS.setLayout(null);

		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(28, 29, 44, 12);
		panel_PREUS.add(lblBase);

		textBase = new JTextField();
		textBase.setBounds(28, 51, 96, 18);
		panel_PREUS.add(textBase);
		textBase.setColumns(10);
		
		JLabel lblPreuBaseEuros = new JLabel("€");
		lblPreuBaseEuros.setBounds(134, 54, 25, 12);
		panel_PREUS.add(lblPreuBaseEuros);
		
		JLabel lblIVA = new JLabel("IVA");
		lblIVA.setBounds(179, 29, 44, 12);
		panel_PREUS.add(lblIVA);

		textIVA = new JTextField();
		textIVA.setColumns(10);
		textIVA.setBounds(179, 51, 96, 18);
		panel_PREUS.add(textIVA);

		JLabel lblPreuEurosIVA = new JLabel("€");
		lblPreuEurosIVA.setBounds(285, 54, 25, 12);
		panel_PREUS.add(lblPreuEurosIVA);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTotal.setBounds(70, 90, 44, 12);
		panel_PREUS.add(lblTotal);

		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textTotal.setText("");
			}
		});
		textTotal.setBounds(134, 87, 96, 18);
		panel_PREUS.add(textTotal);
		textTotal.setColumns(10);

		JLabel lblTotalEuro = new JLabel("€");
		lblTotalEuro.setBounds(240, 90, 25, 12);
		panel_PREUS.add(lblTotalEuro);
		
		// --- PANEL ERRORS ---
		JPanel panel_Errors_Alertes = new JPanel();
		panel_Errors_Alertes.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Error i Alertes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Errors_Alertes.setBounds(31, 551, 339, 57);
		frmPacksmarketingJimenez.getContentPane().add(panel_Errors_Alertes);
		panel_Errors_Alertes.setLayout(null);

		textErrorAlertes = new JTextField();
		textErrorAlertes.setEditable(false);
		textErrorAlertes.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textErrorAlertes.setText("");
			}
		});
		textErrorAlertes.setBounds(28, 20, 287, 18);
		panel_Errors_Alertes.add(textErrorAlertes);
		textErrorAlertes.setColumns(10);
	}

	/**
	 * Muestra el error, da el foco y selecciona el contenido según punto 101 y 144
	 */
	/*
	 * private void lanzarError(Component componente, String mensaje) {
	 * textErrorAlertes.setText(mensaje); componente.requestFocus(); if (componente
	 * instanceof JTextField) { ((JTextField) componente).selectAll(); } }
	 */

	/**
	 * Habilita o deshabilita un panel y todos sus hijos (Botones, Combos, etc.)
	 */
	/*
	 * private void setComponentesEnabled(JPanel panel, boolean estado) {
	 * panel.setEnabled(estado); for (Component c : panel.getComponents()) {
	 * c.setEnabled(estado); } }
	 */
}




/*
 * //Accion del boton btnValicar.addActionListener(e -> { try { // limpiar error
 * previos textErrorAlertes.setText(""); // validar antiguedad (entre 0-150),
 * positivo) int antiguitat = Integer.parseInt(textEntradaAny.getText());
 * 
 * if (antiguitat < 0 || antiguitat > 150) { lanzarError(textEntradaAny,
 * "L'antiguitat introduïda no és correcta (nombre enter entre 0 i 150).");
 * return; }
 * 
 * // Validaciones correctas SI TODO ES CORRECTO:
 * setComponentesEnabled(panel_Dades_Clilent, false);
 * //setComponentesEnabled(panel_Campanya, true);
 * textErrorAlertes.setText("Validació correcta.");
 * 
 * } catch (NumberFormatException ex) { lanzarError(textEntradaAny,
 * "L'antiguitat ha de ser un nombre enter sense decimals."); } });
 */