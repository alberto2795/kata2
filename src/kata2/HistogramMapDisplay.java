/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

/**
 *
 * @author usuario
 */
public class HistogramMapDisplay {
    public HistogramMapDisplay() {
    }
     public void display (Histogram histogram){
         for (Object key : histogram.keySet()){
             System.out.println(key+" aparece "+histogram.get(key) + 
                     (histogram.get(key)==1?" vez.":" veces."));
         }
     }
}
