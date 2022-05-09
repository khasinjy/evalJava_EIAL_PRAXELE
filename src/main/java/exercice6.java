import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class exercice6 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) throw new IOException("No arguments passed.");
        int port = Integer.parseInt(args[0]);
        createServer(port);
    }

    private static <IOutputStream> void createServer(int port) throws IOException {

        ServerSocket serverSocket = new ServerSocket(port);

        Socket socket = serverSocket.accept();

        InputStream input = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String message = reader.readLine() + "\n";

        OutputStream output = socket.getOutputStream();
        output.write(message.getBytes(StandardCharsets.UTF_8));

        System.out.println("Fin");
        socket.close();

    }
}
