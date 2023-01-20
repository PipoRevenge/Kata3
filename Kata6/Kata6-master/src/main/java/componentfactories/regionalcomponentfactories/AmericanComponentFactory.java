/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import components.Engine;
import components.RotorBlade;
import components.Wheel;
import components.american.AmericanEngine;
import components.american.AmericanRotorBlade;
import components.american.AmericanWheel;

/**
 *
 * @author aleja
 */
public class AmericanComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        return new AmericanEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AmericanRotorBlade();
    }
}
