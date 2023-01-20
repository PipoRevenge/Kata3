package kata4.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {

    public static List<Mail> read (String filename) throws FileNotFoundException, IOException {
        List<Mail> mailList= new ArrayList<>();
        FileReader lector = new FileReader(filename);
        BufferedReader bf = new BufferedReader(lector);
        String linea;
        while((linea=bf.readLine())!=null){
            if(linea.contains("@")){
                mailList.add(new Mail(linea));
            }
        }   
        return mailList;
    }
    
}
