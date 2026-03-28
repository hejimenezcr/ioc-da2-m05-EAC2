package pantalla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Pantalla {

	private JFrame frmPacksmarketingJimenez;
	private JTextField textEntradaAny;
	private JTextField textDte;
	private JTextField textBase;
	private JTextField textIVA;
	private JTextField textTotal;
	private JTextField textErrorAlertes;

	// SOLUCIÓN: Declaramos los paneles aquí para que validarDades() pueda verlos
	private JPanel panel_Dades_Clilent;
	private JPanel panel_Campanya;
	private JComboBox comboBoxPackDe;
	private JComboBox comboBoxTipusDe;
	private JComboBox comboBoxGestioDeXXSS;
	private JComboBox comboBoxPublicitatSEM;

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
		frmPacksmarketingJimenez.setBounds(100, 100, 490, 716);
		frmPacksmarketingJimenez.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPacksmarketingJimenez.getContentPane().setLayout(null);

		// --- PANEL DADES CLIENT ---
		// JPanel panel_Dades_Clilent = new JPanel();
		panel_Dades_Clilent = new JPanel();
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

		// JComboBox comboBoxPackDe = new JComboBox();
		comboBoxPackDe = new JComboBox();
		comboBoxPackDe.setBounds(150, 49, 110, 20);
		comboBoxPackDe.setToolTipText("BASIC, ESTANDAR, FULL, PREMIUM");
		comboBoxPackDe.addItem("");
		comboBoxPackDe.addItem("BASIC");
		comboBoxPackDe.addItem("ESTANDAR");
		comboBoxPackDe.addItem("FULL");
		comboBoxPackDe.addItem("PREMIUM");
		panel_Dades_Clilent.add(comboBoxPackDe);

		JLabel lblTipusDe = new JLabel("Tipus de");
		lblTipusDe.setBounds(28, 83, 64, 13);
		panel_Dades_Clilent.add(lblTipusDe);

		// JComboBox comboBoxTipusDe = new JComboBox();
		comboBoxTipusDe = new JComboBox();
		comboBoxTipusDe.setBounds(150, 79, 110, 20);
		comboBoxTipusDe.setToolTipText("AUTÒNOM, PIME, GRAN EMPRESA");
		comboBoxTipusDe.addItem("");
		comboBoxTipusDe.addItem("AUTÒNOM");
		comboBoxTipusDe.addItem("PIME");
		comboBoxTipusDe.addItem("GRAN EMPRESA");
		panel_Dades_Clilent.add(comboBoxTipusDe);

		JButton btnValidar = new JButton("VALIDAR");
		btnValidar.setBounds(150, 109, 84, 20);
		panel_Dades_Clilent.add(btnValidar);

		// --- PANEL CAMPANYA ---
		// JPanel panel_Campanya = new JPanel();
		panel_Campanya = new JPanel();
		panel_Campanya.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Campanya",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Campanya.setBounds(31, 197, 339, 182);
		frmPacksmarketingJimenez.getContentPane().add(panel_Campanya);
		panel_Campanya.setLayout(null);

		JLabel lblDte = new JLabel("Dte.");
		lblDte.setBounds(28, 30, 44, 12);
		panel_Campanya.add(lblDte);

		textDte = new JTextField();
		textDte.setBounds(145, 27, 111, 18);
		panel_Campanya.add(textDte);
		textDte.setColumns(10);

		JLabel lblEuros = new JLabel("€");
		lblEuros.setBounds(271, 30, 44, 12);
		panel_Campanya.add(lblEuros);

		JLabel lblGestioDeXXSS = new JLabel("Gestio de XXSS");
		lblGestioDeXXSS.setBounds(28, 60, 94, 12);
		panel_Campanya.add(lblGestioDeXXSS);

		// JComboBox comboBoxGestioDeXXSS = new JComboBox();
		comboBoxGestioDeXXSS = new JComboBox();
		comboBoxGestioDeXXSS.setBounds(145, 55, 111, 20);
		comboBoxGestioDeXXSS.setToolTipText("Sí, No");
		comboBoxGestioDeXXSS.addItem("");
		comboBoxGestioDeXXSS.addItem("Sí");
		comboBoxGestioDeXXSS.addItem("No");
		panel_Campanya.add(comboBoxGestioDeXXSS);

		JLabel lblPublicitatsSEM = new JLabel("Publicitats SEM");
		lblPublicitatsSEM.setBounds(28, 89, 94, 12);
		panel_Campanya.add(lblPublicitatsSEM);

		// JComboBox comboBoxPublicitatSEM = new JComboBox();
		comboBoxPublicitatSEM = new JComboBox();
		comboBoxPublicitatSEM.setBounds(145, 89, 111, 20);
		comboBoxPublicitatSEM.setToolTipText("Sí, No");
		comboBoxPublicitatSEM.addItem("");
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
		textBase.setEditable(false);
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
		textIVA.setEditable(false);
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

		// --- CONFIGURACIÓN INICIAL ---
		setPanelEnabled(panel_Campanya, false);

		// --- EVENTO VALIDAR ---
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarDades();
			}
		});

		// --- EVENTO ESBORRAR TOT ---
		btnEsborrarTot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				esborrarTot();
			}
		});

		// --- EVENTO CALCULAR ---
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarICalcular();
			}
		});

		////////////// FIN DE LA CLASE PANTALLA ///////////////////////////////////

	}

	// METODO DE BORRAR TOT
	private void esborrarTot() {
		// Limpiar campos de texto
		textEntradaAny.setText("");
		textDte.setText("");
		textBase.setText("");
		textIVA.setText("");
		textTotal.setText("");
		textErrorAlertes.setText("");
		// Resetear desplegables al primer elemento ("- Selecciona -")
		comboBoxPackDe.setSelectedIndex(0);
		comboBoxTipusDe.setSelectedIndex(0);
		comboBoxGestioDeXXSS.setSelectedIndex(0);
		comboBoxPublicitatSEM.setSelectedIndex(0);
		// Restaurar estados de los paneles
		setPanelEnabled(panel_Dades_Clilent, true);
		setPanelEnabled(panel_Campanya, false);
		// Opcional: Poner el foco en el primer campo para empezar de nuevo
		textEntradaAny.requestFocus();
		// Notificar al usuario (opcional según prefieras)
		textErrorAlertes.setText("Formulari reiniciat.");
	}

	// MÉTODO DE VALIDACIÓN

	private void validarDades() {
		try {
			textErrorAlertes.setText("");
			String strAny = textEntradaAny.getText().trim();

			if (strAny.isEmpty()) {
				mostrarError(textEntradaAny, "L'antiguitat no pot estar buida.");
				return;
			}

			int antiguitat = Integer.parseInt(strAny);
			if (antiguitat < 0 || antiguitat > 150) {
				mostrarError(textEntradaAny, "Antiguitat ha de ser entre 0 i 150.");
				return;
			}

			// Validar que se haya escogido un Pack (no el índice 0)
			if (comboBoxPackDe.getSelectedIndex() == 0) {
				mostrarError(comboBoxPackDe, "Has de seleccionar un pack de serveis.");
				return;
			}

			//  Validar que se haya escogido un Tipus de Negoci (no el índice 0)
			if (comboBoxTipusDe.getSelectedIndex() == 0) {
				mostrarError(comboBoxTipusDe, "Has de seleccionar un tipus de negoci.");
				return;
			}

			// Si es correcto:
			setPanelEnabled(panel_Dades_Clilent, false);
			setPanelEnabled(panel_Campanya, true);
			textErrorAlertes.setText("Dades validades correctament.");

		} catch (NumberFormatException ex) {
			mostrarError(textEntradaAny, "L'antiguitat ha de ser un número enter.");
		}
	}

	// VALIDAR CALCULO
		private void validarICalcular() {
			try {
				textErrorAlertes.setText("");
				String strDte = textDte.getText().trim();

				if (strDte.isEmpty()) {
					mostrarError(textDte, "Has d'introduir un descompte (0 si no n'hi ha).");
					return;
				}

				double dte = Double.parseDouble(strDte);
				if (dte < 0) {
					mostrarError(textDte, "El descompte no pot ser negatiu.");
					return;
				}
				
				// Validar que se haya escogido un Gestio de XXSS (no el índice 0)
				if (comboBoxGestioDeXXSS.getSelectedIndex() == 0) {
					mostrarError(comboBoxGestioDeXXSS, "Selecciona gestió de XXSS.");
					return;
				}
				
				// Validar que se haya escogido un Publicitat SEM (no el índice 0)
				if (comboBoxPublicitatSEM.getSelectedIndex() == 0) {
					mostrarError(comboBoxPublicitatSEM, "Selecciona publicitat SEM.");
					return;
				}

				// Si tot és correcte, executem la funció de càlcul de dalt
				executarCalculs(dte);

			} catch (NumberFormatException ex) {
				mostrarError(textDte, "El descompte ha de ser un número vàlid.");
			}
		}
		
		// METODO DE EXECUTAR CALCULOS
		private void executarCalculs(double descompte) {
			try {
				// 1. Determinar Preu Base segons el Pack
				double preuBase = 0;
				String pack = comboBoxPackDe.getSelectedItem().toString();

				if (pack.equals("BASIC"))
					preuBase = 200;
				else if (pack.equals("ESTANDAR"))
					preuBase = 450;
				else if (pack.equals("FULL"))
					preuBase = 800;
				else if (pack.equals("PREMIUM"))
					preuBase = 1200;

				// 2. Factor Antiguitat
				int antiguitat = Integer.parseInt(textEntradaAny.getText().trim());
				double factorAntiguitat = (antiguitat < 10) ? 1.0 : 0.9;

				// 3. Factor Tipus de Negoci
				double factorNegoci = 1.0;
				String tipus = comboBoxTipusDe.getSelectedItem().toString();

				if (tipus.equals("AUTÒNOM"))
					factorNegoci = 0.8;
				else if (tipus.equals("PIME"))
					factorNegoci = 1.0;
				else if (tipus.equals("GRAN EMPRESA"))
					factorNegoci = 1.2;

				// 4. Calcular preu amb factors
				double preuAmbFactors = preuBase * factorAntiguitat * factorNegoci;

				// 5. Serveis Addicionals
				double serveisExtra = 0;
				if (comboBoxGestioDeXXSS.getSelectedItem().toString().equals("Sí")) {
					serveisExtra += 150;
				}
				if (comboBoxPublicitatSEM.getSelectedItem().toString().equals("Sí")) {
					serveisExtra += 250;
				}

				// 6. Preu Abans d'Impostos (Base * factors + extres - descompte)
				double preuAbansImpostos = preuAmbFactors + serveisExtra - descompte;
				if (preuAbansImpostos < 0)
					preuAbansImpostos = 0; // Evitar preus negatius

				// 7. Calcular IVA (21%)
				double iva = preuAbansImpostos * 0.21;

				// 8. Calcular TOTAL
				double total = preuAbansImpostos + iva;

				// 9. MOSTRAR RESULTATS (formatats a 2 decimals)
				textBase.setText(String.format("%.2f", preuAbansImpostos));
				textIVA.setText(String.format("%.2f", iva));
				textTotal.setText(String.format("%.2f", total));

				textErrorAlertes.setText("Càlcul realitzat correctament.");

			} catch (Exception e) {
				textErrorAlertes.setText("Error crític en el càlcul.");
			}
		}
	
	
	

	

	

	// MÉTODO DE MOSTRAR ERROR
	private void mostrarError(Component c, String msg) {
		textErrorAlertes.setText(msg);
		c.requestFocus();
		if (c instanceof JTextField) {
			((JTextField) c).selectAll();
		}
	}

	private void setPanelEnabled(JPanel panel, boolean estado) {
		panel.setEnabled(estado);
		for (Component c : panel.getComponents()) {
			c.setEnabled(estado);
		}
	}
}
