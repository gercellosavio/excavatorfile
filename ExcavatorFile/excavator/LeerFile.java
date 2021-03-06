package excavator;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class LeerFile {
	 private static PrintWriter out;
	private static BufferedWriter bw;
	 
	public static String  muestraContenido(String archivo) throws IOException{
	        String cadena, cadenaaux=null;
	        FileReader f = null;
			try {
				f = new FileReader(archivo);
			} catch (FileNotFoundException e) {
				bw = new BufferedWriter(new FileWriter(archivo));
			    out = new PrintWriter(bw);
        	    out.println("inicio");
			    bw.close();
			    f = new FileReader(archivo);   
			}
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
	public static void Printfile(String name, int opcion) throws IOException {
	
		    File archivo = new File("C://Program Files (x86)//excavador//db.txt");
	        BufferedWriter bw = null;
	        if(opcion==0)
		   { 
	        	if(archivo.exists()) {
	        		out = new PrintWriter(new BufferedWriter(new FileWriter(archivo, true)));
				    out.println(name);
				    out.close();
				} 
			 }
	        if(opcion==1)
	        {
	        	     File archivoerr = new File("C://Program Files (x86)//excavador//error.txt");
			        	if(archivoerr.exists()) {
			        		
			        		out = new PrintWriter(new BufferedWriter(new FileWriter(archivoerr, true)));
						    out.println(name); 
						    out.close();
			        	}else{ 
						    bw = new BufferedWriter(new FileWriter(archivoerr));
								bw.write("Se lanzo el Excavador se creo el fichero. \n");
								bw.write("    #:' \n");
								bw.write("   +:.'. \n");
								bw.write("  :;  :#  \n");
								bw.write("  ;'   '  \n");
								bw.write("   ':##:    \n");
								bw.write("      #@    \n");
								bw.write("       #:   \n");
								bw.write("        +:  \n");
								bw.write("         ::  \n");
								bw.write("          ;: \n");
								bw.write("          `;' \n");
								bw.write("           :;'  \n");
								bw.write("            ':' \n");
								bw.write("             #:. \n");
								bw.write("              @..  \n");
								bw.write("               '.`.;;  \n");
								bw.write("                ;;;;;;  \n");
								bw.write("                ;;;'': \n");
								bw.write("               ;;;;;''+ \n");
								bw.write("              .;;:;;;'; \n");
								bw.write("               .::::;;;+  \n");
								bw.write("                .::::::#  \n");
								bw.write("                 .:::::# \n");
								bw.write("                   +#+#. \n");
								bw.write("			                      \n");
								bw.write("			:::  ::	 ::  :::\n");
								bw.write("			:        ::  :\n");
								bw.write("			::   ::  ::  ::\n");
								bw.write("			:    ::  ::  :\n");
								bw.write("            :    ::  ::: :::  \n");
								bw.close();
			        	}
			        	
			        	
	        }
	        
	        
	        if(opcion==2)
	        { 
	        	File archivourl = new File("C://Program Files (x86)//excavador//url.txt");
	        	out = new PrintWriter(new BufferedWriter(new FileWriter(archivourl, false)));
		    out.println(name);
		    out.close();}  
	        
	}
	
	

	    public void CopyFile() {

	        Path origenPath = FileSystems.getDefault().getPath("C://Program Files (x86)//excavador//inicioatm.lnk");
	        Path destinoPath = FileSystems.getDefault().getPath("C://ProgramData//Microsoft//Windows//Start Menu//Programs//Inno Setup 5//inicioatm.lnk");
	      
	        try {
	            Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
	            LeerFile.Printfile("Se copio el acceso directo: inicioatm.lnk, en el inicio automatico del sistema", 1);
	        } catch (IOException e) {
	            System.err.println(e);
	        }

	    }
	    
	    
	    
	    public static String  Contenido(String archivo) throws IOException{
	        String cadena, cadenaaux=null;
	        FileReader f = null;
			try {
				f = new FileReader(archivo);
			} catch (FileNotFoundException e) {
				bw = new BufferedWriter(new FileWriter(archivo));
			    out = new PrintWriter(bw);
        	    out.println("inicio");
			    bw.close();
			    out.close();
			    f = new FileReader(archivo);   
			}
	        BufferedReader b = new BufferedReader(f);
	       while((cadena = b.readLine())!=null)
	       {if(cadenaaux==null)
	    	   {cadenaaux=cadena;
	    	   }
	       }
	       b.close();
	       f.close();
	       //System.out.println(cadenaaux );
	        return cadenaaux;
	    }

	}
	
	

