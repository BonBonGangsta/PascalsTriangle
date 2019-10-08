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
    private int limitOfColRows ; // limit of rows and columns
    
    /**
     * Pascal's triangle can be used to determine the expanded pattern of 
     * coefficients or in this case, display a pretty pyramid.
     * @param neededRows Number of rows the pyramid to produce.
     */
    public void Pascal(int neededRows)
    {
        int columns = 1; // starts at 1 since the zero is going to be constant
        pasTri = new int [neededRows][] ; // initialize the pyramid
        limitOfColRows = neededRows ; // set the limit
        
        // set the first value in the Pascal's Triangle as they 
        // are just constant.
        pasTri [0][0] = 1 ; // first value is 1
        
        // for loop with a condition for the roles to run for the number of
        // rows requested by the user
        for (int r = 1 ; r < limitOfColRows ; r++)
        {
            // each row above row 0 is different so we must use a dynamic
            // for loop to add the values into their respective columns
            for (int c = 0 ; c <= columns ; c++ )
            {
                // the first and last columns get the constant value of 1
                if ( c == columns || c == 0 )
                {
                   pasTri [r][c] = 1;
                }
                else
                {
                    // get the sum of the previous rows, same column and
                    // previous column
                    pasTri [r][c] = pasTri [r-1][c] + pasTri [r-1][c-1];
                }
            }
            columns++; // add to the columns
        }
    }
   
    public String toString()
    {
        return null;
    }
    
}
