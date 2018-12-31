import java.util.Scanner;

/**
 * This program prompts the user to enter 5
 * integer values. 
 * @author micah
 */
public class ArrayDemo {
    public static void main(String args []){
        int[] data = readInputs(5);
        System.out.println("Average: "+getAverage(data));
        System.out.println("Largest: "+getLargest(data));
        System.out.println("Smallest: "+getSmallest(data));
    }  
    
    /**
     * Reads a series of integer values. 
     * @param numberOfInputs the number of inputs to read
     * @return an array containing the input variables.
     */
    public static int[] readInputs(int numberOfInputs){
        System.out.println("Enter "+numberOfInputs+" integer numbers: ");
        Scanner in = new Scanner(System.in);
        int[] inputs = new int[numberOfInputs];
        for (int i = 0; i < inputs.length; i++)
        {
            inputs[i]=in.nextInt();
        }
        return inputs;
    }
    /**
     * @param data array of integer inputs.
     * @return returns the average of all the array elements
     */
    public static float getAverage(int [] data){
        int i;
        int sum=0;
        float average=0;
        for (int element : data)        
        {
            sum=element+sum;
            average=(float)sum/(data.length);
        }
        return average;
    }
    /**
     * @param data array with inputs
     * @return largest element in array
     */
    public static int getLargest(int [] data){
        int i;
        int largest = data[0];
        for (i = 0; i < data.length; i++)
        {
            if (data[i] > largest){largest = data[i];}
        }
        return largest; 
    }
    /**
     * @param data array inputs
     * @return smallest element in inputs array
     */
    public static int getSmallest(int [] data){
        int i; 
        int smallest = data[0];
        for (i = 0; i < data.length; i++)
        {
            if (data[i] < smallest){smallest = data[i];}
        }
        return smallest;
    }
}
