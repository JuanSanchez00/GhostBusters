package GUI;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import EntidadLogica.*;
import Juego.*;

public class InterfazJuego extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazJuego frame = new InterfazJuego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazJuego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		Juego juego = new Juego();
		PortadorBeta enemigo = new PortadorBeta(juego);
		JLabel label = enemigo.getEntidadGrafica().getJLabel();
		contentPane.add(label);
		enemigo.getEntidadGrafica().setPosicionX(10);
		enemigo.getEntidadGrafica().setPosicionY(10);
		label.setBounds(10, 10, 100, 100);
		label.setIcon(enemigo.getEntidadGrafica().getImagenDefault());
		enemigo.getInteligencia().accionar();
		
	}
	
	public void removerEntidad(Entidad entidad) {
		contentPane.remove(entidad.getEntidadGrafica().getJLabel());
	}
	
}
