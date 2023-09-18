package com.bechr.lektion3;

public class Main {

    public static void main(String[] args) {

        //instantiate object
        //related to java class 'Student'
        Student theAmerican = new Student("Benny", 15, true);
        Student theBritish = new Student("Frida", 16, false);




        System.out.println(theAmerican.name);
        System.out.println(theAmerican.age);
        System.out.println(theAmerican.isTired);
        if (theAmerican.isTired){
            System.out.println("damn bruh im tired af");
        } else {
            System.out.println("im full of energy");
        }
        System.out.println(theBritish.name);
        System.out.println(theBritish.age);
        System.out.println(theBritish.isTired);
        if (theBritish.isTired){
            System.out.println("im really tired today");
        } else {
            System.out.println("jag är pigg idag");
        }

/* //ADDITION
        //way 1 - returns data
        System.out.println(addition1(120, 293));

        //way 2 - does NOT return data
        addition2(20, 39);
    }

    //way 1
    public static int addition1(int x, int y){
        return x + y;
    }

    //way 2
    public static void addition2(int x, int y){
        System.out.println(x + y);
    }
*/
    /* HOW TO CREATE A METHOD
    #1 visibility modifier: public, protected, no-mod, private
    #2 static: exclude if not needed
    #3 data type to return: send data - void, int, String...
    #4 name: camelCase - addTwoNumbers - followed by () {}
     */
    }
}
