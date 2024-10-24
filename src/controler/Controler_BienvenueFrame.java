package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.BienvenueFrame;
import view.TicTacToeGrid;
import model.TicTacToe;

public class Controler_BienvenueFrame 
{
	BienvenueFrame bienvenue;
	public Controler_BienvenueFrame()
	{
		bienvenue = new BienvenueFrame();
		bienvenue.boutonCliquerPourContinuer.addActionListener(new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e2) 
		    {
		    	Controler_TicTacToeGrid MyGrid = new Controler_TicTacToeGrid();
		    	bienvenue.dispose();
		    }
		});
	}
}
