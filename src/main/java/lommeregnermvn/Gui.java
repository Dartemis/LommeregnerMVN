package lommeregnermvn;

import java.awt.FlowLayout;
import javax.swing.*;

public class Gui extends JFrame {
	
	public Gui( String title ){
		super( title );
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
		//SETUP INTERFACE
		setGuiSize();
		
		//SETUP CONTAINER
		getContentPane().setLayout(new FlowLayout());
		
		
		
	}
	
	public void setGuiSize(){		
		//textfeldt til resultat
		
		// Knapper fra 0-9
		
		// knapper til + - * / =
	}

}
