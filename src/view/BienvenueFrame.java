//FINITO PIPO
package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class BienvenueFrame extends MyFrame
{
	JLabel labelBienvenue;
	JLabel labelCliquerPourContinuer;
	public JButton boutonCliquerPourContinuer;
	public BienvenueFrame()
	{
		labelBienvenue = new JLabel("BIENVENUE DANS CE JEU DE TIC TAC TOE !");
		labelBienvenue.setBounds(30, 10, 500, 50);
		labelBienvenue.setFont(new Font("Minecraftia", Font.BOLD, 20));
		this.add(labelBienvenue);
		boutonCliquerPourContinuer = new JButton("Cliquez ici pour continuer");
		boutonCliquerPourContinuer.setBounds(70, 150, 350, 175);
		boutonCliquerPourContinuer.setFont(new Font("Minecraftia", Font.TYPE1_FONT, 20));
		boutonCliquerPourContinuer.setFocusable(false);
		this.add(boutonCliquerPourContinuer);
		this.setVisible(true);
	}
}
