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
    private Histogram<T> histograma;
    
    public HistogramCalculator(T[] elVector) {
        this.elVector=elVector;
    }
    
    public Histogram<T> calculate(){
        histograma = new Histogram();
        for (int i = 0; i < elVector.length; i++) {
            histograma.increment(elVector[i]);
        }
        return histograma;
    }
}
