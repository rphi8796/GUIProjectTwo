package guitwo.view;

import javax.swing.*;
import guitwo.controller.GUITwoController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITwoPanel extends JPanel
{
	private GUITwoController appController;
	private JLabel firstLabel;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUITwoPanel(GUITwoController appController)
	{
		super();
		
		this.appController = appController;
		
		firstLabel = new JLabel("label");
		firstButton = new JButton("bruh");
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		firstLabel.setText("Red: " + red + " Green: " + green + " Blue: " + blue);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(firstButton);
		this.add(firstLabel);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, firstLabel, 70, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstLabel, -90, SpringLayout.EAST,  this);
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 175, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -135, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackgroundColor();
			}
		});
	}
	
	
}
