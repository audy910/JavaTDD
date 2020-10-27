package com.ordestiny.tdd.string;

public class FizzBuzz {

    public String fizzBuzz(int num)
    {
        StringBuilder returnStatement = new StringBuilder();
        for(int i = num; num >= i; i++)
        {
            if((i%3==0) && i%5==0)
            {
                returnStatement.append("FizzBuzz\n");
            }
            else if(i%3==0)
            {
                returnStatement.append("Fizz\n");
            }
            else if(i%5==0)
            {
                returnStatement.append("Buzz\n");
            }
            else
            {
                returnStatement.append(i).append("\n");
            }
        }
        return returnStatement.toString();
    }
}
