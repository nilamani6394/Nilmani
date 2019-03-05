package polymorphism;

class Demo
{
	public void add(){}
	
	public void add(int i){}
	
	public void add(int i, int j){}
	
	public void add(float f){}
	
	public void add(double d){}
	
	public void add(int i, float f){}
	
	public void add(float f,int i){}
}

public class Poly_1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.add(5.3);
	}

}
