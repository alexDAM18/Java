package Exemples;

import java.io.FileOutputStream;
import java.io.IOException;

public class Exemple_2_11 {
	public static void main(String[] args) throws IOException {

		String text = "Contingut per al fitxer.";
		FileOutputStream f_out = new FileOutputStream("f3.txt", true);
		for (int i = 0; i < text.length(); i++) {
			f_out.write(text.charAt(i));
		}
		f_out.close();
	}
}
