package com.saumya;


//with this we can catch this exception during the runtime or the compile time
//Compile time exception includes IOException, ClassNotfound and SQLException
//also program wont get directly terminated in this case
public class ExceptionHandling {
    //using e in methods
    int num =10;
    void to_throw(int n) throws Exception{
        if(n > num) {
            throw new Exception("Only size till 10 is allowed");
        }
        System.out.println(n);
    }


    public static void main(String[] args) throws Exception {
        try{
            //try includes code which may catch exception
            int str_to_int = Integer.parseInt("NAN");
        }
        //catch box won't be checked if there is no exception
        //in the braces it is something we call as exception hierarchy
        // for all types of Exception only 'Exception e' will be used and so on
        //we can also catch multiple type of exception by using different catch blocks or we can use '|'
        catch (NumberFormatException  | NullPointerException e){
            //code we want to get executed when exception occurs
            System.out.println("Enter a num !!");
        }
        // we can include 'finally block after catch'
        //it is like default statement in switch case
        finally {
            System.out.println("This will get executed irrespective of exception");
        }
        //output
        /*
        Enter a num !!
        This will get executed irrespective of exception
         */

        ExceptionHandling eh =  new ExceptionHandling();
        eh.to_throw(22); /*Exception in thread "main" java.lang.Exception: Only size till 10 is allowed
        at com.saumya.ExceptionHandling.to_throw(ExceptionHandling.java:12)
        at com.saumya.ExceptionHandling.main(ExceptionHandling.java:43) */
    }
}
