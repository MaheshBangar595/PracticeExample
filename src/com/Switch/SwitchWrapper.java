package com.Switch;

public class SwitchWrapper {

	  public static void main(String args[])  
      {         
           Integer age = 65;        
           switch (age)  
           {  
               case (16):            
                   System.out.println("You are under 18.");  
                   break;  
               case (18):                
                   System.out.println("You are eligible for vote.");  
                   break;  
               case (65):                
                   System.out.println("You are senior citizen.");  
                   break;  
               default:  
                   System.out.println("Please give the valid age.");  
                   break;  
           }             
       }  
	
}
