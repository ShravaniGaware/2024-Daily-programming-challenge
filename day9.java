import java.util.Arrays;
public class day10{
    public static String longestcommonprefix(String[] strs){
     int i=0;
        Arrays.sort(strs);
        String str1=strs[0];
       String str2=strs[strs.length-1];
       for( i=1;i<strs.length;i++){
        if(str1.charAt(i)==str2.charAt(i)){
             i++;
        }
        else{
            break;
        }
       
        return i == 0 ? "" : str1.substring(0, i);
     }
        return str1.substring(0,i);
    }
    
    
    public static void main(String[] args){
     String strs[]={"flower","flow","flight"};
     System.out.println(longestcommonprefix(strs));
}
}
