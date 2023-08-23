package Backtracking;

public class N_Queens {
	public static void main(String[] args) {
		
	}
	static int queens(boolean[][]board,int row) {
		if(row==board.length) {
			return 1;
		}
		int count=0;
		for(int col=0;col<board.length;col++) {
			if(issafe(board,row,col)) {
				board[row][col]=true;
				count+=queens(board, row+1);
				board[row][col]=false;
				
			}
			
		}
		return count;
	}
	private static boolean issafe(boolean[][] board, int row, int col) {
		for(int i=0;i<row;i++) {
			if(board[i][row]) {
				return false;
			}
		}
		int maxleft=Math.min(row, col);
		for(int i=1;i<=maxleft;i++) {
			if(board[row-i][col-i]) {
				return false;
			}
		}
		int maxright=Math.min(row, board.length-col-1);
		for(int i=1;i<=maxright;i++) {
			if(board[row-i][col+i]) {
				return false;
			}
		}

		
		// TODO Auto-generated method stub
		return true;
	}

}
