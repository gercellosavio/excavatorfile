package excavator;

import java.io.File;
import java.io.IOException;

public class Comparar implements Runnable {
	public  void run(){
		int y=0,x=0;
		String namefile = null;
		boolean ban = true;
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
	    		
	    		
	    		
	    		
	    		for ( x=0;x<ficheros.length;x++){
	    			
	    		 for ( y=0;y<ficherosdbarray.length;y++)
	    		     {
	    			 if(ficherosdbarray[y].equals(ficheros[x])){
	    				 ban=false;  System.out.println("el nombre del fichero ya esta en la base de datos"+ficheros[x]); }
	    			 
	    		     }
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 if(ban){
	    			 System.out.println("no esta "+ficheros[x]);
			 		 try {
						LeerFile.Printfile(ficheros[x]);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 				
			 			
	    	       }
	    		 ban = true;
	    		 
	    		 
	    		 
	    		 }
	    		
	    	
	    	}
	   }
	      //LeerFile.Printfile("C://Users//teaextgel//Desktop//Nueva carpeta//db");
	
	}


