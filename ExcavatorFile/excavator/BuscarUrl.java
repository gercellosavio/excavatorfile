package excavator;

import java.io.*;

public class BuscarUrl extends Thread {
	String[] unidades1=null;
	String urldir,url,nomfile ;
	File[] com=null;
	public  BuscarUrl(String url,String nomfile, String nomhilo){
		super(nomhilo);
	    this.url=url+"//";
		File e=new File(this.url);
		 com=e.listFiles();
		this.unidades1 =e.list();
		this.nomfile=nomfile;		
	}
	
	public  void run(){
		String urlaexcavar=null;
		try {
			urlaexcavar=LeerFile.Contenido("C://Program Files (x86)//excavador//url.txt");
		} catch (IOException e1) {
			
		}
		if(urlaexcavar.equals("inicio"))
		{
			for (int i=0; i<this.unidades1.length; i++) {
				if(unidades1[i].equals(nomfile)){
					System.out.println("encontrado"+unidades1[i]);
					try {
						LeerFile.Printfile(this.url+this.unidades1[i], 2);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(com[i].isDirectory()){
					 
					System.out.println("no encontrado"+this.url+this.unidades1[i]+com[i]);
					BuscarUrl buscarurl= new BuscarUrl(this.url+this.unidades1[i],this.nomfile,"hilo"+this.unidades1[i]);
					buscarurl.start();
					
				 }
				  
			}	
			
		}
		
	}

}
