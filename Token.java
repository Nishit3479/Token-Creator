package ir.token.lab;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Token
{
	public static void main(String []args)
	{
		String data = ""; 
		try { 
			data = new String(Files.readAllBytes(Paths.get("test.txt")));
			} 	
		catch (IOException e) { 
			e.printStackTrace(); 
			} 
		System.out.println(data);
		String str = data.toLowerCase();
		String St="";
		for(int i=0; i<str.length(); i++)
		{
			char p = str.charAt(i);
			if(p=='.' || p==',' || p=='/' || p=='!' || p=='@' || p=='-' || p=='=' || p==';' || p==':' || p=='?' || p=='_' || p=='#' || p=='%' || p=='&' || p=='$' || 
					p=='^' || p=='*' || p=='(' || p==')' || p=='+' || p=='{' || p=='[' || p=='}' || p==']' || p=='|' || p=='<' || p=='>' || p=='~' || p=='`')
			{
				St +=" "+p;
			}
			else
			{
				St += p;
			}
		}
		String []token = St.split(" ");
		countFreq(token,token.length);
	}
	public static void countFreq(String arr[], int n) 
    { 
        Map<String, Integer> mp = new HashMap<>(); 
        for (int i = 0; i < n; i++) 
        { 
            if (mp.containsKey(arr[i]))  
            { 
                mp.put(arr[i], mp.get(arr[i]) + 1); 
            }  
            else
            { 
                mp.put(arr[i], 1); 
            } 
        } 
        for (Map.Entry<String, Integer> entry : mp.entrySet()) 
        { 
            System.out.println(entry.getKey() + " --> " + entry.getValue()); 
        } 
    } 
}
