package toys.Models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import components.Engine;
import components.RotorBlade;
import toys.Toy;

/**
 *
 * @author aleja
 */
public class AmericanHelicopterToy implements Toy{
    
    private final int serialNumber;
    private final String type;
    
    private final ComponentFactory factory;
    
    private Engine engine;
    private RotorBlade rotorBlade;

    public AmericanHelicopterToy(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
        
        this.factory = new AmericanComponentFactory();
    }

    public String getTyper() {
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
        return "AmericanHelicopterToy{" + serialNumber + '}';
    }

    @Override
    public void prepare() {
        engine = factory.createEngine();
        rotorBlade = factory.createRotorBlade();
    }
    
    
    
}
