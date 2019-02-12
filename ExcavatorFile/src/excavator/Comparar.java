package excavator;

import java.io.File;
import java.io.IOException;

public class Comparar implements Runnable {
	public  void run(){
		int y=0,x=0;
		String namefile = null;
		boolean ban = true;
		File dir = new File("C://Program Files (x86)//facturaecuador");    // url donde el sistema excava
		String[] ficheros = dir.list();                                        // lista de archivos 
		 System.out.println(ficheros[0]);
	      String ficherosdb = null;
	
			try {
				ficherosdb = LeerFile.muestraContenido("C://Program Files (x86)//excavador//db.txt"); // lectura de archivo db.txt para tener los files ya escaneados
			} catch (IOException e) {
				
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
	    				 ban=false;  
	    				
	    				 System.out.println("el nombre del fichero ya esta en la base de datos"+ficheros[x]);
	    				 }
	    			 
	    		     }
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 if(ban){
	    			 
	    			 System.out.println("no esta "+ficheros[x]);
			 		 LeerFile.Printfile(ficheros[x],0);
			 		LeerFile.Printfile("el nombre del fichero: "+ficheros[x]+" no esta en la base de datos se lanzo el proceso de incluir", 1);
			 				
			 			
	    	       }
	    		 ban = true;
	    		 
	    		 
	    		 
	    		 }
	    		
	    	
	    	}
	   }
	      //LeerFile.Printfile("C://Users//teaextgel//Desktop//Nueva carpeta//db");
	
	}


