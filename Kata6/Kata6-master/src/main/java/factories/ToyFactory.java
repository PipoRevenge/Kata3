
package factories;

import toys.Toy;

/**
 *
 * @author aleja
 */
public abstract class ToyFactory {
    
    
    public Toy produceToy(){
    
        Toy toy = this.createToy(SerialNumberGenerator.getInstance().next());
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(Integer serialNumber);
    
}
