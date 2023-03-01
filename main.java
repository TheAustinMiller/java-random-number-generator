import java.io.*;
import java.util.*;

public class Main{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO EPIC RANDOM NUMBER GENERATOR");
        System.out.println("How many numbers do you need");
        int times = input.nextInt();
        enter();
        System.out.println("Enter your range (inclusive)");
        System.out.println("From:");
        int low = input.nextInt();
        System.out.println("To:");
        int gap = input.nextInt();
        enter();
        int[] r = new int[times];
        for (int lcv = 0; lcv < r.length; lcv++){
            r[lcv] = (int)(Math.random()*gap+low);
        }
        System.out.println("Sorted? (Y/N)");
        enter();
        String in = input.next();
        enter();
        if (in.toUpperCase().equals("Y")){
            int swaps = 0;
            for(int lcv = 1; lcv<r.length;lcv++){ //run through array skip first element
                int begin = 0; // the swap spot
                while (begin != lcv){ 
                    if (Math.min(r[begin], r[lcv]) == r[lcv]){
                        while (begin != lcv){
                            int temp = r[lcv];
                            r[lcv] = r[begin];
                            r[begin] = temp;
                            swaps++;
                            begin++;
                        }
                    }
                    else{
                        begin++;
                    }
                }
            }
        }

        print(r);

    }

    public static void print(int[] rand){
        enter();
        System.out.println("Here are you random numbers:");
        enter();
        System.out.print("[");
        for(int lcv = 0; lcv < rand.length; lcv++){
            if (lcv == (rand.length - 1)){
                System.out.print(rand[lcv] + "]");
            }
            else{
                System.out.print(rand[lcv] + ", ");
            }
        }
    }

    public static void enter(){
        System.out.println();
    }
}
