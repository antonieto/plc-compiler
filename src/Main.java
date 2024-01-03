import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        parser p = null;
        if (args.length == 1) {
            p = new parser(new Yylex(new FileReader(args[0])));
        } else {
            p = new parser(new Yylex(new InputStreamReader(System.in)));
        }
    }
}
