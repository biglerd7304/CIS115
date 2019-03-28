
// CIS 115
// M1LAB
// name and age conversation
// the plan:
// say it back
// ask their age
// add one to it
// say it back
// done

// add imports
import java.lang.String;
import java.until.scanner; // for input


class Main {
  public static void main(String[] args) {
    // ask the user their name
    System.out.println("What is your name?");
    String name;
    name = inputString();
    System.out.println("Hello" + name);
  }

  public static void println(String text) {
    // print the text, plus a CR
    System.out.println(text);
  }
  public static String inputString() {
    // ask the user to type  input
    // and return it
    Scanner in = new Scanner(System.in);
    String Line;
    line = in.nextLine() ;
    return line;
  }

}