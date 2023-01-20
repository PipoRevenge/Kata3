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
import components.asian.AsianEngine;
import components.asian.AsianRotorBlade;
import components.asian.AsianWheel;

/**
 *
 * @author aleja
 */
public class AsianComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        return new AsianEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AsianRotorBlade();
    }
    
}
