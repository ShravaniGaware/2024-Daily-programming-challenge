public class Day7 {
    public static int trappedwater(int bar[]){
      // print leftmax_element
      int left_max[]=new int[bar.length];
           left_max[0]=bar[0];
      
      for(int i=1;i<bar.length;i++)
{      
        left_max[i]=Math.max(bar[i],left_max[i-1]);

}

// print righttmax_element
int right_max[]=new int[bar.length];
     right_max[bar.length-1]=bar[bar.length-1];

for(int i=bar.length-2;i>=0;i--)
{      
     right_max[i]=Math.max(bar[i],right_max[i+1]);

}
    int trapped_water=0;
    for(int i=0;i<bar.length;i++){
      int water_level=Math.min(left_max[i],right_max[i]);
     trapped_water+=water_level-bar[i];
    }
    return trapped_water;
    }




    public static void main(String[] args){

        int bar[]={0,1,0,2,1,0,1,3,2,1,2,1};

       System.out.println (trappedwater(bar));

    }
}
