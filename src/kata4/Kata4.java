package kata4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
 
public class Kata4{ 
    public static void main(String[] args)  throws IOException, FileNotFoundException{
        String fileName="emailsfilev1.txt";
        ArrayList<String> mailList= MailListReader.read(fileName); 
        Histogram <String> histogram = MailHistogramBuilder.builder(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}