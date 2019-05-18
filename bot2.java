import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static void nextMove(int n, int r, int c, String [] grid){
    int m=r*10+c;
    int p=0;
    for (int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            if(grid[i].charAt(j)=='p')
                p=(i)*10+(j);
        }
    }
    
        if(m/10 > p/10)
        {
            System.out.println("UP");
            m=m-10;
        }
        
        else if(m/10< p/10)
        {
            System.out.println("DOWN");
            m=m+10;
        }
            
        else if(m/10==p/10)
        {
            if(m%10<p%10){
             System.out.println("RIGHT");
             m++;
            }
            if(m%10>p%10)
            {System.out.println("LEFT");
             m--;
            }
        }
        
  }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

    nextMove(n,r,c,grid);

    }
}
