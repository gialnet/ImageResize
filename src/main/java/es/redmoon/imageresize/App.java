package es.redmoon.imageresize;

import java.io.File;
import java.io.IOException;
import net.coobird.thumbnailator.Thumbnails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        
        System.out.println( "Leer la imagen" );
        Thumbnails.of(new File("prueba.jpg"))
                .size(600, 400)
                .toFile(new File("600x400.jpg"));
        System.out.println( "Terminado" );
    }
}
