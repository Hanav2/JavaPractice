package com.craft.knowledges.inheritancepolymorphism;

//First Parent class 
class Parent1 
{ 
 void fun() 
 { 
     System.out.println("Parent1"); 
 } 
} 

//Second Parent Class 
class Parent2 
{ 
 void fun() 
 { 
     System.out.println("Parent2"); 
 } 
} 
//Error : Test is inheriting from multiple 
class Test extends Parent1
{ 
   public static void main(String args[]) 
   { 
       Test t = new Test(); 
       t.fun(); 
   } 
} 
