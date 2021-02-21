       package CSC309REGULAR_EXPRESSION;
import java.io.InputStream;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
        
/**
 *
 * @author Jibrilla Alanjiro
 */
public class Main {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Scanner sn = new Scanner(System.in);
        
         
       String reg = ("\\w\\w\\w\\W\\d\\d\\w\\W\\d\\S");
       String value = ("CSC\\18D\\4429");
       Pattern pt = Pattern.compile(reg);
       Matcher mt = pt.matcher(value);
       boolean bool = mt.find();
      if(bool && value.length() <= 12){
          out.println("Your Id is Okay");
      }else{
         out.println("\t \tThe Given Format of your \n \t \tID Number is not accepted \n \t \tplease try   XXX\\18X\\1111");
    
      }
    }

    
}

