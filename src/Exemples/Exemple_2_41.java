package Exemples;

import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exemple_2_41 {
	public static void main(String[] args) throws IOException {

		PrintStream f_out = new PrintStream(new FileOutputStream("f6.txt"));

		float a = (float) 5.25;
		String b = "Hola.";
		f_out.print(b);
		f_out.println("Què tal?");
		f_out.println(a + 3);
		f_out.printf("El número %d en hexadecimal és %x", 27, 27);

		f_out.close();
	}
}
