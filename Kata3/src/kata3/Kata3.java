/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata3;

/**
 *
 * @author aleja
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Histogram<String> histograma = new Histogram<>();
        for (int i = 0; i < 32; i++) {
            histograma.increment("gmail.com");
        }
        for (int i = 0; i < 15; i++) {
            histograma.increment("ulpgc.es");
        }
        for (int i = 0; i < 25; i++) {
            histograma.increment("hotmail.com");
        }
        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
    
}
