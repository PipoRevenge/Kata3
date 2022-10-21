/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata3;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
/**
 *
 * @author aleja
 */
public class HistogramDisplay extends ApplicationFrame {
     private JFreeChart contenedor;
    public HistogramDisplay() {
         super("HISTOGRAMA");
         setContentPane(createPanel());
         ChartPanel contenedor;
         //this.setContentPane(createPanel());
         pack();
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
         chartPanel.setPreferredSize(new Dimension(500,400));
         return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart=
                ChartFactory.createBarChart("Histograma JFreeChart", 
                "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL, 
                false,false, false);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(20,"" ,"ulpgc.es");
        dataSet.addValue(60,"" ,"gmail.com");
        dataSet.addValue(5,"","hotmail.com");
        return dataSet;
    }
    public void execute(){
            this.setVisible(true);
        
    }
}
