package excavator;
import java.io.*;

public class LeerFile {
	 public static String  muestraContenido(String archivo) throws FileNotFoundException, IOException {
	        String cadena, cadenaaux=null;
	        FileReader f = new FileReader(archivo);
	        BufferedReader b = new BufferedReader(f);
	       while((cadena = b.readLine())!=null)
	       {if(cadenaaux==null)
	    	   {cadenaaux=cadena+"-";
	    	   }else{
	    		   cadenaaux+=cadena+"-";}
	    	}
	       b.close();
	       //System.out.println(cadenaaux );
	        return cadenaaux;
	    }
	public static void Printfile(String name) throws IOException{
		
		 File archivo = new File("C://Users//teaextgel//Desktop//Nueva carpeta//db");
	        BufferedWriter bw = null;
	      
	        if(archivo.exists()) {
	        	            FileWriter fw = new FileWriter(archivo, true);
		            	    bw = new BufferedWriter(fw);
		            	    PrintWriter out = new PrintWriter(bw);
		            	    out.println(name);
		    } else {
	           
	        	bw = new BufferedWriter(new FileWriter(archivo));
	            bw.write("se creo el fichero.");
	        }
	     
	        bw.close();
	}
	
	
	
	
}
