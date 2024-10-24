package view;

import javax.swing.*;

import model.TicTacToe;

import java.awt.*;

public class TicTacToeGrid extends MyFrame {
	public JButton[][] buttons;
    public TicTacToeGrid() 
    {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(3, 3));
        getContentPane().setBackground(Color.ORANGE);
        buttons = new JButton[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                buttons[i][j] = new JButton();
                this.add(buttons[i][j]);
            }
        }
        setVisible(true);
    }
    
}