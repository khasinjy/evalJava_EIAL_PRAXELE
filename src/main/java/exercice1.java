import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exercice1 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) throw new IOException("No arguments passed.");
            System.out.println(Stream.of(args)
                    .collect(Collectors.joining(" ")));
    }
}
