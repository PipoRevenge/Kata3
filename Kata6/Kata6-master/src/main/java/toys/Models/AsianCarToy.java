package toys.Models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import components.Engine;
import components.Wheel;
import toys.Toy;

/**
 *
 * @author aleja
 */
public class AsianCarToy implements Toy{
    private final int serialNumber;
    private final String type;
    
    private final ComponentFactory factory;
    
    private Engine engine;
    private final Wheel[] wheels = new Wheel[4];

    public AsianCarToy(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
        this.factory = new AsianComponentFactory();
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
        return "AsianCarToy{" + serialNumber + '}';
    }
    
    @Override
    public void prepare() {
        
        engine = factory.createEngine();
        for (int i = 0; i < wheels.length-1 ; i++) {
            wheels[i] = factory.createWheel();
        }
        
    }
    
}
