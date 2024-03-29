// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: /Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/PLXC.flex

import java_cup.runtime.*;


@SuppressWarnings("fallthrough")
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\5\u0100\1\u0200\1\u0300\1\u0100\5\u0400\1\u0500\1\u0600"+
    "\1\u0700\6\u0100\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00"+
    "\3\u0100\1\u0e00\205\u0100\1\u0600\1\u0100\1\u0f00\1\u1000\1\u1100"+
    "\1\u1200\54\u0100\10\u1300\37\u0100\1\u0900\4\u0100\1\u1400\10\u0100"+
    "\1\u1500\2\u0100\1\u1600\1\u1700\1\u1200\1\u0100\1\u0500\1\u0100"+
    "\1\u1800\1\u1500\1\u0800\3\u0100\1\u1100\1\u1900\114\u0100\1\u1a00"+
    "\1\u1100\153\u0100\1\u1b00\11\u0100\1\u1c00\1\u1200\6\u0100\1\u1100"+
    "\u0f16\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\2\4\22\0\1\1\1\5"+
    "\1\6\3\0\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\12\21\1\0\1\22\1\23"+
    "\1\24\1\25\2\0\4\26\1\27\25\26\1\30\1\31"+
    "\1\32\3\0\1\33\1\26\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\2\26\1\43\1\26\1\44\1\45"+
    "\1\46\1\26\1\47\1\50\1\51\2\26\1\52\3\26"+
    "\1\53\1\54\1\55\7\0\1\3\u01da\0\12\56\206\0"+
    "\12\56\306\0\12\56\234\0\12\56\166\0\12\56\140\0"+
    "\12\56\166\0\12\56\106\0\12\56\u0116\0\12\56\106\0"+
    "\12\56\u0146\0\12\56\46\0\12\56\u012c\0\12\56\200\0"+
    "\12\56\246\0\12\56\6\0\12\56\266\0\12\56\126\0"+
    "\12\56\206\0\12\56\6\0\12\56\316\0\2\3\u01a6\0"+
    "\12\56\46\0\12\56\306\0\12\56\26\0\12\56\126\0"+
    "\12\56\u0196\0\12\56\6\0\u0100\3\240\0\12\56\206\0"+
    "\12\56\u012c\0\12\56\200\0\12\56\74\0\12\56\220\0"+
    "\12\56\166\0\12\56\146\0\12\56\206\0\12\56\106\0"+
    "\12\56\266\0\12\56\u0164\0\62\56\100\0\12\56\266\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[7424];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\3\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\10\21\1\24\1\1"+
    "\1\25\1\26\1\27\1\0\1\30\1\0\1\31\1\0"+
    "\1\32\1\2\2\0\1\33\1\34\1\35\1\21\1\36"+
    "\3\21\1\37\4\21\1\40\1\26\1\0\1\26\3\21"+
    "\1\41\1\42\3\21\1\43\3\21\1\44\1\21\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[77];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\57\0\136\0\215\0\274\0\353\0\57"+
    "\0\57\0\57\0\57\0\57\0\57\0\57\0\u011a\0\u0149"+
    "\0\57\0\u0178\0\u01a7\0\u01d6\0\u0205\0\57\0\57\0\u0234"+
    "\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\57"+
    "\0\u03ac\0\57\0\u03db\0\57\0\215\0\57\0\u040a\0\57"+
    "\0\353\0\57\0\u0439\0\u0468\0\u0497\0\57\0\57\0\57"+
    "\0\u04c6\0\u0205\0\u04f5\0\u0524\0\u0553\0\u0205\0\u0582\0\u05b1"+
    "\0\u05e0\0\u060f\0\57\0\u063e\0\u066d\0\u066d\0\u069c\0\u06cb"+
    "\0\u06fa\0\u0205\0\u0205\0\u0729\0\u0758\0\u0787\0\u0205\0\u07b6"+
    "\0\u07e5\0\u0814\0\u0205\0\u0843\0\u0205";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[77];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\2\25\1\26\1\2"+
    "\1\27\1\25\1\30\1\31\1\32\1\33\2\25\1\34"+
    "\3\25\1\35\1\25\1\36\1\25\1\37\1\40\1\41"+
    "\1\42\1\43\103\0\1\44\32\0\6\45\1\46\22\45"+
    "\1\47\25\45\7\0\1\50\47\0\2\51\1\0\5\51"+
    "\1\52\46\51\20\0\1\53\55\0\1\54\1\0\1\20"+
    "\5\0\1\55\26\0\1\43\24\0\1\56\56\0\1\57"+
    "\56\0\1\60\53\0\1\25\4\0\2\25\3\0\20\25"+
    "\25\0\1\25\4\0\2\25\3\0\6\25\1\61\11\25"+
    "\25\0\1\25\4\0\2\25\3\0\12\25\1\62\5\25"+
    "\25\0\1\25\4\0\2\25\3\0\10\25\1\63\7\25"+
    "\25\0\1\25\4\0\2\25\3\0\10\25\1\64\1\25"+
    "\1\65\5\25\25\0\1\25\4\0\2\25\3\0\4\25"+
    "\1\66\4\25\1\67\6\25\25\0\1\25\4\0\2\25"+
    "\3\0\14\25\1\70\3\25\25\0\1\25\4\0\2\25"+
    "\3\0\16\25\1\71\1\25\25\0\1\25\4\0\2\25"+
    "\3\0\6\25\1\72\11\25\60\0\1\73\21\0\1\54"+
    "\1\0\1\43\5\0\1\55\26\0\1\43\2\45\3\0"+
    "\52\45\2\53\3\0\52\53\21\0\1\74\34\0\1\74"+
    "\14\0\1\75\1\0\1\75\2\0\1\76\34\0\1\76"+
    "\21\0\1\25\4\0\2\25\3\0\1\77\17\25\25\0"+
    "\1\25\4\0\2\25\3\0\15\25\1\100\2\25\25\0"+
    "\1\25\4\0\2\25\3\0\12\25\1\101\5\25\25\0"+
    "\1\25\4\0\2\25\3\0\14\25\1\102\3\25\25\0"+
    "\1\25\4\0\2\25\3\0\16\25\1\103\1\25\25\0"+
    "\1\25\4\0\2\25\3\0\7\25\1\104\10\25\25\0"+
    "\1\25\4\0\2\25\3\0\14\25\1\105\3\25\25\0"+
    "\1\25\4\0\2\25\3\0\7\25\1\106\10\25\25\0"+
    "\1\74\5\0\1\55\26\0\1\74\21\0\1\76\34\0"+
    "\1\76\21\0\1\25\4\0\2\25\3\0\14\25\1\103"+
    "\3\25\25\0\1\25\4\0\2\25\3\0\3\25\1\107"+
    "\14\25\25\0\1\25\4\0\2\25\3\0\1\67\17\25"+
    "\25\0\1\25\4\0\2\25\3\0\11\25\1\110\6\25"+
    "\25\0\1\25\4\0\2\25\3\0\7\25\1\111\10\25"+
    "\25\0\1\25\4\0\2\25\3\0\10\25\1\112\7\25"+
    "\25\0\1\25\4\0\2\25\3\0\16\25\1\113\1\25"+
    "\25\0\1\25\4\0\2\25\3\0\11\25\1\114\6\25"+
    "\25\0\1\25\4\0\2\25\3\0\3\25\1\115\14\25"+
    "\25\0\1\25\4\0\2\25\3\0\5\25\1\103\12\25"+
    "\4\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2162];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\4\1\7\11\2\1\1\11\4\1\2\11"+
    "\10\1\1\11\1\1\1\11\1\1\1\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\1\1\2\0\3\11\12\1"+
    "\1\11\1\1\1\0\20\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[77];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new Error("Illegal character <"+yytext()+">");
            }
          // fall through
          case 38: break;
          case 2:
            { 
            }
          // fall through
          case 39: break;
          case 3:
            { return new Symbol(sym.NOT);
            }
          // fall through
          case 40: break;
          case 4:
            { return new Symbol(sym.LPAR);
            }
          // fall through
          case 41: break;
          case 5:
            { return new Symbol(sym.RPAR);
            }
          // fall through
          case 42: break;
          case 6:
            { return new Symbol(sym.TIMES);
            }
          // fall through
          case 43: break;
          case 7:
            { return new Symbol(sym.PLUS);
            }
          // fall through
          case 44: break;
          case 8:
            { return new Symbol(sym.COMA);
            }
          // fall through
          case 45: break;
          case 9:
            { return new Symbol(sym.MINUS);
            }
          // fall through
          case 46: break;
          case 10:
            { return new Symbol(sym.DOT);
            }
          // fall through
          case 47: break;
          case 11:
            { return new Symbol(sym.DIVIDE);
            }
          // fall through
          case 48: break;
          case 12:
            { int value = Integer.valueOf(yytext()); return new Symbol(sym.INT, value);
            }
          // fall through
          case 49: break;
          case 13:
            { return new Symbol(sym.SEMI);
            }
          // fall through
          case 50: break;
          case 14:
            { return new Symbol(sym.LT);
            }
          // fall through
          case 51: break;
          case 15:
            { return new Symbol(sym.ASIGN);
            }
          // fall through
          case 52: break;
          case 16:
            { return new Symbol(sym.GT);
            }
          // fall through
          case 53: break;
          case 17:
            { return new Symbol(sym.IDENT, yytext().toString());
            }
          // fall through
          case 54: break;
          case 18:
            { return new Symbol(sym.LSQR);
            }
          // fall through
          case 55: break;
          case 19:
            { return new Symbol(sym.RSQR);
            }
          // fall through
          case 56: break;
          case 20:
            { return new Symbol(sym.LCURL);
            }
          // fall through
          case 57: break;
          case 21:
            { return new Symbol(sym.RCURL);
            }
          // fall through
          case 58: break;
          case 22:
            { float value = Float.valueOf(yytext()); return new Symbol(sym.FLOAT, value);
            }
          // fall through
          case 59: break;
          case 23:
            { return new Symbol(sym.NOTEQ);
            }
          // fall through
          case 60: break;
          case 24:
            { String strVal = yytext().toString().substring(1, yytext().toString().length() - 1); return new Symbol(sym.STRING, strVal);
            }
          // fall through
          case 61: break;
          case 25:
            { return new Symbol(sym.AND);
            }
          // fall through
          case 62: break;
          case 26:
            { String charVal = yytext().toString().substring(1, yytext().toString().length() - 1); return new Symbol(sym.CHAR, charVal);
            }
          // fall through
          case 63: break;
          case 27:
            { return new Symbol(sym.LTEQ);
            }
          // fall through
          case 64: break;
          case 28:
            { return new Symbol(sym.EQ);
            }
          // fall through
          case 65: break;
          case 29:
            { return new Symbol(sym.GTEQ);
            }
          // fall through
          case 66: break;
          case 30:
            { return new Symbol(sym.DO);
            }
          // fall through
          case 67: break;
          case 31:
            { return new Symbol(sym.IF);
            }
          // fall through
          case 68: break;
          case 32:
            { return new Symbol(sym.OR);
            }
          // fall through
          case 69: break;
          case 33:
            { return new Symbol(sym.FOR);
            }
          // fall through
          case 70: break;
          case 34:
            { return new Symbol(sym.TYPE, yytext());
            }
          // fall through
          case 71: break;
          case 35:
            { return new Symbol(sym.ELSE);
            }
          // fall through
          case 72: break;
          case 36:
            { return new Symbol(sym.PRINT);
            }
          // fall through
          case 73: break;
          case 37:
            { return new Symbol(sym.WHILE);
            }
          // fall through
          case 74: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
