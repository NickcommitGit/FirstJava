import java.util.Scanner;
{
    public static void main(String []args){
     
        Scanner me = new Scanner(System.in);
        int n1 = 0,n2=1,n3;
        int count = me.nextInt();
        System.out.print(n1+" "+n2);
        
        for(int i = 0; i<count-2; i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
          
        }

        
        
       

    
        
        









    }
}
