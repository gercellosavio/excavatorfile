package excavator;

import java.io.IOException;

public class Hilos  extends Thread {
	String nombre;
	String url;
	int i;
	    public Hilos(String nombre,int i)
	    {
	    	super(nombre);
	        this.nombre = nombre;
	       
	        this.i=i;
	    }

	    public void run()
	    {
	    	LeerFile.Printfile("el nombre del fichero: "+this.nombre+" no esta en la base de datos se lanzo el proceso de incluir", 1);
	    	 LeerFile.Printfile(this.nombre,0);
	    	LeerFile.Printfile("enviando archivo: "+this.nombre+" al servidor Numero de proceso:["+i+"] ", 1);
	 		
	    	try {
				Http.estableceComunicacion("txt", LeerFile.muestraContenido("C://Program Files (x86)//facturaecuador//"+this.nombre),"nombre",this.nombre);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				LeerFile.Printfile("error de respuesta"+e, 1);
		 		
				e.printStackTrace();
				
			}
	    	
	    }
	}

