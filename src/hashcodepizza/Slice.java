/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodepizza;

/**
 *
 * @author Andrew Tait
 */
public class Slice {
    
    //private Pizza p = Pizza();
    
    private int rowoffset;
    private int columnoffset;
    private int rowlength;
    private int columnlength;
    
    private Pizza p = null;

    public Slice(Pizza p, int rowoffset, int columnoffset, int rowlength, int columnlength) {
        this.p = p;
        this.rowoffset = rowoffset;
        this.columnoffset = columnoffset;
        this.rowlength = rowlength;
        this.columnlength = columnlength;
    }
    
    //Getters
    public int getRowoffset() {
        return rowoffset;
    }

    public int getColumnoffset() {
        return columnoffset;
    }

    public int getRowlength() {
        return rowlength;
    }

    public int getColumnlength() {
        return columnlength;
    }

    //Setters
    public void setRowoffset(int rowoffset) {
        this.rowoffset = rowoffset;
    }

    public void setColumnoffset(int columnoffset) {
        this.columnoffset = columnoffset;
    }

    public void setRowlength(int rowlength) {
        this.rowlength = rowlength;
    }

    public void setColumnlength(int columnlength) {
        this.columnlength = columnlength;
    }
    
}
