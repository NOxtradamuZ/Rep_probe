package holaMundo;

public class WordCounter {
		
	public static void main(String[] args) {
		
		int result = Integer.parseInt("5");
		String[] array = {"javier", "borja", "estas"};
		int i;
		for (i = 0; i < array.length; i++) {
			if (array[i].length() == result) {
				System.out.println(array[i]);
			}
		}
		
	}
}
