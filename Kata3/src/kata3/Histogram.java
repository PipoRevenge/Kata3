/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author aleja
 */
public class Histogram<T> {
    
    
    private Map<T,Integer> map = new HashMap<>();

    public int get(T key){
         return map.get(key);
    }

    public Set<T> keySet(){
         return map.keySet();
    }

    public void increment(T key){
         map.put(key,map.containsKey(key) ? map.get(key)+1 : 1);
    }


}