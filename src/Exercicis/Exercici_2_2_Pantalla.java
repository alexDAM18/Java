package Exercicis;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercici_2_2_Pantalla extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JLabel et_f = new JLabel("Fitxer:");
	JTextField fitxer = new JTextField(25);
	JButton obrir = new JButton("Obrir");
	JButton guardar = new JButton("Guardar");
	JLabel et_a = new JLabel("Contingut:");
	JTextArea area = new JTextArea(10, 50);
	JScrollPane scrollPane = new JScrollPane(area);

	// en iniciar posem un contenidor per als elements anteriors
	public void iniciar() {
		getContentPane().setLayout(new GridLayout(2, 1));
		setTitle("Editor de text");

		JPanel panell1 = new JPanel(new GridLayout(0, 1));
		JPanel panell1_1 = new JPanel(new FlowLayout());
		panell1.add(panell1_1);
		panell1_1.add(et_f);
		panell1_1.add(fitxer);

		JPanel panell1_2 = new JPanel(new FlowLayout());
		panell1.add(panell1_2);
		panell1_2.add(obrir);
		panell1_2.add(guardar);
		JPanel panell2 = new JPanel(new GridLayout(0, 1));
		panell2.add(scrollPane);
		area.setEditable(true);

		getContentPane().add(panell1);
		getContentPane().add(panell2);
		setVisible(true);
		pack();
		obrir.addActionListener(this);
		guardar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == obrir) {

			// Controlamos que no se introduce texto
			if (fitxer.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this, "No has introducido ningún fichero", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {

				try {
					BufferedReader f_ent = new BufferedReader(new FileReader(fitxer.getText()));
					String cad = f_ent.readLine();
					area.setText("");
					while (cad != null) {
						area.append(cad + "\n");
						cad = f_ent.readLine();

					}

					f_ent.close();

				} catch (FileNotFoundException e1) {
					JOptionPane.showMessageDialog(this, "El fichero no existe", "Error", JOptionPane.ERROR_MESSAGE);
				} catch (IOException e2) {
					JOptionPane.showMessageDialog(this, "Error de lectura", "Error", JOptionPane.ERROR_MESSAGE);

				}
			}
		}

		if (e.getSource() == guardar) {

			// Controlamos que introducimos texto en el buscador
			if (fitxer.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this, "No has introducido ningún fichero", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {

				try {

					PrintWriter f_eix = new PrintWriter(new FileWriter(fitxer.getText()));

					f_eix.println(area.getText());

					f_eix.close();

				} catch (IOException e1) {
					JOptionPane.showMessageDialog(this, "Error de escritura", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			}


	}
}