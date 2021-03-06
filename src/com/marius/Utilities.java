package com.marius;

public class Utilities {

    //returns a char array containing every nth char
    public char[] everyNthChar(char[] sourceArray, int n){
        if(sourceArray== null || sourceArray.length<n){
            return sourceArray;
        }
        int returnedLength = sourceArray.length/n;
        char[] result = new char[returnedLength];
        int index =0;

        for(int i = n-1;i < sourceArray.length; i+=n){
            result[index++] = sourceArray[i];
        }
        return result;
    }

    //remove one character from pairs of the same character that are next to each other
    public String removePairs(String source){
        if(source == null || source.length()<2){
            return source;
        }

        StringBuilder s = new StringBuilder();
        char[] string = source.toCharArray();

        for(int i=0;i<string.length-1; i++){
            if(string[i]!=string[i+1]){
                s.append(string[i]);
            }
        }
        s.append(string[string.length-1]);
        return s.toString();
    }

    public int converter(int a, int b){
        return (a/b)+(a*30) -2;
    }

    public String nullIfOddLength(String source){
        if(source.length()%2 == 0){
            return source;
        }
        return null;
    }

}
