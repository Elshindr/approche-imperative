package diginamic.tableaux;

/**
 * TP5 - Tableaux
 * @author Elshindr
 */
public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrVilles = {"Nantes", "Monpellier", "Noumea", "Salon", "Aix"};
		
		for (String uneVille : arrVilles) {
			System.out.println(uneVille);
		}
		
		System.out.println("Longueur de arrVilles" + arrVilles.length);
		
		arrVilles[3] = "Brest";
		
		for (String uneVille : arrVilles) {
			System.out.println(uneVille);
		}
	}
}
