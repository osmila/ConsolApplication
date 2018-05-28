package Lab1Code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1 {
    public static void main (String[] args){

        int linesNumber = 0;
        while ( true )
        {
            System.out.println("Enter the integer number of lines");
            Scanner sc1 = new Scanner(System.in);
            try
            {
                linesNumber = sc1.nextInt();
                if (linesNumber < 1)
                    throw new ZeroLinesException();
                break;
            }
            catch(InputMismatchException notInteger)
            {
                System.out.print("It's not a number. " );
            }
            catch (ZeroLinesException lessZero)
            {
                System.out.print("Number of lines can't be less than 1. ");
            }
        }

        String[] enteredLines = new String[linesNumber];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < linesNumber; i++)
        {
            System. out.println( "Please enter line " + (i+1));
            enteredLines[i] = sc2.nextLine();
        }

        FindMinString lines = new FindMinString(enteredLines);
        lines.findAndPrintMinStringAndLength();

    }
}
