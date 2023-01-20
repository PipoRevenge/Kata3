package kata4.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReaderBD {
    
    private Connection connect(String bd) {
        // SQLite connection string
        String url = "jdbc:sqlite:"+bd;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public List<Mail> read(String bd) throws FileNotFoundException, IOException{
        String sql = "SELECT * FROM EMAIL";
        List<Mail> mailList= new ArrayList<>();
        try(Connection conn = this.connect(bd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
                
            while(rs.next()){
                String ml = rs.getString("Mail");
                if (ml.contains("@")){
                    mailList.add(new Mail(ml));
                }
            }
                
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }   
        return mailList;
    }
}
