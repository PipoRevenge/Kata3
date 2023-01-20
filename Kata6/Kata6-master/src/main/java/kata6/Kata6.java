package kata6;


import business.ToyBuisness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import factories.regionalfactories.AsianSubmarineToyFactory;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Toy;
/**
 *
 * @author aleja
 */
public class Kata6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            ToyBuisness business = new ToyBuisness();
            business.add("car", new AmericanCarToyFactory());
            business.add("helicopter", new AsianHelicopterToyFactory());
            business.add("submarine", new AsianSubmarineToyFactory());
            ArrayList<Toy> toys = new ArrayList<>();
            
            
            Scanner in = new Scanner(System.in);
            String line = "";
            while(!line.equals("exit")){
                line = in.nextLine();
                
                switch(line){
                    case "submarine":
                    case "car":
                    case "helicopter":
                        toys.add(business.produceToy(line));
                        System.out.println(
                                "Built toys: "+toys.stream()
                                .map(c -> c.toString())
                                .collect(Collectors.joining(", ")));
                     
                        break;
                        
                    case "exit":
                        System.out.println("Exiting program");
                        break;
                        
                    default:
                        System.out.println("Error");
                        break;
                
                }
            
            }
        
    }
    
}
