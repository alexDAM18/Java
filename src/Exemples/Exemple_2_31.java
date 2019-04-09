package Exemples;

import java.io.FileWriter;
import java.io.IOException;

public class Exemple_2_31 {
	public static void main(String[] args) throws IOException {

		String text = "Contingut per al fitxer. Ara ja sense por a caràcters especials: ç, à, ú, ...";
		FileWriter f_out = new FileWriter("f5.txt");
		/**for (int i = 0; i < text.length(); i++) {
			f_out.write(text.charAt(i));
		}*/
		f_out.write("hOLA QUE TAL");
		f_out.close();
	}
}
