package swing;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;


public class Ventanas {
	public static void main(String[] args) {
		VentanaA ventana = new VentanaA();
		VentanaCentrada vCentro = new VentanaCentrada();
		
		System.out.println("CAMBIO PARA VER GITHUB");
		System.out.p`rintln("Cambio DESDE el editor github");
	}

	 static class VentanaA extends JFrame {
		public VentanaA() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			Toolkit pantallita = Toolkit.getDefaultToolkit();
			Dimension tamanio = pantallita.getScreenSize();
			int ancho = tamanio.width;
			int alto = tamanio.height;
			setSize(ancho, 200);
			setLocation(0, alto / 4);
			setTitle("Fatty ventana");
			Image icono = pantallita
					.getImage("C:\\Users\\jorge\\Desktop\\programas\\ventana_ancho.jpg");
			setIconImage(icono);
			
		}
	}

	 static class VentanaCentrada extends JFrame {
		public VentanaCentrada() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			Toolkit pCentro = Toolkit.getDefaultToolkit();
			
			Dimension tamanio = pCentro.getScreenSize();
			int ancho = tamanio.width;
			int alto = tamanio.height;
			setSize(300,300);
			setLocation(ancho/2, alto /2);
			setLocationRelativeTo(null);
			Image icono = pCentro
					.getImage("C:\\Users\\jorge\\Desktop\\programas\\ventana_centro.jpg");
			setIconImage(icono);
			Lamina lam = new Lamina();
			add(lam);

		}
	}
	
	static class Lamina extends JPanel{
		public void paintComponent(Graphics g){
			g.drawString("Holiis, caracoliiiss", 150, 150);
			g.drawRect(50, 50, 100, 100);
		}
		
	}
}

