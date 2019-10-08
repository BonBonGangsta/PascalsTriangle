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
        int columns = 1;
        pasTri = new int [neededRows][] ; // initialize the pyramid
        limitOfColRows = neededRows ; // set the limit
        
        // set the first value in the Pascal's Triangle as they 
        // are just constant.
        pasTri [0][0] = 1 ; // first value is 1
        
        // for loop with a condition
        for (int r = 1 ; r < limitOfColRows ; r++)
        {
            for (int c = 0 ; c <= columns ; c++ )
            {
                if ( c == columns || c == 0 )
                {
                   pasTri [r][c] = 1;
                }
                else
                {
                    pasTri [r][c] = pasTri [r-1][c] + pasTri [r-1][c-1];
                }
            }
            columns++;
        }
    }
   
    public String toString()
    {
        return null;
    }
    
}
