package excavator;

import java.io.File;
import java.io.IOException;

public class Comparar implements Runnable {
	public  void run(){
		int y=0,x=0,con=0;
		
		boolean ban = true;
		String ficherosdb = null;
		String urlaexcavar = null;
		
		File banurl= new File("C://Program Files (x86)//excavador//url.txt");
		
		if(banurl.exists()==false){
		  BuscarUrl buscarurl= new BuscarUrl("C:", "formats","hiloprimario");
		  buscarurl.start();
		}
		
		try {
			  urlaexcavar=LeerFile.Contenido("C://Program Files (x86)//excavador//url.txt");
		   } catch (IOException e1) {
			   
			   System.out.println("error");
		   }

	    	System.out.println(urlaexcavar);
		if(!(urlaexcavar.equals("inicio"))){
		
		File dir = new File(urlaexcavar);    // url donde el sistema excava
		String[] ficheros = dir.list();                                        // lista de archivos 
		try {
				ficherosdb = LeerFile.muestraContenido("C://Program Files (x86)//excavador//db.txt"); // lectura de archivo db.txt para tener los files ya escaneados
		} catch (IOException e) {
		  e.printStackTrace();
		}
		String[] ficherosdbarray = ficherosdb.split("-");
	    if (ficheros == null)
	    {
	    	System.out.println("No hay ficheros en el directorio especificado");
	    }
	    else {

            for ( x=0;x<ficheros.length;x++){
	    			
	    		 for ( y=0;y<ficherosdbarray.length;y++)  {
	    			 if(ficherosdbarray[y].equals(ficheros[x])){
	    				 ban=false;  
	    				 System.out.println("el nombre del fichero ya esta en la base de datos"+ficheros[x]);
	    				 }
	    			 
	    		 }
	    		 if(ban){
	    			 System.out.println("no esta "+ficheros[x]);
			 		 Hilos hilo =new Hilos(ficheros[x],con);
			 		 hilo.start();
			 		 con++;	
			 	 }
	    		 ban = true;
	    	}
	    		
	    	
	    }
	   }
	 }   //LeerFile.Printfile("C://Users//teaextgel//Desktop//Nueva carpeta//db");

	private File[] File(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	}


