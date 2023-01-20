
package toys.Models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import components.Engine;
import components.RotorBlade;
import toys.Toy;

/**
 *
 * @author saul
 */
public class AmericanSubmarineToy implements Toy{
    
    private final int serialNumber;
    private final String type;

    private final ComponentFactory factory;
    
    private Engine engine;
    
    public AmericanSubmarineToy(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
        
        this.factory = new AmericanComponentFactory();
    }

    public String gettype() {
        return type;
    }
    
    @Override
    public void pack(){
        System.out.print("Empaquetando: "+ serialNumber+"  " );
    }

    @Override
    public void label(){
        System.out.print("Estiquetando: "+ serialNumber + "  ");
    }

    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + serialNumber + '}';
    }

    @Override
    public void prepare() {
        engine = factory.createEngine();
    }

    
    
}
