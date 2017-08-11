package unit12;

public class InheritingExceptions {

	public void f() throws SimpleException{
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}
	public static void main(String[] args){
		InheritingExceptions ie = new InheritingExceptions();
		try {
			ie.f();
		} catch (SimpleException e) {
			// TODO Auto-generated catch block
			System.out.println("Caught it!");
		}
	}
}
class SimpleException extends Exception{
	
}