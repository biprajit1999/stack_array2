/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo1;
import java.util.Scanner;
/**
 *
 * @author biprajitdebnath
 */
public class StartDemo {
    
    int ar[];
    int top;
    StartDemo()
    {
        ar = new int[5];
        top = -1;
    }
    void push()//insert
    {
        if(top==4)
        {
          System.out.println("Stack is full");
        }
        else
        {
            System.out.println("enter data");
            Scanner s1 = new Scanner(System.in);
           // Scanner sc2 = new Scanner(System.in);
            int data = s1.nextInt();
            top = top+1;
            ar[top]=data;
            System.out.println("data inserted");
        }
        System.out.println("Push fn is working");
    }
    void pop()//Delete
    {
       
        //System.out.println("Pop In working");
        if (top==-1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            System.out.println("element deleted -"+ar[top]);
            top = top-1;
        }
    }
    void traverse()//View
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(ar[i]);
            }
            
        }
        //System.out.println("View In working");
    }
    
    public static void main(String args[])
    {
       StartDemo obj = new StartDemo();
       while(true)
       {
           System.out.println("Press 1 for push");
           System.out.println("Press 2 for pop up");
           System.out.println("Press 3 for transverse");
           System.out.println("Press 1 for exit\n");
           
           System.out.println("Enter your choice");
           Scanner sc = new Scanner(System.in);
           int ch = sc.nextInt();
           
           switch(ch)
           {
               case 1:
                   obj.push();
                   break;
               case 2:
                   obj.pop();
                   break;
               case 3:
                   obj.traverse();
                   break;
               case 4:
                   break;
               default:
                   System.out.println("Wrong Choice");
           }
               
       }
    }
}
