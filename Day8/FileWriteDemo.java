package service;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWriteDemo
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter("directions.txt"); 

        
        
        out.println("north");   
        out.println("south");
        out.println("east");
        out.println("west");

       
        out.close();  
    }
}