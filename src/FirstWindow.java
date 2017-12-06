import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstWindow extends JFrame{

	public FirstWindow() {
		super("My computer is VERY special!");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		
		JPanel p3 = new JPanel(new GridBagLayout() );
		p3.setBackground(Color.YELLOW);
		
		JPanel p4 = new JPanel();
		p4.setBackground(Color.GREEN);
		
		JPanel p5 = new JPanel(new GridBagLayout() );
		p5.setBackground(Color.CYAN);
		
		
		JButton b1 = new JButton("button 1");
		b1.setBackground(Color.RED);
		
		JButton b2 = new JButton("button 2");
		b2.setBackground(Color.GREEN);
		
		JButton b3 = new JButton("button 3");
		b3.setBackground(Color.ORANGE);
		
		
		JCheckBox cb1 = new JCheckBox("Do you LOVE bacon?");
		cb1.setBackground(Color.CYAN);
		
		JCheckBox cb2 = new JCheckBox("Do you LOVE Java?");
		Color myNewColor = new Color (150,200,250,200); //creates your new color
		cb2.setBackground(myNewColor);
		
		JCheckBox cb3 = new JCheckBox("This is a checkbox.");
		cb2.setBackground(myNewColor);
		
		JCheckBox cb4 = new JCheckBox("Clickme.");
		cb2.setBackground(myNewColor);
		
		JCheckBox cb5 = new JCheckBox("No me.");
		cb2.setBackground(myNewColor);
		
		JCheckBox cb6 = new JCheckBox("Over here.");
		cb2.setBackground(myNewColor);
		
		JCheckBox cb7 = new JCheckBox(":D");
		cb2.setBackground(myNewColor);
		
		JCheckBox cb8 = new JCheckBox("Hullo");
		cb2.setBackground(myNewColor);
		
		JCheckBox cb9 = new JCheckBox("Click me.");
		cb2.setBackground(myNewColor);
		
		JLabel myLabel = new JLabel("Fancy label");
		JTextArea myTextArea = new JTextArea("Fancy TextArea!");
		JTextField myTextField = new JTextField("Fancy TextField!");
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15, 15, 15, 15);
		
		//Checkpoint Grade!
		//East Panel 1 x 3 (vertical 3 on top of each other)
		//Center Panel 3 x 3 
		//West Panel 2 x 3
		
		p1.add(b1);
		p1.add(b2);
		p2.add(cb1);
		p2.add(cb2);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p3.add(myLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p3.add(myTextArea, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		p3.add(myTextField, gbc);
		p4.add(cb3, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p5.add(cb2, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p3.add(cb3, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p3.add(cb1, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p3.add(cb4, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p3.add(cb9, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		p3.add(cb6, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		p3.add(cb7, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		p3.add(cb8, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		p3.add(cb5, gbc);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(p3, BorderLayout.CENTER);
		add(p4, BorderLayout.WEST);
		add(p5, BorderLayout.EAST);
		
		
		setVisible(true);
	} // end of constructor
	
	
} // end of First Window
