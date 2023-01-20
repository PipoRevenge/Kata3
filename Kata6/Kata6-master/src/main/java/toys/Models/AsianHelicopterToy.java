
package toys.Models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import components.Engine;
import components.RotorBlade;
import toys.Toy;

/**
 *
 * @author aleja
 */
public class AsianHelicopterToy implements Toy {
    
    private final int serialNumber;
    private final String type;
    
    private final ComponentFactory factory;
    
    private Engine engine;
    private RotorBlade rotorBlade;

    public AsianHelicopterToy(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
        
        this.factory = new AsianComponentFactory();
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
        return "AsianHelicopterToy{" + serialNumber + '}';
    }
    
    @Override
    public void prepare() {
        engine = factory.createEngine();
        rotorBlade = factory.createRotorBlade();
    }
    
}
