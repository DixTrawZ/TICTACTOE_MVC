package controler;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import model.TicTacToe;
import view.TicTacToeGrid;

public class Controler_TicTacToeGrid {
	int turns = 0;
	TicTacToe MATRIX;
	Controler_TicTacToeGrid()
	{
		TicTacToeGrid myGrid = new TicTacToeGrid();
		myGrid.setVisible(true);
		MATRIX = new TicTacToe();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int row = i;
                int col = j;
                myGrid.buttons[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        turns++;
                    	if(turns==9)
                    	{
                    		myGrid.remove(myGrid.buttons[row][col]);
                            int a = row * 3 + col;
                            if ((turns-1) % 2 == 0) 
                            {
                            	JLabel x = new JLabel("x",JLabel.CENTER);
                            	x.setForeground(Color.RED);
                            	x.setFont(x.getFont().deriveFont(Font.BOLD, 24f));
                            	Border border = BorderFactory.createLineBorder(Color.YELLOW, 2);
                                x.setBorder(border);
                            	myGrid.add(x, a);
                            	MATRIX.player1(row, col, MATRIX);
                                myGrid.revalidate();
                                myGrid.repaint();
                                if(MATRIX.checkWin(row, col, MATRIX))
                            	{
                                    JOptionPane.showMessageDialog(null, "player 1,you win!", "YOU WON!", JOptionPane.INFORMATION_MESSAGE, null);
                                    myGrid.dispose();
                            	}
                            } 
                            else 
                            {
                            	JLabel o = new JLabel("o",JLabel.CENTER);
                            	o.setForeground(Color.BLUE);
                            	o.setFont(o.getFont().deriveFont(Font.BOLD, 24f));
                            	Border border = BorderFactory.createLineBorder(Color.YELLOW, 2);
                            	o.setBorder(border);
                                myGrid.add(o, a);
                            	MATRIX.player2(row, col, MATRIX);
                                myGrid.revalidate();
                                myGrid.repaint();
                                if(MATRIX.checkWin(row, col, MATRIX))
                            	{
                                    JOptionPane.showMessageDialog(null, "player 2,you win!", "YOU WON!", JOptionPane.INFORMATION_MESSAGE, null);
                                    myGrid.dispose();
                            	}
                            }
                            myGrid.revalidate();
                            myGrid.repaint();
                            if(!MATRIX.checkWin(row, col, MATRIX))
                            {
                            JOptionPane.showMessageDialog(null, ":/", "IT'S A TIE :(", JOptionPane.INFORMATION_MESSAGE, null);
                            myGrid.dispose();
                            }
                    	}
                    	else
                    	{
                    		myGrid.remove(myGrid.buttons[row][col]);
                            int a = row * 3 + col;
                            if ((turns-1) % 2 == 0) {
                            	JLabel x = new JLabel("x",JLabel.CENTER);
                            	x.setForeground(Color.RED);
                            	x.setFont(x.getFont().deriveFont(Font.BOLD, 24f));
                            	Border border = BorderFactory.createLineBorder(Color.YELLOW, 2);
                                x.setBorder(border);
                            	myGrid.add(x, a);
                            	MATRIX.player1(row, col, MATRIX);
                                myGrid.revalidate();
                                myGrid.repaint();
                                if(MATRIX.checkWin(row, col, MATRIX))
                            	{
                                    JOptionPane.showMessageDialog(null, "player 1,you win!", "YOU WON!", JOptionPane.INFORMATION_MESSAGE, null);
                                    myGrid.dispose();
                            	}
                            } else {
                            	JLabel o = new JLabel("o",JLabel.CENTER);
                            	o.setForeground(Color.BLUE);
                            	o.setFont(o.getFont().deriveFont(Font.BOLD, 24f));
                            	Border border = BorderFactory.createLineBorder(Color.YELLOW, 2);
                            	o.setBorder(border);
                                myGrid.add(o, a);
                            	MATRIX.player2(row, col, MATRIX);
                                myGrid.revalidate();
                                myGrid.repaint();
                                if(MATRIX.checkWin(row, col, MATRIX))
                            	{
                                    JOptionPane.showMessageDialog(null, "player 2,you win!", "YOU WON!", JOptionPane.INFORMATION_MESSAGE, null);
                                    myGrid.dispose();
                            	}
                            }
                    	}
                        
                    }
                });
            }
        }
	
	
	}

	
}
