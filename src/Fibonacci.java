
public class Fibonacci {

	public static void main(String[] args) {
		int Firstnumber = 0;
		int Secondnumber = 1;
		int Thirdnumber;
System.out.println(Firstnumber); System.out.println(Secondnumber);
		for (int i = 0; i < 11; i++) {
			Thirdnumber = Firstnumber + Secondnumber;
			Firstnumber = Secondnumber;
			Secondnumber = Thirdnumber;
			System.out.println(Thirdnumber);
		}
	}

}
