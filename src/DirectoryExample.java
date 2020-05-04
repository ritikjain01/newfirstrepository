import java.io.*;

public class DirectoryExample {

public static void main(String[] args) throws IOException {
boolean dirFlag = false;

// create File object
File stockDir = new File("d://Stock/ stockDir ");
File newdir = new File("d://Stock/ newdir ");
File image = new File("d://Stock/ newdir/newImage.jpg");	

try {
   dirFlag = stockDir.mkdirs() && newdir.mkdirs() && image.createNewFile();
} catch (SecurityException Se) {
System.out.println("Error while creating directory in Java:" + Se);
}

if (dirFlag)
   System.out.println("Directory created successfully");
else
   System.out.println("Directory is already there");
}
}


