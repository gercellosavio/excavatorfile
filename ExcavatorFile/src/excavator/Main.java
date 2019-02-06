package excavator;


import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;




public class Main {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
	
		System.out.println("ejecutando Excavador");
		 ScheduledExecutorService scheduler
         = Executors.newSingleThreadScheduledExecutor();

		 Runnable task = new Comparar();
 int initialDelay = 1;
 int periodicDelay = 10;
 scheduler.scheduleAtFixedRate(task, initialDelay, periodicDelay,
         TimeUnit.SECONDS
 );
		
		
		
		
		//String file=null;
		// Monitor fileChangeWatcher = new Monitor();
	     // file =  fileChangeWatcher.doWath("C://Users//teaextgel//Desktop//Nueva carpeta//");
	     // System.out.println(file);
	    //  File dir = new File("C://Users//teaextgel//Desktop//Nueva carpeta//");
	     // LeerFile.muestraContenido("C://Users//teaextgel//Desktop//Nueva carpeta//"+file);// luego lo que se muestra en el archivo se manda por http
	    //  String[] ficheros = dir.list();
	     // String ficherosdb = LeerFile.muestraContenido("C://Users//teaextgel//Desktop//Nueva carpeta//db");
	     // System.out.println(ficherosdb );
	    
	      //String[] ficherosdbarray = ficherosdb.split("-");
	      //if (ficheros == null)
	    	 // System.out.println("No hay ficheros en el directorio especificado");
	    	//else { 
	    	// for (int x=0;x<ficherosdbarray.length;x++)
	    	//	 for (int y=0;y<ficheros.length;y++)
	    		// if(ficherosdbarray[x].equals(ficheros[y]))
	    	  //   {System.out.println(ficherosdbarray[x]);}
	    //	}
	     // LeerFile.Printfile("C://Users//teaextgel//Desktop//Nueva carpeta//db");

	}

}
