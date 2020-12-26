#include <stdio.h> //preprocessor directive       stdio.h - standard input output file

void main(){ // Compiler will start its execution/compilation from main function

    int n1,n2,sum;  // Declaring of variables
    n1 = 18; // Assignment of variables
    n2 = 19;

    sum = n1+n2;
    printf("The sum of 18 and 19 is %d \n",sum);
    
    printf("Sum of 5 and 6 is %f",(5.0+6.0)); //%d - format specifier  INteger - %d  character - %c  float - %f
    printf("\n Hey..... This is our first C lang. code \n");
} 

// This is single line comment


/* 
    This is
    multiple
    line
    comment
*/

// Keywords - Reserved Words

/*
    Data Types - Type of data/variable we are using in our program.
    Types of Data Types:
        1. User-defined DT - structure,union
        2. Built-in DT
            Integer - int (Ex. -- 2,4,8,-9)
            Floating Type No. - float (decimal ex. -- 5.4, 7.25, 7.8888, 8.0)
            Character - char (Ex. -- a,d,f,e,r,d)
            String - Group of characters (Ex. -- My name is Prabhakar)
        3. Derived DT - Array,pointer,etc.
*/

