package holaMundo;

public class WordCounter2 {
		
	public static void main(String[] args) {
		
		try {
			int result = Integer.parseInt("4");
			String[] array = {"Hola", "como", "estas"};
			//System.out.println(array[5]);
			int i;
			for (i = 0; i < array.length; i++) {
				if (array[i].length() == result && array[i].contains("ol")) {
					System.out.println(array[i]);
				}
			}
		} catch (Exception ex) {
			System.out.println("Error en la ejecución, el programa da errores. Puedes visualizar el error en" +" "+ ex);
			
		} finally {
			System.out.println("Se ejecuta este bloque de código tanto si tiene errores, como si no");
		}
	}
}	