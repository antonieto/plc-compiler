import java.io.*;

class Main {

    public static PrintStream out;

    private static int varCount = 0;
    public static String newVar() {
        String var = "$" + varCount;
        varCount++;
        return var;
    }

    private static int labelCount = 0;
    public static String newLabel() {
        String label = "$" + labelCount;
        labelCount++;
        return label;
    }

    public static void main(String[] args) throws FileNotFoundException {
        out = System.out;
        parser p = null;
        if (args.length == 1) {
            p = new parser(new Yylex(new FileReader(args[0])));
        } else {
            p = new parser(new Yylex(new InputStreamReader(System.in)));
        }

        try {
            if (p != null) {
                p.parse();
            }
        } catch (Exception e){
        }
    }
}
