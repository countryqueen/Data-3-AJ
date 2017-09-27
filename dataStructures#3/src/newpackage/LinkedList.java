/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Owner
 *Class Name: LinkedList
‘*Class Author: Angelica Jones
‘******************************************************
‘*Purpose of the class: To create a LinkedList without using Java
‘***built in linkList.
‘******************************************************
‘*** Date 9/26/17
‘******************************************************
‘*** List of changes 9/26/17 I put in getters and setters for
* the link list public variables.

 */
public class LinkedList 
{
    public int value;
    public LinkedList nextLL;
    
    //this is my getter
    public int getValue()
    {
        
        return value;

    }
    
    //this is my getter
    public LinkedList getLinkedList()
    {
        return nextLL;
        
    }
    
    //create a setter
    public void setValue(int value)
    {
        this.value = value;
    }
    
    //create another setter
    public void setLinkedList(LinkedList nextLL)
    {
        this.nextLL = nextLL;
    }

    
}
