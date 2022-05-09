import java.io.*;

public class exercice3 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) throw new IOException("No arguments passed.");
        String src = args[0];
        String destination = args[1];
        try{
            merge(src, destination);
            System.out.println("Fusion finie");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void merge(String src, String destination) throws IOException {
        int bufferSize = 10240;
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src), bufferSize);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination, true), bufferSize);
        bis.transferTo(bos);
        bis.close();
        bos.close();
    }
}
