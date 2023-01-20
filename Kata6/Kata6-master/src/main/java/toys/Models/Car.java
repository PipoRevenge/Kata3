package toys.Models;

import toys.Toy;

/**
 *
 * @author aleja
 */
public class Car implements Toy{
    
    private final int serialNumber;
    private final String type;

    public Car(int serialNumber, String type) {
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
        return "Car{" + serialNumber + '}';
    }

    @Override
    public void prepare() {
    }
    
}
