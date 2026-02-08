package assignment;

public class HCFcalculatiom {

	public static void main(String[] args) {
		int a=24;
		int b=29;
		int hcf=1;
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		System.out.println(hcf);
	}

}
