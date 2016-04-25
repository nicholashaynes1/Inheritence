package inheritance.view;

import inheritance.controller.InheritanceController;

import javax.swing.JFrame;



public class InheritanceFrame extends JFrame
{
	private InheritanceController baseController;
	private InheritancePanel basePanel;
	
	public InheritanceFrame(InheritanceController baseController)
	{
		this.baseController = baseController;
		basePanel = new InheritancePanel(baseController);
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(true);
		this.setSize(600, 600);
		this.setTitle("This isn't boring!");
		this.setVisible(true);
	}
	
	
	public InheritanceController getBaseController() 
	{
		return baseController;
	}


}
