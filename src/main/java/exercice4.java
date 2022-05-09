import java.io.*;

public class exercice4 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) throw new IOException("No arguments passed.");
        String src = args[0];
        String destination = args[1];
        try{
            cpReverse(src, destination);
            System.out.println("Copie inversée finie");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void cpReverse(String src, String destination) throws IOException {
        RandomAccessFile fin = new RandomAccessFile(src, "r");
        FileOutputStream fout = new FileOutputStream(destination);
        for(long p = fin.length() - 1; p >= 0; p--) {
            fin.seek(p);
            int b = fin.read();
            fout.write(b);
        }
        fin.close();
        fout.close();
    }
}
