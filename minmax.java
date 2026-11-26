public class minmax {
    public static void main(String[] args){
        int []arr={10,20,30,40,50};
        int i=0;
        int j=10;
        int k=0;
       for(i=0;i<arr.length;i++){ 
        if(k<arr[i]){
            k=arr[i];
        }
            else {
                k=k;
            }
       } System.out.println("maximum="+k);
         for(i=0;i<arr.length;i++){ 
        if(j>arr[i]){
            j=arr[i];}
            else {
                j=j;
            } 
        }System.out.println("minimum="+j);

        
    }
}

    
    

