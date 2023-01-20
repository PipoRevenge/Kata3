
package toys.Models;

import toys.Toy;

/**
 *
 * @author aleja
 */
public class Helicopter implements Toy{
    
    private final int serialNumber;
    private final String type;

    public Helicopter(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }

    public String getType() {
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
        return "Helicopte{" + serialNumber + '}';
    }
    
    @Override
    public void prepare() {
    }
}
