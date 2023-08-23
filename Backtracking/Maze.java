package Backtracking;

import java.util.ArrayList;

public class Maze {
	public static void main(String[] args) {
//		System.out.println(countways(3, 3));
		//printways("", 3, 3);
		ArrayList<String> ans= printways3("", 3, 3);
		System.out.println(ans);
	}
	static int countways(int r, int c) {
		if (r==1|| c==1) {
			return 1;
		}
		int left= countways(r-1, c);
		int right=countways(r, c-1);
		return left+right;
	}
	static void printways(String p,int r, int c) {
		if (r==1&& c==1) {
			System.out.println(p);
			return ;
		}
		if(r>1) {
			printways(p+'D',r-1, c);
		}
		if(c>1) {
			printways(p+'R',r, c-1);
		}
		
		
	}
	static ArrayList<String> printways2(String p,int r, int c) {
		if (r==1&& c==1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list ;
		}
		ArrayList<String> list = new ArrayList<>();
		if(r>1) {
		list.addAll(printways2(p+'D',r-1, c));
		}
		if(c>1) {
			list.addAll(printways2(p+'R',r, c-1));
		}
		return list;
		
	}
	static ArrayList<String> printways3(String p,int r, int c) {
		if (r==1&& c==1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list ;
		}
		ArrayList<String> list = new ArrayList<>();
		if(r>1 && c>1) {
			list.addAll(printways3(p+'D',r-1, c-1));
		}
		if(r>1) {
			list.addAll(printways3(p+'H',r-1, c));
		}
		if(c>1) {
			list.addAll(printways3(p+'V',r, c-1));
		}
		return list;
		
	}

	


}
