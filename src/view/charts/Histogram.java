/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.charts;

/**
 *
 * @author Ireneo III
 */
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;


import javax.swing.*;
import java.awt.*;
import org.jfree.chart.renderer.category.StandardBarPainter;

public class Histogram extends JPanel {

    private final String[] labels;
    private final double[] values;
    private final String categoryLabel;
    private final String chartTitle;
    private final String valueLabel;
    
    public Histogram(String chartTtl, String categoryLbl, String valLbl, String[] lbl, double[] val){ 
        this.labels = lbl;
        this.values = val;
        this.categoryLabel = categoryLbl;
        this.chartTitle = chartTtl;
        this.valueLabel = valLbl;
        initComponent();
    }
    
    private void initComponent() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Populate the dataset
        for (int i = 0; i < labels.length; i++) {
            dataset.addValue(values[i], "Usage", labels[i]);
        }

        JFreeChart chart = ChartFactory.createBarChart(
                chartTitle,
                categoryLabel,
                valueLabel,
                dataset
        );

        // Customize the plot to match the style in the image
        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // Change bar color
        renderer.setSeriesPaint(0, new Color(30, 100, 200)); // Deep blue

        // Rounded bars (optional)
        renderer.setSeriesPaint(0, new Color(30, 100, 200)); // Solid blue
        renderer.setShadowVisible(false); // Disable shadow
        renderer.setBarPainter(new StandardBarPainter()); // Make it solid, no gradient

        // Set chart background
        plot.setBackgroundPaint(Color.WHITE);
        plot.setDomainGridlinesVisible(false);

        // Font tweaks for labels
        plot.getDomainAxis().setTickLabelFont(new Font("SansSerif", Font.PLAIN, 14));
        plot.getRangeAxis().setTickLabelFont(new Font("SansSerif", Font.PLAIN, 12));

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        this.setLayout(new BorderLayout());
        this.add(chartPanel, BorderLayout.CENTER);
    }
}

