import java.util.Arrays;
class day2{
    public static void find_missingelement(int[] old_arr){
       int  n=old_arr.length;
       int new_arr[]=new int[n+1];
       int index=0;
    
       for(int i=0;i<n-1;i++){
        new_arr[index++] = old_arr[i];
        int result=old_arr[i+1]-old_arr[i];
        if(result>1 && old_arr[i]<n){
           new_arr[index++]=old_arr[i]+1;
        } 
    }
    new_arr[index++] = old_arr[n - 1];
    System.out.println(Arrays.toString(new_arr));

    }

    public static void main(String[] args){
        int old_arr[]={1,2,4,5};
        find_missingelement(old_arr);
    }
}
