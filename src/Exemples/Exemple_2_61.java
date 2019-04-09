package Exemples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exemple_2_61 {

	public static void main(String[] args) throws IOException {
		FileReader f_ent = new FileReader("f5.txt");
		OutputStreamWriter f_eix = new OutputStreamWriter(new FileOutputStream("f5_ISO.txt"), "ISO-8859-1");

		int car = f_ent.read();
		while (car != -1) {
			f_eix.write(car);
			car = f_ent.read();
		}
		f_eix.close();
		f_ent.close();
	}
}
