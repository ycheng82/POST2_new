/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package postGUI;

/**
 *
 * @author Ye
 */
public class InvoicePanel extends javax.swing.JPanel {

    /**
     * Creates new form InvoicePanel
     */
    public InvoicePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoicePanel = new javax.swing.JPanel();
        itemLabel = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JLabel();
        uPriceLabel = new javax.swing.JLabel();
        ePriceLabel = new javax.swing.JLabel();
        invoiceText = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        totalAmount = new javax.swing.JLabel();

        invoicePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Invoice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        itemLabel.setText("ITEM");

        qtyLabel.setText("QTY");

        uPriceLabel.setText("UNIT_PRICE");

        ePriceLabel.setText("EXTENDED_PRICE");

        totalLabel.setText("TOTAL");

        totalAmount.setText("$0");

        javax.swing.GroupLayout invoicePanelLayout = new javax.swing.GroupLayout(invoicePanel);
        invoicePanel.setLayout(invoicePanelLayout);
        invoicePanelLayout.setHorizontalGroup(
            invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoiceText, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(invoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoicePanelLayout.createSequentialGroup()
                        .addComponent(itemLabel)
                        .addGap(156, 156, 156)
                        .addComponent(qtyLabel)
                        .addGap(91, 91, 91)
                        .addComponent(uPriceLabel)
                        .addGap(69, 69, 69)
                        .addComponent(ePriceLabel)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(invoicePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        invoicePanelLayout.setVerticalGroup(
            invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoicePanelLayout.createSequentialGroup()
                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemLabel)
                    .addComponent(qtyLabel)
                    .addComponent(uPriceLabel)
                    .addComponent(ePriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoiceText, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(totalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(invoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(invoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ePriceLabel;
    private javax.swing.JPanel invoicePanel;
    private javax.swing.JTextField invoiceText;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JLabel totalAmount;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel uPriceLabel;
    // End of variables declaration//GEN-END:variables
}