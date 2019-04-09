package Exercicis;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercici_2_1 {

    public static void main(String[] args) throws IOException {
        File f = new File("Penyagolosa.bmp");
        
        fitxerImatge fi = new fitxerImatge(f);
        fi.transformaNegatiu();
        fi.transformaObscur();
        // voluntari
        //fi.transformaBlancNegre();
    }    
}