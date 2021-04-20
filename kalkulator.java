
/**
 * Write a description of class kalkulator here.
 *
 * @author abjalriski
 * @version 0.01
 */
public class kalkulator
{
    String name;
    
    int x = 10;
    int y = 10;
    
    int penjumlahan = x + y;
    int perkalian = x * y;
    int pengurangan = x - y;
    int pembagian = x / y;

    /**
     * Constructor for objects of class kalkulator
     */
    public kalkulator()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
