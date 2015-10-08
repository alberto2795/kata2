/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class HistogramCalculator <T>{
    private final T[] elVector;
    
    public HistogramCalculator(T[] elVector) {
        this.elVector=elVector;
    }
    
    public HashMap<T, Integer> calculate(){
        HashMap<T, Integer> map = new HashMap();
        for (int i = 0; i < elVector.length; i++) {
            if(!map.containsKey(elVector[i])) map.put(elVector[i], 1);
            else map.put(elVector[i], map.get(elVector[i])+1);
        }
        return map;
    }
}
