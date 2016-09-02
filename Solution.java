import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
		String str,temp;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any string to find its longest substring");
	
		str=br.readLine();
		
		int len=str.length();
		//System.out.println(len);
		if(len == 1)
		{
		  System.out.println(str);
		  return;
		}
        	else
	{		
		int ft=(int) Math.ceil((double)len/2);
		int lt=len/2;
		
		for(int i=0;i<len/2;i++)
		{
		    if(str.substring(0,lt).equals(str.substring(ft)))
		    {
		        temp=str.substring(0,lt);
		        System.out.println(temp);
		        return;
		    }
			else
		    {
		        ft++;
		        lt--;
		    }
		}
	}
    }
}