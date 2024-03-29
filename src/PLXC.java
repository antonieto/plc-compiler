import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
public class PLXC {

    public static PrintStream out;

    // Just a hack to access type throughout declaration statement

    public static void main(String[] args) throws IOException {
        parser p = null;
        if (args.length == 2) {
            p = new parser(new Yylex(new FileReader(args[0])));
            PLXC.out = new PrintStream(new FileOutputStream(args[1]));
        } else if (args.length == 1){
            p = new parser(new Yylex(new FileReader(args[0])));
            out = System.out;
        } else {
            out = System.out;
        }

        try {
            if (p != null) {
                p.parse();
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

