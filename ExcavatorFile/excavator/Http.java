package excavator;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class Http {
	
	
	public static  void estableceComunicacion(String clave ,String valor,String clave2,String valor2) {
	        Map <String,String> datosEnv=new HashMap<String,String>();
	        datosEnv.put(clave,valor);
	        datosEnv.put(clave2,valor2);       
	        Gson gson = new Gson();
	        String jsonOutput = gson.toJson(datosEnv);       
	       try{
	          //Usamos URLencode para poder enviar la cadena
	          jsonOutput = URLEncoder.encode("key", "UTF-8") + "=" + URLEncoder.encode(jsonOutput, "UTF-8");
	          //Establecemos la conexion y enviamos los datos
	          URL url=new URL("http://201.243.212.85/excavador/testpost.php");
	          URLConnection con = (URLConnection) url.openConnection();
	          con.setDoOutput(true);
	          OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
	          wr.write(jsonOutput);
	          wr.flush();
	          //Recibimos los datos
	          BufferedReader recv = new BufferedReader(new InputStreamReader(con.getInputStream()));
	          //Los mostramos por pantalla
	          String s=recv.readLine();
	          while(s!=null){
	                  System.out.println(s);
	                  s=recv.readLine();
	                }
	       }catch (Exception e){
	           //System.out.println(e.getMessage());
	       }

	    }

	
	
}
