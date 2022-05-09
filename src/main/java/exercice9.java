import java.io.IOException;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.TreeMap;

public class exercice9 {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) throw new IOException("No arguments passed.");
        sortWordsByAsciiValue(args);
    }

    private static void sortWordsByAsciiValue(String[] args) {
        SortedMap<Integer, String> map = new TreeMap();
        for (String word : args) {
            map.put(getAscii(word), word);
        }

        displaySortedMap(map);
    }

    private static void displaySortedMap(SortedMap<Integer, String> map) {
        for (String value : map.values())
        {
            System.out.println(value);
        }
    }

    private static int getAscii(String word) {
        int sum=0;
        for(int i=0; i<word.length(); i++)
        {
            int asciiValue = word.charAt(i);
            sum = sum+ asciiValue;
        }
        return sum;
    }
}
