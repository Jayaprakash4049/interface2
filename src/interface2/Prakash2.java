package interface2;

public class Prakash2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jaya myObj = new Jaya();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	}

}
interface x1 {
	  public void myMethod(); 
	}

interface x2 {
	  public void myOtherMethod(); 
	}

	class Jaya implements x1, x2 {
	  public void myMethod() {
	    System.out.println("Hello");
	  }
	  public void myOtherMethod() {
	    System.out.println("people");
	  }
	}