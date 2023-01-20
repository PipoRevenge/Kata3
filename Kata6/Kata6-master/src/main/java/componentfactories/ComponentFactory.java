/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentfactories;

import components.Engine;
import components.RotorBlade;
import components.Wheel;

/**
 *
 * @author aleja
 */
public abstract class ComponentFactory {
    
    public abstract Wheel createWheel();
    public abstract Engine createEngine();
    public abstract RotorBlade createRotorBlade();
}
