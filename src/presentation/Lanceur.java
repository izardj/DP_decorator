package presentation;

import metier.Boisson;
import metier.Caramel;
import metier.Colombia;
import metier.Expresso;

public class Lanceur {

	public static void main(String[] args) {
		Expresso b1 = new Expresso();
		
		Boisson b2 = new Caramel(new Colombia());

		System.out.println(b1.getDescription() + " cout: " + b2.cout());
		System.out.println(b2.getDescription() + " cout: " + b2.cout());
		
	}

}
