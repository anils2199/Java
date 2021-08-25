
public class FinalexamQ2 {
    static int printTrib(int n)
    {
         
        if (n == 0 || n == 1 || n == 2)
            return 0;
             
        if (n == 3)
            return 1;
        else
            return printTrib(n - 1) +
                   printTrib(n - 2) +
                   printTrib(n - 3);
    }
     

    // Driver code
    public static void main(String args[])
    {
        int n = 10;
 
        System.out.print(printTrib(n+1));
    }
}
		 

//main
//FinalExamQ2

