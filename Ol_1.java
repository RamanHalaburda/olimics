/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ol_1;

import java.util.Scanner;

/**
 *
 * @author Roman
 */
public class Ol_1 {
    public static void main(String[] args) {
        System.out.print("Введите число больше 13: ");
        Scanner in = new Scanner(System.in);
        int a = 13;
        int b = in.nextInt();
        
        System.out.println("числа-близнцецы от " + a + " до " + b + ":");
        for(int m = a; (m + 1) < b; ++m)
        {
            if((4*(factorial(m-1)+1)) % (m*(m+2)) == 0)
            {
                System.out.println("(" + m + "," + (m + 2) + ")");
            }
        }
    }
    
    public static int factorial(int n)
    {
        if (n == 0) return 1;
            return n * factorial(n-1);
    }
    
}
