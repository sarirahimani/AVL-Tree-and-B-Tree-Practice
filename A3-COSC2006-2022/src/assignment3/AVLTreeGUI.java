package assignment3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AVLTreeGUI extends JFrame implements ActionListener{
		private JTextArea output;
		private JLabel addLabel, dataLabel, emptyLabel;
		private JTextField dataInput;
		private JPanel inPanel, outPanel, mainPanel;
		private JButton addButton, emptyButton;
		private AVLTree a=new AVLTree();
		private int data;
		
		public AVLTreeGUI() {
			
			data=0;

			
			inPanel = new JPanel();
			inPanel.setLayout(new GridLayout(20,1));
			
			outPanel = new JPanel();
			outPanel.setLayout(new FlowLayout());
			
			mainPanel = new JPanel();
			mainPanel.setLayout(new FlowLayout());
			
			addLabel = new JLabel("Add:");
			dataLabel= new JLabel("Data:"); 
			emptyLabel= new JLabel("Is the AVL Tree empty?");
			
			output=new JTextArea(30,30);
		
			addButton=new JButton("Add!");
			addButton.addActionListener(this);
			emptyButton =new JButton("Check!");
			emptyButton.addActionListener(this);
			
			
		
			dataInput = new JTextField(15);
			dataInput.addActionListener(this);
		
		
			inPanel.add(addLabel);
			inPanel.add(dataLabel);
			inPanel.add(dataInput);
			inPanel.add(addButton);
			inPanel.add(emptyLabel);
			inPanel.add(emptyButton);
			
			
		
		
			outPanel.add(new JScrollPane(output));

			mainPanel.add(inPanel);
			mainPanel.add(outPanel);
			this.add(mainPanel);
		
		}
	 

		public void actionPerformed(ActionEvent actEvent) {
		try {
			 if(actEvent.getSource()==addButton) {
				 
				 String  initialData= dataInput.getText();
				 data=Integer.parseInt(initialData);			 
				 a.add(data);
				
			 }else if(actEvent.getSource()==emptyButton) {

				 String out="\n Is the AVL Tree empty? "+ a.isEmpty()+"\n";
				 output.append(out);
			 }
			 
			 
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Try again!");
		}	 
				 
	}
			 
			 
				


	 public static void main(String[] args) {

			
			AVLTreeGUI gui = new AVLTreeGUI();
			
			
			gui.setVisible(true); 
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			gui.setSize(600,600);  
			gui.setTitle("Doubly Linked List GUI"); 
			gui.setResizable(false);
		}

	}


