import java.util.*;
import java.io.*;
/**
 * @author  Qurrat-al-Ain Siddiqui
 */
public class ExcLabStart
{
    public static void main() 
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
        int i2 = 0;
        boolean done = false;
        while (i2 < 3 && !done) {
            Scanner read = new Scanner (System.in);
            System.out.print ("Please enter the filename  >  ");
            fname = read.nextLine();
            try {
                Scanner inFile = new Scanner (new File (fname + ".txt"));

                while (inFile.hasNext())
                {
                    id_num = inFile.next();
                    try {

                        num_marks = inFile.nextInt();
                        if (num_marks <= 0) {
                            System.out.println("Illegal expression for student " + id_num + ". Number of marks cannot be less than or equal to 0. However, it is " + num_marks);
                            if (inFile.hasNextLine()) {
                                inFile.nextLine();
                            }
                        } else {

                            sum = 0;
                            i2 = 0;
                            done = true;
                            for (i = 0; i < num_marks; i++)
                            {
                                marks = inFile.nextDouble();
                                sum = sum + marks;
                            }
                            aver = sum / num_marks;

                            System.out.println ("Student " + id_num + " has an average of " + aver);
                        }

                    } catch (InputMismatchException except) {
                        System.out.println("Illegal expression for " + id_num);
                        if (inFile.hasNextLine()) {
                            inFile.nextLine();
                        }
                    }
                    catch (NoSuchElementException excc) {
                        System.out.println("Illegal expression for " + id_num);
                        if (inFile.hasNextLine()) {
                            inFile.nextLine();
                        }
                    }
                }
                inFile.close();
            }

            catch (FileNotFoundException ex) {
                System.out.println("Invalid file name entered. ");
                i2++;
            }

            System.out.println ("\nThank you for using this system");
        }
    }
}
