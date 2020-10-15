class Circle{
	double radius;
	Circle(double r){
		radius=r;	}
	double area(){
		return ((22*radius*radius)/7);	} 
	double perimeter(){
		return ((2*22*radius)/7);	}
} class Rectangle{
	int len;
	int br;
	Rectangle(int l,int b){
		len=l;
		br=b;		} 
	int area(){
		return (len*br);	} 
	int perimeter(){
		return (2*(len+br));	}
} class Square{
	int side;
	Square(int a){
		side=a;		}
	int area(){
		return side*side;	} 
	int perimeter(){
		return 4*side;		}
} 
class AreaPeri{
	public static void main(String args[]){
		Circle c1=new Circle(Double.parseDouble(args[0]));
		Rectangle rec1=new Rectangle(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		Square s1=new Square(Integer.parseInt(args[3]));
		System.out.println("Area of Circle of radius "+args[0]+" is "+c1.area());
		System.out.println("Perimeter of Circle of radius "+args[0]+" is "+c1.perimeter());		
		System.out.println("Area of Rectangle of length "+args[1]+" and breadth "+args[2]+" is "+rec1.area());
		System.out.println("Perimeter of Rectangle of length "+args[1]+" and breadth "+args[2]+" is "+rec1.perimeter());
		System.out.println("Area of Square of side "+args[3]+" is "+s1.area());
		System.out.println("Perimeter of Square of side "+args[3]+" is "+s1.perimeter());		
	}
}
