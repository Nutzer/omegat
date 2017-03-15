/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2007 - Zoltan Bartko - bartkozoltan@bartkozoltan.com
               2008 Didier Briel
               2015 Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.gui.dialogs;

import java.awt.Cursor;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

import org.omegat.core.spellchecker.DictionaryManager;
import org.omegat.util.OStrings;
import org.omegat.util.gui.StaticUIUtils;

/**
 * The spellchecker dictionary installer.
 *
 * @author bartkoz
 * @author Didier Briel
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class DictionaryInstallerDialog extends JDialog {

    /**
     * The dictionary manager in use
     */
    private final DictionaryManager dicMan;

    /**
     * the list model
     */
    private final DefaultListModel<String> listModel = new DefaultListModel<>();
    
    private LoaderWorker loader = null;
    private InstallerWorker installer = null;

    /** Creates new form DictionaryInstallerDialog */
    public DictionaryInstallerDialog(Window parent, DictionaryManager dicMan) {
        super(parent, JDialog.DEFAULT_MODALITY_TYPE);

        StaticUIUtils.setEscapeClosable(this);

        this.dicMan = dicMan;

        initComponents();
        
        dictionaryList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
                    installButtonActionPerformed(null);
                }
            }
        });

        setLocationRelativeTo(parent);
        
        dictionaryListValueChanged(null);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                progressBar.setVisible(true);
                loader = new LoaderWorker();
                loader.execute();
            }
        });
    }

    private class LoaderWorker extends SwingWorker<List<String>, Void> {

        @Override
        protected List<String> doInBackground() throws Exception {
            //Connect with remote URL to get list of dictionaries.
            return dicMan.getInstallableDictionaryNameList();
        }

        @Override
        protected void done() {
            try {
                List<String> list = get();
                list.forEach(listModel::addElement);
                
                dictionaryList.setModel(listModel);
                dictionaryList.setEnabled(true);
                
                if (list.isEmpty()) {
                    installButton.setEnabled(false);
                    infoTextArea.setText(OStrings.getString("GUI_DICTIONARY_INSTALLER_TEXT_NOTHING"));
                }
                progressBar.setVisible(false);
            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(DictionaryInstallerDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        listLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dictionaryList = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        installButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(OStrings.getString("GUI_DICTIONARY_INSTALLER_TITLE")); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 500));

        infoTextArea.setEditable(false);
        infoTextArea.setFont(new JLabel().getFont());
        infoTextArea.setLineWrap(true);
        infoTextArea.setText(OStrings.getString("GUI_DICTIONARY_INSTALLER_TEXT_GO")); // NOI18N
        infoTextArea.setWrapStyleWord(true);
        infoTextArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        infoTextArea.setDragEnabled(false);
        infoTextArea.setFocusable(false);
        infoTextArea.setOpaque(false);
        getContentPane().add(infoTextArea, java.awt.BorderLayout.NORTH);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        jPanel1.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(listLabel, OStrings.getString("GUI_DICTIONARY_INSTALLER_AVAILABLE")); // NOI18N
        jPanel1.add(listLabel, java.awt.BorderLayout.NORTH);

        dictionaryList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dictionaryListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(dictionaryList);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jPanel2.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(installButton, OStrings.getString("GUI_DICTIONARY_INSTALLER_INSTALL")); // NOI18N
        installButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installButtonActionPerformed(evt);
            }
        });
        jPanel2.add(installButton, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel2, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        jPanel3.setLayout(new java.awt.BorderLayout());

        progressBar.setIndeterminate(true);
        jPanel3.add(progressBar, java.awt.BorderLayout.CENTER);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(closeButton, OStrings.getString("BUTTON_CLOSE")); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel4.add(closeButton);

        jPanel3.add(jPanel4, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void installButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_installButtonActionPerformed
        if (installer != null) {
            installer.cancel(true);
        }
        progressBar.setVisible(true);
        installButton.setEnabled(false);
        closeButton.setEnabled(false);
        installer = new InstallerWorker();
        installer.execute();
    }//GEN-LAST:event_installButtonActionPerformed

    private class InstallerWorker extends SwingWorker<List<String>, String> {

        private final Cursor HOURGLASS_CURSOR = Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR);
        private Cursor oldCursor;
        
        @Override
        protected List<String> doInBackground() throws Exception {
            oldCursor = getCursor();
            setCursor(HOURGLASS_CURSOR);
            List<String> selection = dictionaryList.getSelectedValuesList();
            List<String> completed = new ArrayList<>();
            for (String item : selection) {
                if (isCancelled()) {
                    break;
                }
                // install the respective dictionaries
                String langCode = item.substring(0, item.indexOf(" "));
                try {
                    dicMan.installRemoteDictionary(langCode);
                    completed.add(item);
                    publish(item);
                } catch (Exception ex) {
                    setCursor(oldCursor);
                    JOptionPane.showMessageDialog(DictionaryInstallerDialog.this, ex.getLocalizedMessage(), "Error",
                            JOptionPane.ERROR_MESSAGE);
                    setCursor(HOURGLASS_CURSOR);
                }
            }
            return completed;
        }

        @Override
        protected void process(List<String> chunks) {
            chunks.forEach(listModel::removeElement);
        }
        
        @Override
        protected void done() {
            try {
                get().forEach(listModel::removeElement);
            } catch (InterruptedException | ExecutionException e) {
                // Ignore
            }
            setCursor(oldCursor);
            progressBar.setVisible(false);
            installButton.setEnabled(true);
            closeButton.setEnabled(true);
        }
    }
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        if (installer != null) {
            installer.cancel(true);
        }
        if (loader != null) {
            loader.cancel(true);
        }
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void dictionaryListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dictionaryListValueChanged
        installButton.setEnabled(!dictionaryList.getSelectedValuesList().isEmpty());
    }//GEN-LAST:event_dictionaryListValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JList<String> dictionaryList;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JButton installButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listLabel;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables

}
