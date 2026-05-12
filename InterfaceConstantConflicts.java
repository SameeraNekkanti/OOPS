interface A{
	int a=5;
}
interface B{
	int a=10;
}
public class InterfaceConstantConflicts {

	public static void main(String[] args) {
		System.out.println(A.a+B.a);

	}

}
//Interface variables are public static final.