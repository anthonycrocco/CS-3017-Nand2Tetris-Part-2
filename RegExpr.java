import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
public class RegExpr{
// slide 107 chapter 10 slides
  public static void main(String[] args) {
    String code = "class Square { var int x, y; let x = x +  200; }" ;
    String keyWords = "class|var|let|if|do|int|,|";
    String symbols = "[\\{\\}\\=\\+]";
    String integers = "[0-9]+";
    String strCount = "[ \n]* \" ";      // dont need this

    // String string =
    // String identifier = 
    Pattern pattern = Pattern.compile(keyWords + symbols + "|" + integers + "|" + strCount);    // string matches
    Matcher matcher = pattern.matcher(code);
    ArrayList<String> tokens = new ArrayList<String>();
    while (matcher.find()){

   //   System.out.println(matcher.group());
      tokens.add(matcher.group());
    }
    for (String str : tokens) {
       System.out.println(str);
    }
  }


}
// print writer class
// buffer writer class
// file writer class