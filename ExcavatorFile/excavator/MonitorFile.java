package excavator;
import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;

public class MonitorFile {
	
	public  String doWath(String directory) throws IOException {

	       System.out.println("WatchService in " + directory);

	       // Obtenemos el directorio
	       Path directoryToWatch = Paths.get(directory);
	       if (directoryToWatch == null) {
	           throw new UnsupportedOperationException("Directory not found");
	       }

	       // Solicitamos el servicio WatchService
	       WatchService watchService = directoryToWatch.getFileSystem().newWatchService();

	       // Registramos los eventos que queremos monitorear
	       directoryToWatch.register(watchService, new WatchEvent.Kind[] {ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY});

	       System.out.println("Started WatchService in " + directory);

	       try {

	           // Esperamos que algo suceda con el directorio
	           WatchKey key = watchService.take();

	           // Algo ocurrio en el directorio para los eventos registrados
	           while (key != null) {
	               for (WatchEvent event : key.pollEvents()) {
	                   String eventKind = event.kind().toString();
	                   String file = event.context().toString();
	                    return file;
	               }

	               // Volvemos a escuchar. Lo mantenemos en un loop para escuchar indefinidamente.
	               key.reset();
	               key = watchService.take();
	           }
	       } catch (InterruptedException e) {
	           throw new RuntimeException(e);
	       }
		return null;
	   }

	}



