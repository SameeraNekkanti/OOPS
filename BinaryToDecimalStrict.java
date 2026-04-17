package assignment;

public class BinaryToDecimalStrict {

	public static void main(String[] args) {
		int binary=1010101;
		int decimal=0;
		int power=0;

		for(int i=binary;i>0;i=i/10){
		int rem=i%10;
		decimal=decimal+(rem*(int)Math.pow(2,power));
		power++;
		}

		System.out.println(decimal);
		}
		}
