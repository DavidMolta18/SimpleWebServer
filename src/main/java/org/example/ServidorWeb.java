package org.example;
import java.net.*;


public final class ServidorWeb {
    public static void main(String argv[]) throws Exception {
        // Establece el número de puerto.
        int puerto = 6789;

        // Estableciendo el socket de escucha.
        ServerSocket servidor = new ServerSocket(puerto);

        // Procesando las solicitudes HTTP en un ciclo infinito.
        while (true) {
            // Escuchando las solicitudes de conexión TCP.
            Socket socket = servidor.accept();

            // Construye un objeto para procesar el mensaje de solicitud HTTP.
            SolicitudHttp solicitud = new SolicitudHttp(socket);

            // Crea un nuevo hilo para procesar la solicitud.
            Thread hilo = new Thread(solicitud);

            // Inicia el hilo.
            hilo.start();
        }
    }
}
