import java.util.*;
import java.io.*;


public class ExcLabStartB
{
    public static void main() throws IOException
    {
        final int MAX = 6;
        String [] data = new String [MAX];;
        int i;
        int numRec = 0;
        int k;
        String id_num = "";
        int num_marks;
        String str_marks;
        double marks;
        double sum;
        double aver;
        int count;
        String fname;
        
        Scanner read = new Scanner (System.in);
        System.out.print ("Please enter the filename  >  ");
        fname = read.nextLine();
                
        Scanner inFile = new Scanner (new File (fname + ".txt"));
        
        while (inFile.hasNext())
        {
            id_num = inFile.next();
            num_marks = inFile.nextInt();
            sum = 0;
            for (i = 0; i < num_marks; i++)
            {
                marks = inFile.nextDouble();
                sum = sum + marks;
            }
            aver = sum / num_marks;
            
            System.out.println ("Student " + id_num + " has an average of " + aver); 
        }
         inFile.close();
     }
}