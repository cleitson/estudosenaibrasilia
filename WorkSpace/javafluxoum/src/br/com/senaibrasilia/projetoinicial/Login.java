package br.com.senaibrasilia.projetoinicial;

/*import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	
	private JButton login;
	private FlowLayout layout;
	private JTextField userText;
	private JLabel user,password,res;
	private JPasswordField passText;
	private int count;
	
	public Login() {
		super("Senai Brasilia-Java");	
		
		
		layout =new FlowLayout();
		login=new JButton("Login");
		
		
		user = new JLabel("usuario: ");
		setBounds(20,20,80,100);
		add(user);
		
		userText=new JTextField(15);
		add(userText);
		
		
		password = new JLabel("senha: ");
		add(password);
		
		
		passText=new JPasswordField(15);
		add(passText);
		
		add(login);	
		setLayout(layout);
		setSize(800,600);
		
		res=new JLabel("");
		add(res);
		
		login.addActionListener(this);
		getRootPane().setDefaultButton(login);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String user=userText.getText();
		String pass=passText.getText();
		
	        if(user.equals("senaibrasilia") && pass.equals("senai")) {
		      //JOptionPane.showMessageDialog(null, "Sucesso!");
	        	res.setText("Sucesso!");
	        } else {
	        	res.setText("Usuario ou senha invalido!");
	        count++;
	        if(count>=3) {
	        	login.setEnabled(false);
	        	login.setBackground(Color.red);
	        	res.setText("Conta Bloqueada");
	        }}
	}

}