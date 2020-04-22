/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author pller
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author pller
 */
public class MainWindow2 {

	private JFrame frmProjetapplication;
	private JTextField txtNom;
	private JTextField txtAdresse;
	private JTextField txtAge;

	/**
	 * Launch the application.
	 */
	public static void CreateWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProjetapplication = new JFrame();
		frmProjetapplication.setTitle("Projet_Application");
		frmProjetapplication.setBounds(100, 100, 700, 500);
		frmProjetapplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProjetapplication.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 266, 439);
		frmProjetapplication.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRsultat = new JLabel("R\u00E9sultat");
		lblRsultat.setHorizontalAlignment(SwingConstants.CENTER);
		lblRsultat.setBounds(10, 0, 246, 40);
		panel.add(lblRsultat);
		
		txtNom = new JTextField();
		txtNom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtNom.setText("");
			}
		});
		txtNom.setText("Nom");
		txtNom.setBounds(304, 113, 321, 37);
		frmProjetapplication.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtAdresse = new JTextField();
		txtAdresse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtAdresse.setText("");
			}
		});
		txtAdresse.setText("Adresse ");
		txtAdresse.setBounds(304, 161, 321, 37);
		frmProjetapplication.getContentPane().add(txtAdresse);
		txtAdresse.setColumns(10);
		
		
		JLabel lblAjouterUneDonnee = new JLabel("Ajouter une donn\u00E9e");
		lblAjouterUneDonnee.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjouterUneDonnee.setBounds(304, 11, 321, 40);
		frmProjetapplication.getContentPane().add(lblAjouterUneDonnee);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO Action quand on clique sur le bouton.
			}
		});
		btnNewButton.setBounds(304, 386, 321, 43);
		frmProjetapplication.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxPatient = new JCheckBox("Homme");
		chckbxPatient.setBounds(304, 83, 97, 23);
		frmProjetapplication.getContentPane().add(chckbxPatient);
		
		JCheckBox chckbxHpital = new JCheckBox("Femme");
		chckbxHpital.setBounds(528, 83, 97, 23);
		frmProjetapplication.getContentPane().add(chckbxHpital);
		
		JLabel lblSlectionnerLeType = new JLabel("S\u00E9lectionner le type de lit requis");
		lblSlectionnerLeType.setBounds(304, 287, 321, 14);
		frmProjetapplication.getContentPane().add(lblSlectionnerLeType);
		
		txtAge = new JTextField();
		txtAge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtAge.setText("");
			}
		});
		txtAge.setText("Date de naissance (jj/mm/yyyy)");
		txtAge.setBounds(304, 209, 321, 40);
		frmProjetapplication.getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(304, 312, 321, 43);
		frmProjetapplication.getContentPane().add(scrollPane);
		JList<String> list = new JList<String>();
		scrollPane.setViewportView(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Soins intensifs", "Soins paliatifs", "Traumatologie", "Autre"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
