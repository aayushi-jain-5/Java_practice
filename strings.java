// import java.util.scanner;
import java.util.*;

public class String{
    public static void main(Strings[] args) {
        //concatenation
        // String firstName="tony";
        // String lastName="stark";
        // String fullName = firstName +"@" + lastName;
        // System.out.println(fullName.length());

        // //charAt
        // for(int i=0;i< fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }

        //compare
        String name1 ="Tony";
        String name2 ="Tony";

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");

        }
        else{
            System.out.println("Strings are not equal");
        }

        // here in this if we compare two strings with equal sign then it will not work !!


        //substring

        String sentence ="My name is Tony";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);


        //strings are immutable....
    }
}