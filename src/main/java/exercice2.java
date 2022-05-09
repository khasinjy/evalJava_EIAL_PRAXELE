import java.io.*;

public class exercice2 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) throw new IOException("No arguments passed.");
        String src = args[0];
        String destination = args[1];
        try{
            cp(src, destination);
            System.out.println("Copie finie");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void cp(String src, String destination) throws IOException {
        int bufferSize = 10240;
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src), bufferSize);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination), bufferSize);
        bis.transferTo(bos);
        bis.close();
        bos.close();
    }
}
