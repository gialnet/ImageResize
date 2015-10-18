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
        
        Path start = FileSystems.getDefault().getPath("C:\\Users\\Usuario\\Pictures\\CASAS Y PISOS");
        
		Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
                    int photos=1;
			@Override
			public FileVisitResult visitFile(Path file,
					BasicFileAttributes attrs) throws IOException {
                            

                        File f=null;

                        // Crear un directorio
                        if (attrs.isDirectory())
                        {

                          f = new File(file.getParent()+"\\800x600");
                          f.mkdirs();
                          f=null;
                        }
                            
                            // if (file.toString().toLowerCase().endsWith(".jpg")) {
			if (file.toString().toLowerCase().contains("600x400")) {
                                    
                                //System.out.println(file);
                                //System.out.println(file.getFileName());
                                //System.out.println(file.getParent());
                                photos++;
                                f = new File(file.toUri());
                                f.delete();
                                /*
                                Thumbnails.of(new File(file.toUri()))
                                .size(800, 600)
                                .toFile(new File(file.getParent()+"\\800x600-"+photos+".jpg"));
                                */ 
                        }
                        
                        System.out.println(photos);
                        return FileVisitResult.CONTINUE;
                        
			}
		});
                
    }
}
