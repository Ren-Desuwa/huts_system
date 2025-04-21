package view.charts;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.RenderingHints;
import java.util.HashMap;
import java.util.Map;

/**
 * A reusable, editable pie chart panel.
 * <p>
 * You can customize title, size, data, and section colors dynamically.
 */
public class PieChart extends JPanel {

    private final DefaultPieDataset dataset;
    private final JFreeChart chart;
    private final PiePlot plot;
    private final ChartPanel chartPanel;

    /**
     * Default constructor with empty data and default size.
     */
    public PieChart() {
        this("Pie Chart", new Dimension(800, 600), new HashMap<>(), new HashMap<>());
    }

    /**
     * Full constructor allowing all customizations on creation.
     *
     * @param title  the chart title
     * @param size   preferred size for the chart panel
     * @param data   map of section keys to numeric values
     * @param colors map of section keys to Colors
     */
    public PieChart(String title,
                             Dimension size,
                             Map<String, Number> data,
                             Map<String, Color> colors) {
        super(new BorderLayout());

        // Initialize dataset and apply data
        dataset = new DefaultPieDataset();
        setData(data);

        // Create chart and apply HD rendering hints
        chart = ChartFactory.createPieChart(title, dataset, true, true, false);
        chart.setAntiAlias(true);
        chart.setTextAntiAlias(true);
        chart.setBackgroundPaint(Color.WHITE);
        chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 18));
        chart.getRenderingHints().put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        chart.getRenderingHints().put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        // Configure plot appearance
        plot = (PiePlot) chart.getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}: {1} ({2})"));
        plot.setLabelFont(new Font("Segoe UI", Font.PLAIN, 14));
        plot.setBackgroundPaint(Color.WHITE);
        plot.setOutlineVisible(false);

        // Apply initial section colors
        setSectionColors(colors);

        // Create and configure ChartPanel
        chartPanel = new ChartPanel(chart);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setPreferredSize(size);
        chartPanel.setOpaque(false);
        chartPanel.setBackground(Color.WHITE);

        // Add to this JPanel
        add(chartPanel, BorderLayout.CENTER);
    }

    /**
     * Update the dataset with new values. Clears existing entries.
     *
     * @param data map of section keys to numeric values
     */
    public void setData(Map<String, Number> data) {
        dataset.clear();
        data.forEach(dataset::setValue);
    }

    /**
     * Change the chart title at runtime.
     *
     * @param title new title string
     */
    public void setTitle(String title) {
        chart.setTitle(title);
    }

    /**
     * Set a single section's paint color.
     *
     * @param key   section key as in the dataset
     * @param color Color to apply
     */
    public void setSectionColor(String key, Color color) {
        plot.setSectionPaint(key, color);
    }

    /**
     * Set multiple section colors at once.
     *
     * @param colors map of section keys to Colors
     */
    public void setSectionColors(Map<String, Color> colors) {
        colors.forEach(plot::setSectionPaint);
    }

    /**
     * Expose the internal dataset for advanced manipulations.
     */
    public DefaultPieDataset getDataset() {
        return dataset;
    }

    /**
     * Expose the JFreeChart instance for further customization.
     */
    public JFreeChart getChart() {
        return chart;
    }

    /**
     * Expose the PiePlot for direct plot-level tweaks.
     */
    public PiePlot getPlot() {
        return plot;
    }
}
