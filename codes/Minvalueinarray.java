package codes;

public class Minvalueinarray {
	public static void main(String[] args) {
		int []a= {25,26,27,99};
		 int min = Integer.MAX_VALUE;
		for(int element:a) {
			if(element<min) {
				min = element;
				System.out.println(min);
				
				
			}
		}
	}

}
