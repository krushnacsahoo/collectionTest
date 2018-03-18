package com.java8.lambda;

@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
} 

@FunctionalInterface  //It is optional 
interface Sayable{  
    public String say(String name);  
}


  
public class LambdaExpressionExample {  
	void display(Sayable s1)
	{
		
	        System.out.println(s1.say("Sonoo"));  
	          
	       
	}  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
        LambdaExpressionExample lambdaExpressionExample = new LambdaExpressionExample();
        lambdaExpressionExample.display(s-> s + 1);
        
    }  
}  