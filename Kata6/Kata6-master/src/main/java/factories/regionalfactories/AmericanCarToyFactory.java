/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories.regionalfactories;

import factories.ToyFactory;
import toys.Models.AmericanCarToy;
import toys.Toy;

/**
 *
 * @author aleja
 */
public class AmericanCarToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer num) {
        AmericanCarToy car = new AmericanCarToy(num,"");
        return car;
    }
}
    