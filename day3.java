import java.util.Arrays;
public class day3 {
    public static void main(String[] args){
        int arr[]={1,2,3,3,4};
         Arrays.sort(arr);
         int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]<arr.length-1 && arr[i]==arr[i+1] ){
            continue;
        }
        else{
           
            arr[count]=arr[i];
            count++;
        }
        
       }
       
       for(int i=0;i<arr.length-1;i++){
        System.out.print(arr[i]);
       }
    }
    
}
