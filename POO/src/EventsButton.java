
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventsButton {
	public JButton Button() {
		JButton jbutton = new JButton("leboton");
		
		jbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("+ Click");
			}
		});
		
		return jbutton;
	}
	/*
	 * Un evento es una acción o suceso que ocurre en la aplicación que puede ser manejada con un código específico
	 * 
	 * Pregunta 5:
	 * 		Los atrivutos son propiedades de los objetos que almacenan datos mientras que los eventos son sucesos
	 * que disparan respuestas en el programa
	 */
}
