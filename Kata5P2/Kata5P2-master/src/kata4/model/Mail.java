package kata4.model;

public class Mail {
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        String[] partes = mail.split("@");
        return partes[1];
    }
    
}
