package com.gl.service;

import java.util.Stack;

public class Brackets 
{
public static boolean checkingBrackets(String exp) {
	// TODO Auto-generated method stub
	Stack<Character> stack = new Stack<Character>();
	for(int i=0;i<exp.length();i++)
	{
		char x= exp.charAt(i);
		if(x=='(' || x=='{' || x=='[')
		{
			stack.push(x);
			continue;
		}
		if(stack.isEmpty())
			return false;
		char check;
		switch(x)
		{
		case ')' :
			check = stack.pop();
			if(check=='[' || check =='{')
				return false;
			break;
		case '}' :
			check = stack.pop();
			if(check=='[' || check ==')')
				return false;
			break;
		case ']' :
			check = stack.pop();
			if(check=='(' || check =='{')
				return false;
			break;
		}
	}
	return false;
	
}

}