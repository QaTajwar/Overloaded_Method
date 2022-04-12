package overloaded;

public class Overloaded {
public static void main(String[] args) {
	/*   overloaded methods = methods that share the same name but have different parameters
	 *                        method name + parameters = method signature
	 *       
	 */
	
	int total = add(1,2,7);
	System.out.println(total);


}
	


static int add(int a , int b) {
		System.out.println("Method 1");
	return a + b;
	}
	static int add(int a , int b , int c) {
		System.out.println("Method 2");
		return a+b+c;
	}
	static int add(int a, int b , int c, int d) {
		System.out.println("Method 3");
		return a+b+c+d;
	}
	
	
	
	



}
