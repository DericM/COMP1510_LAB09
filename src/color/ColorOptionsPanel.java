package color;

//***********************************************************************
//ColorOptionsPanel.java
//
//Represents the user interface for the ColorOptions program that lets
//the user change background color by selecting a radio button.
//***********************************************************************
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
public class ColorOptionsPanel extends JPanel
{
	private final int WIDTH = 350, HEIGHT = 100, FONT_SIZE = 20;
	private final int NUM_COLORS = 5;
	private Color [] color;
	private JLabel heading;
	private JRadioButton [] colorButton; 
	//------------------------------------------------------------------
	//Sets up a panel with a label at the top and a set of radio buttons
	//that control the background color of the panel.
	//------------------------------------------------------------------
	public ColorOptionsPanel (){
		//Set up heading and colors
		heading = new JLabel ("Choose the background color!");
		color = new Color[NUM_COLORS];
		colorButton = new JRadioButton[NUM_COLORS];
		heading.setFont (new Font ("Helvetica", Font.BOLD, FONT_SIZE));
		
		color[0] = Color.yellow;
		color[1] = Color.cyan;
		color[2] = Color.red;
		color[3] = Color.green;
		color[4] = Color.magenta;
		
		colorButton[0] = new JRadioButton("Yellow", true);
		colorButton[1] = new JRadioButton("Cyan");
		colorButton[2] = new JRadioButton("Red");
		colorButton[3] = new JRadioButton("Green");
		colorButton[4] = new JRadioButton("Magenta");

		//Instantiate a ButtonGroup object and a ColorListener object
		ButtonGroup buttonG = new ButtonGroup();
		ColorListener colorL = new ColorListener();
		
		for(int i =0;i < NUM_COLORS;i++){
			buttonG.add(colorButton[i]);
			colorButton[i].setBackground(Color.white);
			colorButton[i].addActionListener(new ColorListener());
			add(colorButton[i]);
		}
		
		
		//Set up the panel
		add (heading);
		setBackground (Color.yellow);
		setPreferredSize (new Dimension (WIDTH, HEIGHT));
		//Group the radio buttons, add a ColorListener to each,
		//set the background color of each and add each to the panel.
	}
	//***************************************************************
	//Represents the listener for the radio buttons.
	//***************************************************************
	private class ColorListener implements ActionListener{
		//-------------------------------------------------------
		//Updates the background color of the panel based on
		//which radio button is selected.
		//------------------------------------------------------
		public void actionPerformed (ActionEvent event){
			
			for(int i = 0;i<NUM_COLORS;i++){
				if (colorButton[i].isSelected()){
					setBackground (color[i]);
				}
			}
			
		}
	}
}