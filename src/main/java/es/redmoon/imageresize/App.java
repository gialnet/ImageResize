package es.redmoon.imageresize;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import net.coobird.thumbnailator.Thumbnails;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        /*
        System.out.println( "Leer la imagen" );
        Thumbnails.of(new File("prueba.jpg"))
                .size(600, 400)
                .toFile(new File("600x400.jpg"));
        System.out.println( "Terminado" );
        */
        
        Path start = FileSystems.getDefault().getPath("C:\\Users\\Usuario\\Pictures\\CASAS Y PISOS");
		Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file,
					BasicFileAttributes attrs) throws IOException {
				if (file.toString().toLowerCase().endsWith(".jpg")) {
					System.out.println(file);
				}
				return FileVisitResult.CONTINUE;
			}
		});
    }
}
