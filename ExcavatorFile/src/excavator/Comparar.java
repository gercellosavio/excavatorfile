package excavator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Comparar implements Runnable {
	public  void run(){
		File dir = new File("C://Users//teaextgel//Desktop//Nueva carpeta//");
		String[] ficheros = dir.list();
	      String ficherosdb = null;
		try {
			ficherosdb = LeerFile.muestraContenido("C://Users//teaextgel//Desktop//Nueva carpeta//db");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String[] ficherosdbarray = ficherosdb.split("-");
	      if (ficheros == null)
	    	  System.out.println("No hay ficheros en el directorio especificado");
	    	else { 
	    	 for (int x=0;x<ficherosdbarray.length;x++)
	    		 for (int y=0;y<ficheros.length;y++)
	    		 if(ficherosdbarray[x].equals(ficheros[y]))
	    	     {System.out.println(ficherosdbarray[x]);
	    	     }else{try {
					LeerFile.Printfile(ficheros[y]);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
	    	}
	      //LeerFile.Printfile("C://Users//teaextgel//Desktop//Nueva carpeta//db");
	
	}

}
