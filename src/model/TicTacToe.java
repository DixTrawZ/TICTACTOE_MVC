package model;

public class TicTacToe 
{
	public int[][] mat = new int[3][3];

	public TicTacToe()
	{
		setZero(this.mat);
	}

	public void setZero(int [][] m)
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{	
				m[i][j]=0;
			}
		}
	}
	
	public boolean player1(int i, int j,TicTacToe mATRIX)
 	{
		if(mATRIX.mat[i][j]==0)
		{
			mATRIX.mat[i][j]=1;
			return true;
		}
		return false;
	}
	
	public boolean player2(int i, int j,TicTacToe mATRIX)
 	{
		if(mATRIX.mat[i][j]==0)
		{
			mATRIX.mat[i][j]=2;
			return true;
		}
		return false;
	}
	
	public boolean checkWin(int i, int j,TicTacToe mATRIX)
	{
		if(mATRIX.mat[i][0]==mATRIX.mat[i][1] && mATRIX.mat[i][1]==mATRIX.mat[i][2])
		{
			return true;
		}
		if(mATRIX.mat[0][j]==mATRIX.mat[1][j] && mATRIX.mat[1][j]==mATRIX.mat[2][j])
		{
			return true;
		}
		if(i==j)
		{
			if(mATRIX.mat[0][0]==mATRIX.mat[1][1] && mATRIX.mat[1][1]==mATRIX.mat[2][2])
			{
				return true;
			}
		}
		if((i==0 && j==2) || (i==2 && j==0))
		{
			if(mATRIX.mat[0][2]==mATRIX.mat[1][1] && mATRIX.mat[1][1]==mATRIX.mat[2][0])
			{
				return true;
			}
		}
		return false;
	}


}
