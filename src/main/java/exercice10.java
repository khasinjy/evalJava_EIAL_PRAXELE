import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercice10 {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) throw new IOException("No arguments passed.");
        if (args.length > 1) throw new IOException("Too many arguments passed.");
        String expr = args[0];
    }
}
