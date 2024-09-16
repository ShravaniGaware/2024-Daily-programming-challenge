public class Day8 {
    public static String reverse_string(String[] words){
    StringBuilder sb=new StringBuilder();
    for(int i=words.length-1;i>=0;i--){
        sb.append(words[i]);
        if(i!=0)
        sb.append(" ");
    }
    return sb.toString();
    }
    public static void main(String[] args){
        String sentence="the sky is blue";
        String[] words=sentence.split(" ");
       System.out.println(reverse_string(words));
    }
    
}
