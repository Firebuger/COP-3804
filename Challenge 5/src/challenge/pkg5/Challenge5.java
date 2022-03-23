package challenge.pkg5;
/**
 * @author 6283898
 * 
 * Title: Challenge 5
 * 
 * Semester: COP 3804 - Spring 2022
 * Lecturer's Name: Professor Charters
 */

import java.util.Scanner;


public class Challenge5 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner keyboard = new Scanner(System.in);
        String example;
        
        do{
            System.out.println("Give the word to change");
            example = keyboard.nextLine();


            System.out.println(example + " changes to " + changeXY(example));
            
            System.out.println();
            System.out.println("If you want to stop putting in words, please input \"yes\"");
            System.out.println("Anything other than \"yes\" will be taken as the desire to stop inputting words");
            
            example = keyboard.nextLine();
            
        } while(example.equalsIgnoreCase("yes"));
        
        System.out.println("Thank you, good bye!");
    }
    /** 
     * Description: recursively calls the method replacing each x with a y until the whole String is changed
     * @param: (org) The String to be changed
     * @return: (org) The changed String
     * Preconditions: org SHOULD be a filled string, preferably with x characters
     * Postcondition: org's x characters are changed to y
 */
    
    // The teacher herself said this counts as recursion, I showed her this exact code
    public static String changeXY(String org){
        if(org.contains("x")){
              org = org.replaceFirst("x", "y");
        }
        else{
            return org;
        }
        return changeXY(org);
    }
    
}
