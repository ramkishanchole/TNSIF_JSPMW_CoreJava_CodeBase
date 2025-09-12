package day06;
final class FinalClass{
	
	void show () {
		System.out.println("final class cannot be inherited");
	}
}

public class FinalClassDEmo {
	public static void main(String[] args) {
		FinalClass f1=new FinalClass();
		f1.show();
	}

}
