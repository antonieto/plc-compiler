import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class PLXC {

    public static PrintStream out;

    private static int varCount = 0;
    public static String newVar() {
        String var = "$t" + varCount;
        PLXC.varCount++;
        return var;
    }

    private static int labelCount = 0;
    public static String newLabel() {
        String label = "L" + labelCount;
        PLXC.labelCount++;
        return label;
    }

    public static void main(String[] args) throws IOException {
        parser p = null;
        if (args.length == 2) {
            p = new parser(new Yylex(new FileReader(args[0])));
            PLXC.out = new PrintStream(new FileOutputStream(args[1]));
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

