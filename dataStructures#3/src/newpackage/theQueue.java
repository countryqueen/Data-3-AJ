/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class theQueue 
{
    private LinkedList head;
    
    
    public theQueue()
    {
        head = null;
    }
    /*
    Method Name
‘***  Method Author (i.e. Your name)
‘******************************************************
‘*** Purpose of the Method (Why did you write this Method?)
‘*** Method Inputs: head of linked list
‘*** List all the method parameters with their expected value ranges: value, an integer data type. 
    can rangefrom whatever numbers user wants.   
‘*** Return value: nothing, this is a void method
‘*** If this is a function list the return data type and the expected range of 
‘*** values to be returned.
‘******************************************************
‘*** Date:9/26/17

    */
    public void enqueue(int value)
    {
        try
        {
        //if the head is equal to null then the link list
        //will be put in a holder/box/temporary place and will be set a value
        if(head== null)
        {
           LinkedList holder = new LinkedList();
           holder.setValue(value);
           head = holder;
        }
        else
        {
            LinkedList newBox = new LinkedList();
            newBox.setValue(value);
            
            //this will put the temporary value in the head
            LinkedList temp = head;
            //i used a while loop versus a for or do while loop because 
            while(temp.nextLL!=null)
            {
                temp = temp.nextLL;
                
            }
            temp.setLinkedList(newBox);
            
        }
        }
        
      
        catch(NumberFormatException e)
        {
            System.out.println("Can only enter numbers! Try again!");
        }//this ensures that the program will not crash if user enters anything other than numbers
    }
    /*
    Method Name
‘***  Method Author: Angelica Jones
‘******************************************************
‘*** Purpose of the Method: to dequeue integers off the stack
‘*** Method Inputs: head
‘*** List all the method parameters with their expected value ranges:none
‘*** Return value:nothing. this function is void
‘*** If this is a function list the return data type and the expected range of 
‘*** values to be returned.
‘******************************************************
‘*** Date: 9/26/17

    */


    public void dequeue()
    //this will get the next Linked List.      
    {
        if(head!=null)
        {
            //if the head of linklist is not null then the head will be
            //dequeue and move on to the next link which will be the new head.
            head = head.getLinkedList();
           
        }
        
        else
        {
          JOptionPane.showMessageDialog(null, "The list is empty.");
        }
        //if the list is empty and the user keeps dequeue-ing numbers then the message will display.
    }
    
    
}
