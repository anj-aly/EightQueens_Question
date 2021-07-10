public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {
        int row=square/8;        
        int column=square%8;
		if((row+column)%2==0) //To determine if the cell is black or white
        	 return false;
		//System.out.println(square);
		return true;
	}
}
