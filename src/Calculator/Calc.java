package Calculator;

import java.util.Scanner;

public class Calc {

		  static float addition(float[] value)
		  {
		  	float add=value[0];
		  	for(int i=0;i<(value.length-1);i++)
		  	{
		  		add += value[i+1];
		  	}
		  	return add;
		  }
		  
		  static float subtraction(float[] value)
		  {
		  	float sub=value[0];
		  	for(int i=0;i<(value.length-1);i++)
		  	{
		  		sub -= value[i+1];
		  	}
		  	return sub;
		  }
		  
		  static float multiplication(float[] value)
		  {
		  	float mul=1;
		  	for(int i=0;i<value.length;i++)
		  	{
		  		mul *= value[i];
		  	}
		  	return mul;
		  }
		  
		  static float division(float[] value)
		  {
		  	float div = value[0];
		  	for(int i=0;i<(value.length-1);i++)
		  	{
		  		div /= value[i+1];
		  	}
		  	return div; 
		  }
		  
		  public static void main(String[] args) {
		  	int number;
		  	System.out.println("Enter how many values:");
		  	Scanner input = new Scanner(System.in);
		  	number = input.nextInt() ;
		  	float[] value = new float[number]; 
		  	for(int i=0; i<number;i++) 
		  	{
		  		System.out.println("Enter value"+(i+1)+ ":");
		  		value[i] = input.nextFloat();	
		  	}
		  	System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
		  	System.out.println("Select the operation to take place:");
		  	int operator;
		  	operator = input.nextInt();
		  	switch (operator) 
		  	{
		  	case 1:
		  		System.out.println("The result of addition: "+ addition(value));
		  		break;	
		  	case 2:
		  		System.out.println("The result of subtraction: "+ subtraction(value));
		  		break;
		  	case 3:
		  		System.out.println("The result of multiplication: "+ multiplication(value));
		  		break;
		  	case 4:
		  		System.out.println("The result of division: "+ division(value));
		  		break;
		  	 default:
		  		System.out.println("No such operation");
		  	}
		  	input.close();
		  }	
		  
}
