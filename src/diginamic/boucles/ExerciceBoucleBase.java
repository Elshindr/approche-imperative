package diginamic.boucles;

/**
 * TP6 - Boucles
 * @author Elshindr
 *
 */
public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=10;i++) {
			System.out.println(i);
		}
		
		int a = 1;
		do {
			System.out.println("Elshindr Ydrani");
			a++;
		} while(a<=20);
		
		for(int i = 2; i<=100; i++) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
		}
		
		for(int i = 1; i<=99; i++) {
					
			if(i % 2 != 0) {
				System.out.println(i);
			}			
		}	
	}
}
