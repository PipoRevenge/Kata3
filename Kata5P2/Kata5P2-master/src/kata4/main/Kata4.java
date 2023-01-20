package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
import kata4.view.MailListReaderBD;

public class Kata4 {
    public static String fileName;
    public static List<Mail> list;
    public static Histogram histogram;
    public static HistogramDisplay histogramDisplay;
    
    public static void main(String[] args) throws IOException {
        execute();
    }
    
    public static void execute() throws IOException{
        input();
        procces();
        output();
    }
    
    public static void input() throws IOException{
        fileName= "email.txt";
        list = MailListReader.read(fileName);
    }
    
    public static void procces(){
        histogram = MailHistogramBuilder.build(list);
    }
    
    public static void output(){
        histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}
