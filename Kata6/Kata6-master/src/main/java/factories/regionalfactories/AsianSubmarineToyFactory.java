/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories.regionalfactories;

import factories.ToyFactory;
import toys.Models.AsianSubmarineToy;
import toys.Toy;

/**
 *
 * @author aleja
 */
public class AsianSubmarineToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer argument) {
        AsianSubmarineToy toy = new AsianSubmarineToy(argument,"");
        return toy;
    }
    
}