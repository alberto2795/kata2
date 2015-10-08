/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author usuario
 */
public class HistogramMapDisplay {
    Entry entry;
    public HistogramMapDisplay() {
    }
     public void display (Map map){
         for (Object key : map.keySet()){
             System.out.print(key+" aparece "+map.get(key));
             if(map.get(key)==1) System.out.println(" vez.");
             else System.out.println(" veces.");
         }
     }
}
