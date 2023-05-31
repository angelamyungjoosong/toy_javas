package src;

import java.util.Scanner;

public class MaxMins

{
    public int min(int first, int second) {
        int min = 0;
        try {

            if (first < second) {
                min = first;
            }
           else if (second < first) {
             min = second;
           }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return min;
    }

    public static void main(String[] args) {
        try {
            int first = 0;
            int second = 0;
            Scanner myObj = new Scanner(System.in);

           
            first = myObj.nextInt();
            second = myObj.nextInt();
            MaxMins maxmins = new MaxMins();
            int minresult = maxmins.min(first, second);
            System.out.println("min:");
            System.out.println(minresult);

        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }

}
