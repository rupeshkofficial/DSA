import java.util.*;
public  class stringspr {
    public static Scanner scn = new Scanner (System.in);
    public static void main (String []args){
        
        // String s1 = "hello";

        // String s1 = scn.next();
        // String s2 = scn.next();

        // String s1 = scn.nextLine();
        // String s2 = scn.nextLine();
        
        // System.out.println(s1);
        // System.out.println(s2);

        // String s = scn.nextLine();
        // System.out.println(s);
        // System.out.println(s.length());  // Here: Length is a function

       
        // for(int i=0; i< s.length(); i++){
        //     char ch = s.charAt(i); // Findout 2nd char in as string
        //     System.out.println(ch);

            //s.charAt(0) = 'z';  // won't work
       // }

//>>>>>>>>>>>>>>>>>SUBSTRING>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//  String s = "abcd";

//  System.out.println(s.substring(0,1));  // o/p: a
//  System.out.println(s.substring(0,0));  // o/p: Blank Space
//  System.out.println(s.substring(1));    // o/p: bcd

// for(int i=0; i < s.length(); i++){
//     for(int j = i+1; j <= s.length(); j++){
//         System.out.println(s.substring(i,j));
//     }
// }

//>>>>>>>>>>>>Addition of 2 String >>>>>>>>>>

//    String s1 = "hello";
//    String s2 = "world";
//    String s3 = s1+ " " + s2;
//    System.out.println(s3);
//    System.out.println( 10 + 20 + "hello"); //   O/p : 30hello
//    System.out.println("hello" + 10 + 20);  //   O/p : hello1020

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//    String s1 = "hello";
//    s1 += ' ';
//    s1 += 'w';
//    s1 += 'o';
//    s1 += 'r';
//    s1 += 'l';
//    s1 += 'd';
//    s1 += 10;
   
//    System.out.println(s1);

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
  
   String s = "abc, def, ghi, jkl mno";
   String[] parts = s.split(",");
   for(int i=0; i < parts.length; i++){
       System.out.println(parts[i]);

   }


    }
    
}