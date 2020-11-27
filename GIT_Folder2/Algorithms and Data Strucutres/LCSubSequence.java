//import java.util.*;
// import java.lang.*;

public class LCSubSequence{


    public static void main(String[] args) {
        
        String str1="testing";
        String str2="tessistsfseitsfsfsng";

        System.out.println(LCS(str1,str2, str1.length()-1,str2.length()-1));

    }

    

    public static int LCS(String str1, String str2, int i, int j){

        if(i==0||j==0)
        return 0;
        if(str1.charAt(i)==str2.charAt(j)){
            return 1+LCS(str1,str2,i-1,j-1);
        }
        else
        return Math.max(LCS(str1,str2,i-1,j),LCS(str1,str2,i,j-1));

    
        }

    
}