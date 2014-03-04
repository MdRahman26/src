
public class CallByRef {

	 int x;
	 int y;
	
	public static void main(String[] args) {

		
		CallByRef ref = new CallByRef();
		
		ref.x = 10;
		ref.y = 20;
		
		callByRef(ref);
		System.out.println("after swap");
		System.out.println("x===="+ref.x);
		System.out.println("y===="+ref.y);
		
	}
	
	
	public static void callByRef(CallByRef p){
		
		int t;
		
		t=p.x;
		p.x=p.y;
		p.y=t;
		
		
		
		
	}
	

}
