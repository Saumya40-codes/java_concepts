package com.saumya;

import java.io.*;

public class fileHandling {
    public static void main(String[] args) throws IOException {
        //looping through an array and adding it to our .txt file
        String[] name = {"John","Kane","Paine"};
        int[] nums = {1,2,3,4,8};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")); // <-- this is relative so the file path will be the current location of java file4
            writer.write("Handling the file input and output. yay !");
            writer.write("\nAnother line"); // calling it another time will just override thar file
            for(String names : name){
                writer.write("\n"+names);
            }
            for(int numbers : nums){
                writer.write("\n"+numbers);
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        //Now to read a file
        try{
            BufferedReader reader = new BufferedReader( new FileReader("output.txt"));
            System.out.println(reader.readLine()); // this will print the first line i.e. Handling the file input and output. yay !
            // to read the every text we'll use loop
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
                /*
                 Handling the file input and output. yay !
                 Another line
                 John
                 Kane
                 Paine
                 1
                 2
                 3
                 4
                 8
                 */
            }
            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
