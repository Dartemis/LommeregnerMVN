package lommeregnermvn;

import java.awt.FlowLayout;

import javax.security.auth.Subject;
import javax.swing.*;

public class Gui extends JFrame {
	JTextField showResult;
	JButton[] button;
	JButton regneregler;
	
	public Gui( String title ){
		super( title );
		
		setSize(500, 500);
		
		//SETUP CONTAINER
		getContentPane().setLayout(new FlowLayout());
		
		//SETUP INTERFACE
		setGuiSize();
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setGuiSize(){		
		//textfeldt til resultat
		showResult = new JTextField(40);
		getContentPane().add(showResult);
		
		// Knapper fra 0-9
		setButtons();
		
		// knapper til + - * / =
		regneregler = new JButton("+");
		getContentPane().add(regneregler);
		
		regneregler = new JButton("-");
		getContentPane().add(regneregler);
		
		regneregler = new JButton("x");
		getContentPane().add(regneregler);
		
		regneregler = new JButton("/");
		getContentPane().add(regneregler);
	}
	
	public void setButtons(){
		
		button = new JButton[10];
		
		for(int i=0; i < 10; i++){
			button[i] = new JButton();
			button[i].setText(Integer.toString(i));
			getContentPane().add(button[i]);
		}
	}
	

}
