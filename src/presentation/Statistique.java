package presentation;

import dao.daoAnimal;
import factory.Factory;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.*;
import objet.Animal;
import org.apache.batik.parser.DefaultPathHandler;
import org.jaxen.saxpath.helpers.DefaultXPathHandler;
import org.jfree.chart.*;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class Statistique extends JDialog {

    private static daoAnimal ani = Factory.getdaoAnimal();

    private JPanel pnl;

    public Statistique(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
       
        pnl = new JPanel(new BorderLayout());
        setContentPane(pnl);
        setSize(1200, 800);
        DefaultPieDataset dataset = new DefaultPieDataset();
        ArrayList<Animal> an = ani.selectCountAbondon();
        for (int i = 0; i < an.size(); i++) {
            dataset.setValue(an.get(i).getRaison(), new Integer(an.get(i).getNbStat()));
              }

        JFreeChart someChart = ChartFactory.createPieChart3D(
                "Origine des animaux abandonnés par leur propriétaire ", dataset, true, true, false);
        PiePlot plot = (PiePlot) someChart.getPlot();
      

      PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
                "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);
      
        ChartPanel cPanel = new ChartPanel(someChart);
       
        pnl.add(cPanel);

    }

}
