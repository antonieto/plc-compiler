
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\002\003\000\002\002\004\000\002\002" +
    "\004\000\002\003\004\000\002\003\010\000\002\003\007" +
    "\000\002\003\011\000\002\003\013\000\002\003\007\000" +
    "\002\003\005\000\002\006\002\000\002\006\004\000\002" +
    "\004\005\000\002\004\005\000\002\004\005\000\002\004" +
    "\005\000\002\004\004\000\002\004\005\000\002\004\005" +
    "\000\002\004\003\000\002\004\003\000\002\005\005\000" +
    "\002\005\005\000\002\005\005\000\002\005\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\004\000\002\005" +
    "\005\000\002\005\005\000\002\005\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\124\000\026\004\013\006\006\007\020\010\010\011" +
    "\016\012\011\014\012\021\004\036\007\037\005\001\002" +
    "\000\012\012\011\021\004\036\007\037\005\001\002\000" +
    "\036\013\uffed\016\uffed\020\uffed\021\uffed\023\uffed\024\uffed" +
    "\025\uffed\026\uffed\027\uffed\030\uffed\031\uffed\032\uffed\034" +
    "\uffed\035\uffed\001\002\000\004\012\122\001\002\000\040" +
    "\013\uffee\016\uffee\017\120\020\uffee\021\uffee\023\uffee\024" +
    "\uffee\025\uffee\026\uffee\027\uffee\030\uffee\031\uffee\032\uffee" +
    "\034\uffee\035\uffee\001\002\000\004\012\110\001\002\000" +
    "\012\012\011\021\004\036\007\037\005\001\002\000\026" +
    "\004\013\006\006\007\020\010\010\011\016\012\011\014" +
    "\012\021\004\036\007\037\005\001\002\000\004\012\076" +
    "\001\002\000\014\016\075\020\042\021\036\023\045\024" +
    "\037\001\002\000\032\002\001\004\001\006\001\007\001" +
    "\010\001\011\001\012\001\014\001\015\001\021\001\036" +
    "\001\037\001\001\002\000\004\012\071\001\002\000\030" +
    "\002\067\004\013\006\006\007\020\010\010\011\016\012" +
    "\011\014\012\021\004\036\007\037\005\001\002\000\026" +
    "\004\013\006\006\007\020\010\010\011\016\012\011\014" +
    "\012\021\004\036\007\037\005\001\002\000\004\006\022" +
    "\001\002\000\004\012\023\001\002\000\014\012\025\021" +
    "\004\033\024\036\007\037\005\001\002\000\012\012\011" +
    "\021\004\036\007\037\005\001\002\000\014\012\025\021" +
    "\004\033\024\036\007\037\005\001\002\000\026\020\042" +
    "\021\036\023\045\024\037\025\043\026\041\027\046\030" +
    "\047\031\044\032\040\001\002\000\010\013\031\034\030" +
    "\035\032\001\002\000\014\012\025\021\004\033\024\036" +
    "\007\037\005\001\002\000\004\016\034\001\002\000\014" +
    "\012\025\021\004\033\024\036\007\037\005\001\002\000" +
    "\012\013\uffe4\016\uffe4\034\030\035\uffe4\001\002\000\034" +
    "\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011" +
    "\ufffb\012\ufffb\014\ufffb\015\ufffb\021\ufffb\036\ufffb\037\ufffb" +
    "\001\002\000\012\013\uffe5\016\uffe5\034\uffe5\035\uffe5\001" +
    "\002\000\012\012\011\021\004\036\007\037\005\001\002" +
    "\000\012\012\011\021\004\036\007\037\005\001\002\000" +
    "\012\012\011\021\004\036\007\037\005\001\002\000\012" +
    "\012\011\021\004\036\007\037\005\001\002\000\012\012" +
    "\011\021\004\036\007\037\005\001\002\000\012\012\011" +
    "\021\004\036\007\037\005\001\002\000\012\012\011\021" +
    "\004\036\007\037\005\001\002\000\012\012\011\021\004" +
    "\036\007\037\005\001\002\000\012\012\011\021\004\036" +
    "\007\037\005\001\002\000\012\012\011\021\004\036\007" +
    "\037\005\001\002\000\022\013\uffe9\016\uffe9\020\042\021" +
    "\036\023\045\024\037\034\uffe9\035\uffe9\001\002\000\022" +
    "\013\uffea\016\uffea\020\042\021\036\023\045\024\037\034" +
    "\uffea\035\uffea\001\002\000\036\013\ufff3\016\ufff3\020\ufff3" +
    "\021\ufff3\023\ufff3\024\ufff3\025\ufff3\026\ufff3\027\ufff3\030" +
    "\ufff3\031\ufff3\032\ufff3\034\ufff3\035\ufff3\001\002\000\022" +
    "\013\uffe8\016\uffe8\020\042\021\036\023\045\024\037\034" +
    "\uffe8\035\uffe8\001\002\000\022\013\uffec\016\uffec\020\042" +
    "\021\036\023\045\024\037\034\uffec\035\uffec\001\002\000" +
    "\036\013\ufff5\016\ufff5\020\ufff5\021\ufff5\023\045\024\037" +
    "\025\ufff5\026\ufff5\027\ufff5\030\ufff5\031\ufff5\032\ufff5\034" +
    "\ufff5\035\ufff5\001\002\000\022\013\uffeb\016\uffeb\020\042" +
    "\021\036\023\045\024\037\034\uffeb\035\uffeb\001\002\000" +
    "\022\013\uffe7\016\uffe7\020\042\021\036\023\045\024\037" +
    "\034\uffe7\035\uffe7\001\002\000\036\013\ufff2\016\ufff2\020" +
    "\ufff2\021\ufff2\023\ufff2\024\ufff2\025\ufff2\026\ufff2\027\ufff2" +
    "\030\ufff2\031\ufff2\032\ufff2\034\ufff2\035\ufff2\001\002\000" +
    "\036\013\ufff4\016\ufff4\020\ufff4\021\ufff4\023\045\024\037" +
    "\025\ufff4\026\ufff4\027\ufff4\030\ufff4\031\ufff4\032\ufff4\034" +
    "\ufff4\035\ufff4\001\002\000\030\013\065\020\042\021\036" +
    "\023\045\024\037\025\043\026\041\027\046\030\047\031" +
    "\044\032\040\001\002\000\010\013\064\034\030\035\032" +
    "\001\002\000\012\013\uffe3\016\uffe3\034\uffe3\035\uffe3\001" +
    "\002\000\036\013\ufff0\016\ufff0\020\ufff0\021\ufff0\023\ufff0" +
    "\024\ufff0\025\ufff0\026\ufff0\027\ufff0\030\ufff0\031\ufff0\032" +
    "\ufff0\034\ufff0\035\ufff0\001\002\000\022\013\uffe6\016\uffe6" +
    "\020\042\021\036\023\045\024\037\034\uffe6\035\uffe6\001" +
    "\002\000\004\002\000\001\002\000\032\002\uffff\004\uffff" +
    "\006\uffff\007\uffff\010\uffff\011\uffff\012\uffff\014\uffff\015" +
    "\uffff\021\uffff\036\uffff\037\uffff\001\002\000\012\012\011" +
    "\021\004\036\007\037\005\001\002\000\014\013\073\020" +
    "\042\021\036\023\045\024\037\001\002\000\004\016\074" +
    "\001\002\000\034\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007" +
    "\ufff9\010\ufff9\011\ufff9\012\ufff9\014\ufff9\015\ufff9\021\ufff9" +
    "\036\ufff9\037\ufff9\001\002\000\034\002\ufffe\004\ufffe\005" +
    "\ufffe\006\ufffe\007\ufffe\010\ufffe\011\ufffe\012\ufffe\014\ufffe" +
    "\015\ufffe\021\ufffe\036\ufffe\037\ufffe\001\002\000\014\012" +
    "\025\021\004\033\024\036\007\037\005\001\002\000\010" +
    "\013\100\034\030\035\032\001\002\000\026\004\013\006" +
    "\006\007\020\010\010\011\016\012\011\014\012\021\004" +
    "\036\007\037\005\001\002\000\034\002\ufff7\004\ufff7\005" +
    "\103\006\ufff7\007\ufff7\010\ufff7\011\ufff7\012\ufff7\014\ufff7" +
    "\015\ufff7\021\ufff7\036\ufff7\037\ufff7\001\002\000\034\002" +
    "\ufffd\004\ufffd\005\ufffd\006\ufffd\007\ufffd\010\ufffd\011\ufffd" +
    "\012\ufffd\014\ufffd\015\ufffd\021\ufffd\036\ufffd\037\ufffd\001" +
    "\002\000\026\004\013\006\006\007\020\010\010\011\016" +
    "\012\011\014\012\021\004\036\007\037\005\001\002\000" +
    "\034\002\ufff6\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6" +
    "\011\ufff6\012\ufff6\014\ufff6\015\ufff6\021\ufff6\036\ufff6\037" +
    "\ufff6\001\002\000\030\004\013\006\006\007\020\010\010" +
    "\011\016\012\011\014\012\015\106\021\004\036\007\037" +
    "\005\001\002\000\034\002\ufff8\004\ufff8\005\ufff8\006\ufff8" +
    "\007\ufff8\010\ufff8\011\ufff8\012\ufff8\014\ufff8\015\ufff8\021" +
    "\ufff8\036\ufff8\037\ufff8\001\002\000\014\013\065\020\042" +
    "\021\036\023\045\024\037\001\002\000\012\012\011\021" +
    "\004\036\007\037\005\001\002\000\014\016\112\020\042" +
    "\021\036\023\045\024\037\001\002\000\014\012\025\021" +
    "\004\033\024\036\007\037\005\001\002\000\010\016\114" +
    "\034\030\035\032\001\002\000\012\012\011\021\004\036" +
    "\007\037\005\001\002\000\014\013\116\020\042\021\036" +
    "\023\045\024\037\001\002\000\026\004\013\006\006\007" +
    "\020\010\010\011\016\012\011\014\012\021\004\036\007" +
    "\037\005\001\002\000\034\002\ufffa\004\ufffa\005\ufffa\006" +
    "\ufffa\007\ufffa\010\ufffa\011\ufffa\012\ufffa\014\ufffa\015\ufffa" +
    "\021\ufffa\036\ufffa\037\ufffa\001\002\000\012\012\011\021" +
    "\004\036\007\037\005\001\002\000\036\013\uffef\016\uffef" +
    "\020\042\021\036\023\045\024\037\025\uffef\026\uffef\027" +
    "\uffef\030\uffef\031\uffef\032\uffef\034\uffef\035\uffef\001\002" +
    "\000\014\012\025\021\004\033\024\036\007\037\005\001" +
    "\002\000\010\013\124\034\030\035\032\001\002\000\026" +
    "\004\013\006\006\007\020\010\010\011\016\012\011\014" +
    "\012\021\004\036\007\037\005\001\002\000\034\002\ufffc" +
    "\004\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc\011\ufffc\012" +
    "\ufffc\014\ufffc\015\ufffc\021\ufffc\036\ufffc\037\ufffc\001\002" +
    "\000\036\013\ufff1\016\ufff1\020\ufff1\021\ufff1\023\ufff1\024" +
    "\ufff1\025\ufff1\026\ufff1\027\ufff1\030\ufff1\031\ufff1\032\ufff1" +
    "\034\ufff1\035\ufff1\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\124\000\010\002\016\003\014\004\013\001\001\000" +
    "\004\004\125\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\106\001" +
    "\001\000\010\002\104\003\014\004\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\003\067\004\013\001\001\000\006\003\020" +
    "\004\013\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\004\025\005\026\001\001\000\004\004\065\001\001" +
    "\000\006\004\061\005\062\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\004\025\005\034\001\001\000\002" +
    "\001\001\000\006\004\025\005\032\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\060" +
    "\001\001\000\004\004\057\001\001\000\004\004\056\001" +
    "\001\000\004\004\055\001\001\000\004\004\054\001\001" +
    "\000\004\004\053\001\001\000\004\004\052\001\001\000" +
    "\004\004\051\001\001\000\004\004\050\001\001\000\004" +
    "\004\047\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\071\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\004\025\005\076\001\001\000\002" +
    "\001\001\000\006\003\100\004\013\001\001\000\004\006" +
    "\101\001\001\000\002\001\001\000\006\003\103\004\013" +
    "\001\001\000\002\001\001\000\006\003\067\004\013\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\110" +
    "\001\001\000\002\001\001\000\006\004\025\005\112\001" +
    "\001\000\002\001\001\000\004\004\114\001\001\000\002" +
    "\001\001\000\006\003\116\004\013\001\001\000\002\001" +
    "\001\000\004\004\120\001\001\000\002\001\001\000\006" +
    "\004\025\005\122\001\001\000\002\001\001\000\006\003" +
    "\124\004\013\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  public parser (java.io.Reader input) {
    super(new Yylex(input));
  }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // statement_list ::= statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= statement_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statement_list ::= statement_list statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statement ::= expression SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // statement ::= IF LPAR condition RPAR statement elseStatement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // statement ::= WHILE LPAR condition RPAR statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // statement ::= DO statement WHILE LPAR condition RPAR SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // statement ::= FOR LPAR expression SEMI condition SEMI expression RPAR statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // statement ::= PRINT LPAR expression RPAR SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // statement ::= LCURL statement_list RCURL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // elseStatement ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("elseStatement",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // elseStatement ::= ELSE statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("elseStatement",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expression ::= expression PLUS expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expression ::= expression MINUS expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expression ::= expression TIMES expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expression ::= expression DIVIDE expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expression ::= MINUS expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expression ::= LPAR expression RPAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expression ::= IDENT ASIGN expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expression ::= IDENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expression ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expression",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // condition ::= expression EQ expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // condition ::= expression NOTEQ expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // condition ::= expression LT expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // condition ::= expression LTEQ expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // condition ::= expression GT expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // condition ::= expression GTEQ expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // condition ::= NOT expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // condition ::= condition AND condition 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // condition ::= condition OR condition 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // condition ::= LPAR condition RPAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}