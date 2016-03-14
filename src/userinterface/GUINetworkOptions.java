//==============================================================================
//	
//	Copyright (c) 2002-
//	Authors:
//	* Andrew Hinton <ug60axh@cs.bham.ac.uk> (University of Birmingham)
//	
//------------------------------------------------------------------------------
//	
//	This file is part of PRISM.
//	
//	PRISM is free software; you can redistribute it and/or modify
//	it under the terms of the GNU General Public License as published by
//	the Free Software Foundation; either version 2 of the License, or
//	(at your option) any later version.
//	
//	PRISM is distributed in the hope that it will be useful,
//	but WITHOUT ANY WARRANTY; without even the implied warranty of
//	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//	GNU General Public License for more details.
//	
//	You should have received a copy of the GNU General Public License
//	along with PRISM; if not, write to the Free Software Foundation,
//	Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//	
//==============================================================================

package userinterface;

import userinterface.util.*;

import java.util.*;
import org.w3c.dom.*;

public class GUINetworkOptions extends OptionsPanel
{
    //ATTRIBUTES
    
    
    /** Creates new form GUISimulatorOptions */
    public GUINetworkOptions()
    {
        super("Networking");
        initComponents();
        
        synchronizeGUI();
        
        doEnables();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents()//GEN-BEGIN:initComponents
    {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkList = new javax.swing.JList();
        newButton = new javax.swing.JButton();
        importButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        copyButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        pasteButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel5, gridBagConstraints);

        jLabel1.setText("Network List:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel6, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 200));
        networkList.setPreferredSize(new java.awt.Dimension(300, 10));
        jScrollPane1.setViewportView(networkList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        newButton.setIcon(GUIPrism.getIconFromImage("smallNew.png"));
        newButton.setText("New");
        newButton.setPreferredSize(new java.awt.Dimension(96, 26));
        newButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        jPanel1.add(newButton, gridBagConstraints);

        importButton.setIcon(GUIPrism.getIconFromImage("smallImport.png"));
        importButton.setText("Import");
        importButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                importButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        jPanel1.add(importButton, gridBagConstraints);

        editButton.setIcon(GUIPrism.getIconFromImage("smallEdit.png"));
        editButton.setText("Edit");
        editButton.setPreferredSize(new java.awt.Dimension(96, 26));
        editButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                editButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        jPanel1.add(editButton, gridBagConstraints);

        copyButton.setIcon(GUIPrism.getIconFromImage("smallCopy.png"));
        copyButton.setText("Copy");
        copyButton.setPreferredSize(new java.awt.Dimension(96, 26));
        copyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                copyButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 4;
        jPanel1.add(copyButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel8, gridBagConstraints);

        pasteButton.setIcon(GUIPrism.getIconFromImage("smallPaste.png"));
        pasteButton.setText("Paste");
        pasteButton.setPreferredSize(new java.awt.Dimension(96, 26));
        pasteButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pasteButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 4;
        jPanel1.add(pasteButton, gridBagConstraints);

        deleteButton.setIcon(GUIPrism.getIconFromImage("smallDelete.png"));
        deleteButton.setText("Delete");
        deleteButton.setPreferredSize(new java.awt.Dimension(96, 26));
        deleteButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deleteButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 4;
        jPanel1.add(deleteButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel10, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(jPanel1, gridBagConstraints);

    }//GEN-END:initComponents
    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteButtonActionPerformed
    {//GEN-HEADEREND:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed
    
    private void pasteButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pasteButtonActionPerformed
    {//GEN-HEADEREND:event_pasteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasteButtonActionPerformed
    
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_editButtonActionPerformed
    {//GEN-HEADEREND:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed
    
    private void importButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_importButtonActionPerformed
    {//GEN-HEADEREND:event_importButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importButtonActionPerformed
    
    private void newButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newButtonActionPerformed
    {//GEN-HEADEREND:event_newButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_copyButtonActionPerformed
    {//GEN-HEADEREND:event_copyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyButtonActionPerformed
    
    private void doEnables()
    {
        
        
        
    }
    
    public void apply()
    {
        
        
    }
    
    public void defaultGUI()
    {
        
    }
    
    public void synchronizeGUI()
    {
        
    }
    
    public boolean valid() throws GUIException
    {
        return true;
    }
    
    public void loadXMLElement(Document doc, Element element)
    {
        
        
    }
    
    public Element saveXMLElement(Document doc) throws DOMException
    {
        
        //Element e = doc.createElement("network")
        
        
        return null;
    }
    
    public void loadProperties(Properties properties)
    {
    }
    
    public void saveProperties(Properties properties)
    {
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton copyButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton importButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList networkList;
    private javax.swing.JButton newButton;
    private javax.swing.JButton pasteButton;
    // End of variables declaration//GEN-END:variables
    
}
