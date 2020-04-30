package patronesCreacionales.prototype;

import java.util.ArrayList;

public class Main {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ItemA uno = new ItemA("bdapp", "jean", "usuarios");

		ArrayList items = new ArrayList();

		for (int i = 0; i < 10; i++) {
			PrototypeItem item = uno.clone();

//			uno.setX(uno.getX() + String.valueOf(i));
//			System.out.println(uno.getX());
			items.add(item);
		}

		int t = items.size();
		for (int i = 0; i < t; i++) {
			System.out.println(items.get(i));
		}

	}

}
