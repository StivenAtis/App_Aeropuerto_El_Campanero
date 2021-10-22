package View;

import Classes.clsGraphFlightsRequestedScheduled_Airport;
import Controller.ctlFlightAgenda;
import java.awt.BorderLayout;
import java.util.LinkedList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Booh
 */
public class pnlgraphFlightsRequestedScheduled_Airline extends javax.swing.JPanel {

    ctlFlightAgenda controlA = new ctlFlightAgenda();

    //--------------------------------------------------------------------------
    
    public pnlgraphFlightsRequestedScheduled_Airline() {
        initComponents();
        ChartFlights();
    }
        
    //--------------------------------------------------------------------------
    
     private void ChartFlights(){
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        LinkedList<clsGraphFlightsRequestedScheduled_Airport> PetsCustomer = controlA.ChartOfFlight();
    
        for (clsGraphFlightsRequestedScheduled_Airport PetCustomer : PetsCustomer) {
            dataset.setValue(PetCustomer.getFlight(), PetCustomer.getAmount());
        }
        
        JFreeChart chart =  ChartFactory.createPieChart3D("Total de vuelos", dataset, true, true, true);
        PiePlot3D plot = (PiePlot3D)chart.getPlot();
        plot.setStartAngle(270.0D);
        plot.setForegroundAlpha(0.8F);
        ChartPanel panel = new ChartPanel(chart);
        Rotator rotator = new Rotator((PiePlot3D)chart.getPlot());
        rotator.start();
        panel.setMouseWheelEnabled(true);
        pnlChart.removeAll();
        
        pnlChart.setLayout(new BorderLayout());
        pnlChart.add(panel, BorderLayout.CENTER);
        pnlChart.validate();
    }
     
    //-------------------------------------------------------------------------- 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChart = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlChart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(pnlChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 1090, 750));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Banner_airline_Adiministration.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 790));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlChart;
    // End of variables declaration//GEN-END:variables
}
