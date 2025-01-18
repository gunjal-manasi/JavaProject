public class starp7 {
    /*
     * 
    * *
   *   *
  *     *
 *       *
     */
     public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int k=5;k>=i;k--)
            {
                System.out.print( " ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print("* ");
                }
                else
                {
                    //two spaces
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
