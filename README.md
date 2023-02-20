# PrimeNumberProgramInJava

in c written like this

#include<stdio.h>
#include<math.h>
int main()
{
for(int i = 1; i <= 100000 ; i++)
{
    int temp= 0;
    for(int j = 2; j <sqrt(i) ; j++)
    {
        if(i%j == 0)
        {
            temp+=1;
            break;
        }
    }
    if(temp == 0){printf("%d ",i);}
}
}


in python written like this

from math import sqrt      
for i in range(1,100000):
    k = int(sqrt(i))
    for j in range(2,k):
        if(i%j == 0):
            break
    else:
        print(i,end=" ")


in java written like this

//import javautil.*;
//import javamath.*;
public class KalyanReddy
{
    public static void main(String[] args)
    {
    
        for(int i = 1; i <= 40000 ; i++)
        {
            int temp = 0;
            for(int j=2 ; j<Math.sqrt(i); j++)
            {
                if(i%j == 0)
                {
                    temp +=1;
                    break;
                }
            }
            if(temp == 0)
            System.out.print(i+" ");
        }
    }
}



