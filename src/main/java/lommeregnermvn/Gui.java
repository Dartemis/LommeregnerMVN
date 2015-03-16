package lommeregnermvn;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.security.auth.Subject;
import javax.swing.*;

public class Gui extends JFrame implements ActionListener {
	JTextField textfield;
	
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPlus;
	JButton buttonMinus;
	JButton buttonGange;
	JButton buttonDividere;
	JButton buttonClean;
	
	
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
		textfield = new JTextField(40);
		getContentPane().add(textfield);
		
		// Knapper fra 0-9
		makeButtons();
		setButtons();
		addButtons();
		
		// knapper til + - * / =
		
	}
	
	public void makeButtons(){
		button0 = new JButton();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		buttonPlus = new JButton();
		buttonMinus = new JButton();
		buttonGange = new JButton();
		buttonDividere = new JButton();
		buttonClean = new JButton();
	}
	
	public void setButtons(){
		button0.setText("0");
		
	}
	
	public void addButtons(){
		
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
