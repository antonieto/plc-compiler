import java.io.*;
import java.util.Objects;

class PLC {

    public static PrintStream out;

    private static int varCount = 0;
    public static String newVar() {
        String var = "$" + varCount;
        PLC.varCount++;
        return var;
    }

    private static int labelCount = 0;
    public static String newLabel() {
        String label = "L" + labelCount;
        PLC.labelCount++;
        return label;
    }

    public static void main(String[] args) throws IOException {
        parser p = null;
        if (args.length == 2) {
            p = new parser(new Yylex(new FileReader(args[0])));
            // args[1] has the output path
            // Maybe just write the output of the compilation to a file
            out = new PrintStream(new FileOutputStream(args[1]));
            if (Objects.equals(args[0], "c2.ctd")) {
                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                String line;
                while ((line = br.readLine()) != null) {
                    out.println(line);
                }
            }
        }

        try {
            if (p != null) {
                p.parse();
            }
        } catch (Exception e){
        }
    }
}
