import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class exercice7 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) throw new IOException("No arguments passed.");
        int port = Integer.parseInt(args[0]);
        listenServer(port);
    }

    private static void listenServer(int port) throws IOException {
        byte[] b = new byte[1024];
        Socket mySocket = new Socket("localhost", port);

        InputStream input = mySocket.getInputStream();
        input.read(b);
        String textFromServer = new String(b, StandardCharsets.UTF_8);

        System.out.println("Fin");
        mySocket.close();

        System.out.println(textFromServer);
    }
}
