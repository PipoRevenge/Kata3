/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories.regionalfactories;

import factories.ToyFactory;
import toys.Models.AsianHelicopterToy;
import toys.Toy;

/**
 *
 * @author aleja
 */
public class AsianHelicopterToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer argument) {
        AsianHelicopterToy toy = new AsianHelicopterToy(argument,"");
        return toy;
    }
    
}