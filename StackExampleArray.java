/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo1;

/**
 *
 * @author biprajitdebnath
 */

import java.util.*;


public class StackExampleArray {
    
    int ar[] = new int[10];
    int top;
    
    StackExampleArray()
    {
        top = -1;       //indiacates that it is empty
    }
    
    void push(int item)   //insert
    {          
       if(top == 10)
       {
           System.out.println("stack is full");
       }
       else
       {
           ar[++top] = item;
       }
      
    }
    
    int pop()      //delete
    {
        if(top<0)
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
        {
            return ar[top--];
        }
    }
    
    boolean empty_stack()
    {
        if(top == -1)
            return true;
        else
            return false;
    }
    void transverse()       //print(view)
    {
        int temp = 0;
        
        if(!empty_stack())
        {
            temp = pop();
            System.out.println(temp);
            transverse();
        }
        push(temp);
    }
    
    
    public static void main(String args[])
    {
        StackExampleArray obj = new StackExampleArray();
        
        //Scanner s = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("press 1 for push: ");
            System.out.println("press 2 for pop: ");
            System.out.println("press 3 for transverse: ");
            System.out.println("press 4 for exit: \n");
            
            System.out.println("Enter your choice: ");
            
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    //obj.push(s.nextInt());
                    obj.push(64);
                    obj.push(34);
                    obj.push(90);
                   
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.transverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Wrong choice....");
               
            }
        }
    }
    
    
    
}
