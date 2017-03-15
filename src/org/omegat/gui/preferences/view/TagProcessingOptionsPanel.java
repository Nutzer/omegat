/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2000-2006 Keith Godfrey and Maxym Mykhalchuk
               2009 Martin Fleurke
               2013 Aaron Madlon-Kay
               2016 Aaron Madlon-Kay
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

package org.omegat.gui.preferences.view;

import javax.swing.JPanel;

import org.omegat.util.OStrings;

/**
 * @author Maxym Mykhalchuk
 * @author Martin Fleurke
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class TagProcessingOptionsPanel extends JPanel {

    /** Creates new form TagProcessingOptionsPanel */
    public TagProcessingOptionsPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ourButtonGroup = new javax.swing.ButtonGroup();
        descriptionTextArea = new javax.swing.JTextArea();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        noCheckRadio = new javax.swing.JRadioButton();
        simpleCheckRadio = new javax.swing.JRadioButton();
        fullCheckRadio = new javax.swing.JRadioButton();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        javaPatternCheckBox = new javax.swing.JCheckBox();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel3 = new javax.swing.JPanel();
        looseTagOrderCheckBox = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        looseTagOrderWarningTextArea = new javax.swing.JTextArea();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        cbTagsValidRequired = new javax.swing.JCheckBox();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        cbCountingProtectedText = new javax.swing.JCheckBox();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel2 = new javax.swing.JPanel();
        jLabelCustomPattern = new javax.swing.JLabel();
        customPatternRegExpTF = new javax.swing.JTextField();
        customPatternWarningTextArea = new javax.swing.JTextArea();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel1 = new javax.swing.JPanel();
        jLabelRemovePattern = new javax.swing.JLabel();
        removePatternRegExpTF = new javax.swing.JTextField();
        removePatternWarningTextArea = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(jLabelCustomPattern.getFont());
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setText(OStrings.getString("GUI_TAGVALIDATION_DESCRIPTION")); // NOI18N
        descriptionTextArea.setWrapStyleWord(true);
        descriptionTextArea.setAlignmentX(0.0F);
        descriptionTextArea.setDragEnabled(false);
        descriptionTextArea.setFocusable(false);
        descriptionTextArea.setOpaque(false);
        add(descriptionTextArea);
        add(filler7);

        ourButtonGroup.add(noCheckRadio);
        noCheckRadio.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(noCheckRadio, OStrings.getString("TV_OPTION_NO_CHECK")); // NOI18N
        add(noCheckRadio);

        ourButtonGroup.add(simpleCheckRadio);
        org.openide.awt.Mnemonics.setLocalizedText(simpleCheckRadio, OStrings.getString("TV_OPTION_SIMPLE_CHECK")); // NOI18N
        add(simpleCheckRadio);

        ourButtonGroup.add(fullCheckRadio);
        org.openide.awt.Mnemonics.setLocalizedText(fullCheckRadio, OStrings.getString("TV_OPTION_FULL_CHECK")); // NOI18N
        add(fullCheckRadio);
        add(filler11);

        org.openide.awt.Mnemonics.setLocalizedText(javaPatternCheckBox, OStrings.getString("TV_OPTION_JAVA_PATTERN")); // NOI18N
        add(javaPatternCheckBox);
        add(filler12);

        jPanel3.setAlignmentX(0.0F);
        jPanel3.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(looseTagOrderCheckBox, OStrings.getString("TV_OPTION_LOOSE_TAG_ORDER")); // NOI18N
        jPanel3.add(looseTagOrderCheckBox, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));
        jPanel4.add(filler1);

        looseTagOrderWarningTextArea.setEditable(false);
        looseTagOrderWarningTextArea.setFont(jLabelCustomPattern.getFont());
        looseTagOrderWarningTextArea.setLineWrap(true);
        looseTagOrderWarningTextArea.setText(OStrings.getString("TV_OPTION_LOOSE_TAG_WARNING")); // NOI18N
        looseTagOrderWarningTextArea.setWrapStyleWord(true);
        looseTagOrderWarningTextArea.setAlignmentX(0.0F);
        looseTagOrderWarningTextArea.setOpaque(false);
        jPanel4.add(looseTagOrderWarningTextArea);

        jPanel3.add(jPanel4, java.awt.BorderLayout.SOUTH);

        add(jPanel3);
        add(filler10);

        org.openide.awt.Mnemonics.setLocalizedText(cbTagsValidRequired, OStrings.getString("TV_OPTION_TAGS_VALID_REQUIRED")); // NOI18N
        add(cbTagsValidRequired);
        add(filler13);

        org.openide.awt.Mnemonics.setLocalizedText(cbCountingProtectedText, OStrings.getString("TV_OPTION_PROTECTED_TEXT_COUNTING")); // NOI18N
        add(cbCountingProtectedText);
        add(filler9);

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabelCustomPattern, OStrings.getString("TV_OPTION_CUSTOMPATTERN")); // NOI18N
        jPanel2.add(jLabelCustomPattern, java.awt.BorderLayout.NORTH);

        customPatternRegExpTF.setAlignmentX(0.0F);
        jPanel2.add(customPatternRegExpTF, java.awt.BorderLayout.CENTER);

        customPatternWarningTextArea.setEditable(false);
        customPatternWarningTextArea.setFont(jLabelCustomPattern.getFont());
        customPatternWarningTextArea.setForeground(java.awt.Color.red);
        customPatternWarningTextArea.setLineWrap(true);
        customPatternWarningTextArea.setWrapStyleWord(true);
        customPatternWarningTextArea.setAlignmentX(0.0F);
        customPatternWarningTextArea.setOpaque(false);
        jPanel2.add(customPatternWarningTextArea, java.awt.BorderLayout.SOUTH);

        add(jPanel2);
        add(filler8);

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabelRemovePattern, OStrings.getString("TV_OPTION_REMOVEPATTERN")); // NOI18N
        jPanel1.add(jLabelRemovePattern, java.awt.BorderLayout.NORTH);

        removePatternRegExpTF.setAlignmentX(0.0F);
        jPanel1.add(removePatternRegExpTF, java.awt.BorderLayout.CENTER);

        removePatternWarningTextArea.setEditable(false);
        removePatternWarningTextArea.setFont(jLabelCustomPattern.getFont());
        removePatternWarningTextArea.setForeground(java.awt.Color.red);
        removePatternWarningTextArea.setLineWrap(true);
        removePatternWarningTextArea.setWrapStyleWord(true);
        removePatternWarningTextArea.setAlignmentX(0.0F);
        removePatternWarningTextArea.setOpaque(false);
        jPanel1.add(removePatternWarningTextArea, java.awt.BorderLayout.SOUTH);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox cbCountingProtectedText;
    javax.swing.JCheckBox cbTagsValidRequired;
    javax.swing.JTextField customPatternRegExpTF;
    javax.swing.JTextArea customPatternWarningTextArea;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    javax.swing.JRadioButton fullCheckRadio;
    private javax.swing.JLabel jLabelCustomPattern;
    private javax.swing.JLabel jLabelRemovePattern;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    javax.swing.JCheckBox javaPatternCheckBox;
    javax.swing.JCheckBox looseTagOrderCheckBox;
    private javax.swing.JTextArea looseTagOrderWarningTextArea;
    javax.swing.JRadioButton noCheckRadio;
    javax.swing.ButtonGroup ourButtonGroup;
    javax.swing.JTextField removePatternRegExpTF;
    javax.swing.JTextArea removePatternWarningTextArea;
    javax.swing.JRadioButton simpleCheckRadio;
    // End of variables declaration//GEN-END:variables
}
