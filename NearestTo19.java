// Java program to find numbers that are closer to 19.

import java.util.*;
public class NearestTo19{
    public static void main (String args[]){
	System.out.println ("Enter any 2 numbers. ");
        Scanner s = new Scanner (System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int c = 0;
        int d = 0;
        c = 19-n1; // for example user gives n1 = 5 => 19-5 => 4
        d = 19-n2; // for example user gives n2 = 6 => 19-6 => 3
        if (c<0) {
            c = c*-1; }
        if (d<0) {
            d = d*-1; }
        if (c<d) // 4 < 3 => No, 4 is not less than 3.
        {
            System.out.println (n1 + " is nearest to 19. "); }
        else if (c>d) { // 4 > 3 => Yes, 4 is greater than 3.
            System.out.println (n2 + " is nearest to 19. "); }
        else System.out.println (n1 + " and " + n2 + " are nearest to 19. ");
    }
}


// Output = if 5 and 6 are given by the user, then the output will be "6 is nearest to 19." 