public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		
		return (cellId)%8;	//To get the column of given cell
	}
	
	private int getRow(int cellId) {
	    return cellId/8;	// To get the row of given cell
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		
		int i,j;
		for(i=0;i<8;i++)//To check if the column is free
			if(placedQueens[i][col]==true)
				isValid=false;
		for(i=0;i<8;i++) //To check if the row is free
			if(placedQueens[row][i]==true)
				isValid=false;
		for(i=row,j=col;i>=0&&j>=0;i--,j--)//To check if upper primary diagonal is free
			if(placedQueens[i][j]==true)
				isValid=false;
		for(i=row,j=col;i<8&&j<8;i++,j++)//To check if lower primary diagonal is free
			if(placedQueens[i][j]==true)
				isValid=false;
		for(i=row,j=col;j>=0&&i<8;i++,j--)//To check if upper secondary diagonal is free
			if(placedQueens[i][j]==true)
				isValid=false;
		for(i=row,j=col;j<8&&i>=0;i--,j++)//To check if lower secondary diagonal is free
			if(placedQueens[i][j]==true)
				isValid=false;
		if(isValid) {                    //If its safe place the queen update placedQueens and numQueens
			placedQueens[row][col]=true;
			numQueens++;
		}
		
		return isValid;
	}
}














