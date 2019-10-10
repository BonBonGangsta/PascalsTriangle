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
    private int[][] pasTri ; // 2-D array for Pascals' triangle
    /**
     * Pascal's triangle can be used to determine the expanded pattern of 
     * coefficients or in this case, display a pretty pyramid.
     * @param neededRows Number of rows the pyramid to produce.
     */
    public Pascal(int neededRows)
    {
        pasTri = new int[neededRows][] ;      
    }
    
    public void generateTri ()
    {
        // generate the pascal triangle
        // the first and last value in each row is 1
        // the numbers between are based off the sum of the two numbers 
        // in the row above and the number to the left of it
        
        // we are going to traverse the pyrmaid by rows
        for (int row = 0 ; row < pasTri.length ; row ++)
        {
           // initialize the array within the array... arrayception
           pasTri[row] = new int[row + 1] ; 
           
           //first value in the array is always 1.
           pasTri[row][0] = 1 ; // sorry for the zero 
           
           // last value is alwasy 1 too
           pasTri[row][row] = 1 ;
           
           // calculate the columns between the two 1s.
           for (int columns = 1; columns < row ; columns++ )
           {
               // the value is calculated from the number directly above
               // plus the number to the left in the array not in the 
               // pyramid...
               pasTri[row][columns] = pasTri[row-1][columns] 
                                      + pasTri[row -1][columns -1] ;
           }
           
        }
    }
   
    @Override
    public String toString()
    {
        int outerWidth = 30 ;// the first number should be 30 spaces in
        int innerWidth = 4 ; // inner width spaces between each number
        String output = "";
        for (int i = 0; i < pasTri.length ; i++)
        {
           // first 
           output += System.out.printf("%" + outerWidth + "d", pasTri[i][0]);
           for(int r = 1 ; r < pasTri[i].length ; r++)
           {
             output += System.out.printf("%" + innerWidth + "d", pasTri[i][r]);
           }
           output += System.out.printf("%n") ;
           outerWidth -= 2 ; // remove 3 spaces
        }
        
        return output;
    }
    
}
