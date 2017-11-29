package basePruebas;

public class LetterCounter {

	public static void main(String[] args) {
		String[] names ={"Como","están", "ustedes"};
		for (String s:names){ //He puesto el bucle for each para poder definir el bucle. Lo he pueso como s:names. Luego, no hace falta poner names[i], sino simplemente s/
			System.out.print(s);
			System.out.println(" " + s.length()); 
		}
	}
}
