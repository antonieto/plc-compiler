import java.io.*;

class Main {

    public static PrintStream out;
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
