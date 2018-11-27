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
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(firstButton);
		this.add(firstLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent mouseClick){}});
	}
	
	
}
