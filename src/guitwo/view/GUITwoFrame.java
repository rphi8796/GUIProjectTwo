package guitwo.view;

import javax.swing.JFrame;
import guitwo.controller.GUITwoController;

public class GUITwoFrame extends JFrame
{
	private GUITwoController appController;
	private GUITwoPanel appPanel;
	
	public GUITwoFrame(GUITwoController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new GUITwoPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("hmmmm");
		this.setResizable(true);
		this.setVisible(true);
	}
	
	
}
