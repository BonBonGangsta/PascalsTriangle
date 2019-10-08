/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalstriangle;

/**
 *
 * @author byrondepaz
 */
public class Pascal {
    private int [][]pasTri ; // 2-D array for Pascals' triangle
    private int column ; // counter for columns
    private int rows ; // counter for the rows
    private int limitOfColRows ; // limit of rows and columns
    
    /**
     * Pascal's triangle can be used to determine the expanded pattern of 
     * coefficients or in this case, display a pretty pyramid.
     * @param neededRows Number of rows the pyramid to produce.
     */
    public void Pascal(int neededRows)
    {
        pasTri = new int [neededRows][] ; // initialize the pyramid
        limitOfColRows = neededRows ; // set the limit
        
        // set the first three values in the Pascal's Triangle as they 
        // are just constants.
        
        pasTri [rows][column] = 1 ; // first value is 1
        this.rows ++ ;
        pasTri [rows] [column] = 1 ;
        this.column ++ ;        
    }
   
    public String toString()
    {
        
    }
    
}
