
public class ObjectShifting {

	int x;
	int y;
	int z;
	
	
	public static void main(String[] args) {

		
		ObjectShifting a = new ObjectShifting();
		ObjectShifting b = new ObjectShifting();
		ObjectShifting c = new ObjectShifting();

		a.x=10;
		b.y=20;
		c.z=30;
		
		System.out.println(a.x);
		System.out.println(b.y);
		System.out.println(c.z);
		
		System.out.println("Shifting********");
		
		a = b;
		b = c;
		c = a;
		
		System.out.println(a.y);
		System.out.println(b.z);
		System.out.println(c.y);
		
		System.out.println(Math.random());
		
	}

}
