
public class ForLoopGauntlet {

	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(" ");
		}
		for (int i = 101; i > -1; i--) {
			System.out.println("");
		}
		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(" ");
			}
		}
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println("");
			}
		}
		for (int i = 1; i < 501; i++) {
			if(i % 2 == 0) {
				System.out.println("" + " ");}
				if(i % 2 == 1) {
					System.out.println("" + " ");
				}
		}
		for (int i = 0; i < 778; i++) {
		   if( i % 7 == 0) {
			   System.out.println("");
		}	
		
		
		}
		for (int i = 0; i < 13; i++) {
		int Yearborn = i + 2006;
			System.out.println("In the year " + Yearborn + " I was " + i + " years old" );
		}
		for (int i = 0; i < args.length; i++) {
			
		}
	}

}
