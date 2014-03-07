/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.ui;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Liz
 */
class JTableButtonModel extends AbstractTableModel {
  private Object[][] __rows = {
      { "One", new JButton("Button One") },
      { "Two", new JButton("Button Two") },
      { "Three", new JButton("Button Three") },
      { "Four", new JButton("Button Four") }
    };

  private String[] __columns = { "Numbers", "Buttons" };

  public String getColumnName(int column) { 
    return __columns[column];
  }

  public int getRowCount() {
    return __rows.length;
  }

  public int getColumnCount() {
    return __columns.length;
  }

  public Object getValueAt(int row, int column) { 
      return __rows[row][column];
  }

  public boolean isCellEditable(int row, int column) {
    return false;
  }

  public Class getColumnClass(int column) {
    return getValueAt(0, column).getClass();
  }
}