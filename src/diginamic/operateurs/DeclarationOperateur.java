package diginamic.operateurs;
/**
 * TP4 - Operateurs
 * @author Elshindr
 *
 */
public class DeclarationOperateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		boolean testEt = a>0 && b<10;
		System.out.println("valeur de testEt:"+testEt);
		
		
		boolean testOu = a>0 || b<10;
		System.out.println("valeur de testOu:"+testOu);
		
		a=a+1;
		System.out.println("valeur de a: "+ a);
		
		a++;
		System.out.println("valeur de a: "+ a);
		
		a+=1;
		System.out.println("valeur de a: "+ a);
		
		String c = a>0 ? "a est plus grand que 0": "a est inférieur à 0";
		System.out.println("valeur de c: "+ c);

	}

}
