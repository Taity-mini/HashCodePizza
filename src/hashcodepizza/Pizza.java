/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodepizza;

/**
 *
 * @author Andrew
 */
public class Pizza {
   
   private int rows;
   private int columns;
   private int minIngredients;
   private int maxNumCells;
   private char[][] Matrix;
      
   
   public Pizza(int rows,  int columns){
       this.rows = rows;
       this.columns = columns;
       this.Matrix = new char [rows][columns];
   }

    public Pizza() {
        
    }
   
   //Getters
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getMinIngredients() {
        return minIngredients;
    }

    public int getMaxNumCells() {
        return maxNumCells;
    }
    
   
    //Setters
    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setMinIngredients(int miningredients) {
        this.minIngredients = miningredients;
    }

    public char[][] getMatrix() {
        return Matrix;
    }

    public void setMatrix(char[][] Matrix) {
        this.Matrix = Matrix;
    }

    public void setMaxNumCells(int maxNumCells) {
        this.maxNumCells = maxNumCells;
    }
  
}
