public class DAY5 {
    public static void element(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i<arr.length-1 && arr[i]<arr[j]){
                    arr[count]=arr[j];
                    count++;
                    i++;
                }
                else{
                    i++;
                }
            }
        } 
        
       for(int i=0;i<count;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.print(arr[arr.length - 1]);
       System.out.println();
    }
    public static void main(String[] args){
        int arr[]={6,17,4,3,5,2};
         element(arr);
       
    }
}
