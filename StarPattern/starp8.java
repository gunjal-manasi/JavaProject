public class starp8 {
    public static void main(String[] args) {
       /*
             
  *     *   
   *   *     
    * *       
     *
        */


        for(int i=1;i<=5;i++)
        {
                for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++)
            {
                if(j==1 || (i+j)==6)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
