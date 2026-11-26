public class sama {
    public static void main(String[] args) {
        int []number={15,19,29,10,28};
        int sum=0;
        int avg=0;
        int a=0;
        int b=15;
        for (int i=0;i<number.length;i++){
            sum+=number[i];


        
      
        avg=sum/number.length;
        
        
            if(a<number[i]){
                a=number[i];
            }
            else{
                a=a;
            }
            
            if(b>number[i]){
              b=number[i];
            }
            else{
                b=b;
            }
        }
            System.out.println(sum);  
            System.out.println(avg);
            System.out.println("maximum="+a);
            System.out.println("minimum="+b);
        }




        


        


         
    }
    

