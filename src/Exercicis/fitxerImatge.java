package Exercicis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class fitxerImatge {
	 File f = null;
	
	 
	    public fitxerImatge(File fEnt){
	        // Control d'existència del fitxer i control de l'extensió .bmp (traure missatges d'error) 	
	    	
	    	String fic = f.getName();
	    	int i = fic.lastIndexOf(".");
	    	String ex =fic.substring(i+1);
	    	
	    	if (fEnt.exists() && ex.equals("bmp")) {
	    		this.f = fEnt;
	    	}
	    		
	    	
	    }
	    public void transformaNegatiu() throws IOException{
	        // Transformar a negatiiu i guardar en _n.bmp
	    	FileInputStream f_in = new FileInputStream("Penyagolosa.bmp");
	    	FileOutputStream f_out = new FileOutputStream("fitxer_n.bmp");
	    	
	    	byte[] buffer = new byte[54];
			f_in.read(buffer);
			f_out.write(buffer);
			
			byte newByte;
			int b = f_in.read();
			
			while(b != -1) {
				
				newByte = (byte) (255 - b);
				f_out.write(newByte);
				b = f_in.read();
			}
		f_in.close();
		f_out.close();
	    }

	    public void transformaObscur() throws IOException{
	        // Transformar a una imatge més fosca i guardar en _o.bmp
	    	FileInputStream f_in = new FileInputStream("Penyagolosa.bmp");
	    	FileOutputStream f_out = new FileOutputStream("fitxer_o.bmp");
	    	
	    	byte[] buffer = new byte[54];
			f_in.read(buffer);
			f_out.write(buffer);
			
			byte newByte;
			int b = f_in.read();
			
			while(b != -1) {
				
				newByte = (byte) (b/2);
				f_out.write(newByte);
				b = f_in.read();
			}
			f_in.close();
			f_out.close();
	    }
	  	 
}
	    

