package com.shilpa;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Program1 {
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		  
		//String Literal expression
		Expression exp = parser.parseExpression("'Hello SPEL'");  
		String message = (String) exp.getValue();  
		System.out.println(message);
		
		exp = parser.parseExpression("'Hello SpEL'.concat('!')");
       String strVal = exp.getValue(String.class);
        System.out.println("2. Method invocation value:\n" + strVal);
        // Mathematical operator
        exp = parser.parseExpression("16 * 5");
        Integer intVal = exp.getValue(Integer.class);
        System.out.println("3. Mathematical operator value:\n" + intVal);
        
        //  Relational operator
        exp = parser.parseExpression("5 < 9");
        boolean boolVal = exp.getValue(Boolean.class);
        System.out.println("4. Mathematical operator value:\n" + boolVal);
        
        //  Logical operator
        exp = parser.parseExpression("400 > 200 && 200 < 500");
        boolVal = exp.getValue(Boolean.class);
        System.out.println("5. Logical operator value:\n" + boolVal);
        
        //  Ternary operator
        exp = parser.parseExpression("'some value' != null ? 'some value' : 'default'");
        strVal = exp.getValue(String.class);
        System.out.println("6. Ternary operator value:\n" + strVal);
        
        //  Elvis operator
        exp = parser.parseExpression("'some value' ?: 'default'");
        strVal = exp.getValue(String.class);
        System.out.println("7. Elvis operator value:\n" + strVal);
        
        //  Regex/matches operator
        exp =parser.parseExpression("'UPPERCASE STRING' matches '[A-Z\\s]+'");
        boolVal = exp.getValue(Boolean.class);
        System.out.println("8. Regex/matches operator value:\n" + boolVal);

        Expression exp1 = parser.parseExpression("'Hello World'.bytes");  
        byte[] bytes = (byte[]) exp1.getValue();  
        for(int i=0;i<bytes.length;i++){  
            System.out.print(bytes[i]+" ");  
        }  
        Expression exp11 = parser.parseExpression("'Hello World'.bytes.length");  
        int length = (Integer) exp11.getValue();  
        System.out.println(length);  
        
        Expression exp2 = parser.parseExpression("new String('hello world').toUpperCase()");  
        String message1 = exp2.getValue(String.class);  
        System.out.println(message1);  

	}
}
