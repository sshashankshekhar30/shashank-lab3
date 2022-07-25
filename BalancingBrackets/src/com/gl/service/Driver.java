package com.gl.service;

import java.util.*;
import com.gl.service.Brackets;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		
			String exp = "({[)}]";
			boolean res;
			res = Brackets.checkingBrackets(exp);
			if(res == true)
				System.out.println(" Incorrect expression ");
			else
				System.out.println("Correct expression");
		}
}
