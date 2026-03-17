// 2. Frequency Counter (HashMap Project)

// Concepts

// HashMap

// Strings

// Loops

// Features

// Take a sentence

// Count frequency of each letter


import java.util.*;
class frequency{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> h=new HashMap<>();
        System.out.println("Enter a String");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(h.containsKey(str.charAt(i))){
                h.put(str.charAt(i),h.get(str.charAt(i))+1);
            }
            else{
                h.put(str.charAt(i),1);
            }
        }
        System.out.println("Character and its Frequency  :-  ");
        for(Character key:h.keySet()){
            System.out.println(key+" : "+h.get(key));
        }
    }
}