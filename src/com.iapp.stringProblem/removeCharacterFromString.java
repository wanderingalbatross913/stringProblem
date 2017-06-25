package com.iapp.stringProblem;

/**
 * Created by katthy on 6/24/17.
 * Given a String and a Character, remove all instances of the Character in the String
 *
 */
public class RemoveCharacterFromString {
    /*
     * method: Iterate through the String, one character at a time
     */
    public String removeCharacterFromString(String str, Character c){
        if(str==null||str.isEmpty()) return "";
        if(c==null||c.equals("")) return str;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)!=c){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    /*
     * method: Find a method in the String class that can solve this in one line
     */
    public String replaceCharacterToEmptyOfString(String str, Character c){
        if(str==null) return "";
        if(c==null) return str;
        return str.replaceAll(c.toString(), "");
    }
}
