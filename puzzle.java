import java.util.Scanner;

import java.math.*;

public class puzzle
{
    public static void main(String[] args) {
        int[][] goalState= new int[10][10];
        int[][] initialState= new int[10][10];
        int misplacedCounter,manhattanCounter,c=0;


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter initial state:-");
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                initialState[i][j]=sc.nextInt();
            }
            System.out.println("\n");
        }

        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                c++;
                goalState[i][j] = c;
            }
        }
        goalState[3][3] = 0;       


        System.out.println("The given initial state is:-");
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print(" "+initialState[i][j]+" ");
            }
            System.out.println("\n");
        }

        misplacedCounter= misplacedItem(initialState,goalState);
        manhattanCounter= manhattanDistance(initialState,goalState);

        System.out.println("Misplaced tile's Heuristic value is : "+misplacedCounter);        
        System.out.println("Manhattan distance's Heuristic value is : "+manhattanCounter);
    }

    public static int misplacedItem(int[][] initialState,int[][] goalState)
    {
        int count=0;
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
               if(goalState[i][j]!=initialState[i][j])
                    count++;
               if(goalState[i][j]==0)
                   count--;
            }
        }
        return count;
    }

    public static int manhattanDistance(int[][] initialState,int[][] goalState)
    {
        int count=0;

        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
               for(int k=1;k<=3;k++){
                   for(int l=1;l<=3;l++){
                       if (goalState[i][j]==initialState[k][l]&&goalState[i][j]!=0)
                       {
                        count=count+Math.abs(k-i)+Math.abs(l-j); 
                        }
                    }
                }
               
            }
        }
        return count;
    }

}