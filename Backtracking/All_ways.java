package Backtracking;

public class All_ways {
	public static void main(String[] args) {
		boolean[][]board= {
				{true,true,true},
				{true,true,true},
				{true,true,true}
		};
		printways("", 0, 0, board);
		
	}
	static void printways(String p,int r, int c,boolean [][]maze) {
		if (r==maze.length-1&& c==maze[0].length-1) {
			System.out.println(p);
			return ;
		}
		if(maze[r][c]==false) {
			return;
		}
		maze[r][c]=false;
		if(r>0) {
			printways(p+'U',r-1, c,maze);
			
		}
		if(c>0) {
			printways(p+'L',r, c-1,maze);
		}
		
		if(r<maze.length-1) {
			printways(p+'D',r+1, c,maze);
		}
		if(c<maze[0].length-1) {
			printways(p+'R',r, c+1,maze);
		}
		//now while returning from the function we will set 
		//the path to true so that in future recursion calls it will not show false
		//this process is known as backtracking
		
		maze[r][c]= true;
		
	}

}
