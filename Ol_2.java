/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ol_2;

import java.util.Scanner;

/**
 *
 * @author Roman
 */
public class Ol_2 {
    public static void main(String[] args) {
        System.out.print("Введите размерность: ");
        Scanner in = new Scanner(System.in);
        int dim = in.nextInt();
        System.out.print("Введите символ: ");
        String symbol = in.next();
                
        System.out.println("Поехали рисовать!");
        /*
        ***
        ***
        ***
        */
        for(int i = 0; i < dim; ++i)
        {
            for(int j = 0; j < dim; ++j)
                System.out.print(symbol);
            System.out.println();
        }
        System.out.println();
        
        /*
        *
        **
        ***
        */
        for(int i = 1; i <= dim; ++i)
        {
            for(int j = 0; j < i; ++j)
                System.out.print(symbol);
            System.out.println();
        }
        System.out.println();
        
        /*
          *
         **
        ***
        */
        for(int i = 0; i < dim; ++i)
        {
            for(int j = 0; j < dim; ++j)
                if(j >= (dim - i - 1))
                    System.out.print(symbol);
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();
        
        /*
        ***
        **
        *
        */
        for(int i = 0; i <= dim; ++i)
        {
            for(int j = dim - i; j > 0; --j)
                System.out.print(symbol);
            System.out.println();
        }
        System.out.println();
        
        /*
        ***
         **
          *
        */
        for(int i = 0; i < dim; ++i)
        {
            for(int j = 0; j < dim; ++j)
                if(j >= i)
                    System.out.print(symbol);
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println();
    }
    
}
