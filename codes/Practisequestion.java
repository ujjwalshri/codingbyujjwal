package codes;

class rectangle{
	 public int length = 10;
	public int breadth;
	rectangle(int b,int l){
		this.length=l;
		this.breadth = b;
		
	}
	public double area() {
		return this.length*this.breadth;
	}
}

	
class cuboid extends rectangle{
	 public int height;
	 
        cuboid(int h){
        	super(12,3);
        	this.height=h;
        
	
	 }
        
	public double volume() {
		return this.height*this.breadth*this.length;
	
	}
}






public class Practisequestion {
	public static void main(String[] args) {
		rectangle obj = new rectangle(12,13);
		cuboid obj1 = new cuboid(3);
		obj1.volume();
		
		
		
	}

}
