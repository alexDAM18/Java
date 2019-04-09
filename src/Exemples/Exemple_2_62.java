package Exemples;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Exemple_2_62 {

	public static void main(String[] args) throws IOException {
		BufferedReader f_ent = new BufferedReader(new FileReader("f5.txt"));
		PrintWriter f_eix = new PrintWriter(new OutputStreamWriter(new FileOutputStream("f5_ISO.txt"), "ISO-8859-15"));

		String cad = f_ent.readLine();
		while (cad != null) {
			f_eix.println(cad);
			cad = f_ent.readLine();
		}
		f_eix.close();
		f_ent.close();
	}
}
