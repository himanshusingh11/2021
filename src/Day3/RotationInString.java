package Day3;

import java.util.Scanner;

/*
Why String are immutable in Java?
In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.

Once string object is created its data or state can't be changed but a new string object is created
Also Tell the advantages of immutability
Ans:"https://www.educative.io/edpresso/why-are-strings-immutable-in-java"
 */
public class RotationInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String rotatedString = scanner.nextLine();
        if(s.length()!=rotatedString.length()){
            System.out.println("False");
        }
        else if(s==null||rotatedString==null){
            System.out.println("False");
        }
        else{
            String s1 = s.concat(s);
            System.out.println(s1.contains(rotatedString));
        }

    }
}
