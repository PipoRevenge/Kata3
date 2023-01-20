package factories;

/**
 *
 * @author aleja
 */
public class SerialNumberGenerator {
    
    private Integer serialNumber = -1;
    static private SerialNumberGenerator instance = null;
    
    private SerialNumberGenerator(){}
    
    public static SerialNumberGenerator getInstance(){
        if(instance == null){
            instance = new SerialNumberGenerator();
        }
        return instance;
    }
    
    public int next(){
        serialNumber += 1;
        return serialNumber;
    }
}
