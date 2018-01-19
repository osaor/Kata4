package kata4;
import java.util.ArrayList;

public class MailHistogramBuilder {
   public static Histogram <String> builder(ArrayList<String> mail){
   Histogram histo= new Histogram<>();
       for (String mail1 : mail) {
           histo.increment(new Mail(mail1).getDomain());
           
       }
       return histo;
   } 
}