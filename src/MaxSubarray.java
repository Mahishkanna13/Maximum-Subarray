import java.util.Scanner;

public class MaxSubarray {
    public static int CalculateSum(int[] Array,int MaxVal)
    {
        int result=0;
        for(int i=0;i<Array.length;i++)
        {
            for(int j=i;j<Array.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=Array[k];
                    if(sum<=MaxVal) {
                        result = Math.max(result, sum);
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int MaxVal= scanner.nextInt();
        int[] Array=new int[size];
        for(int i=0;i<size;i++)
        {
            Array[i]=scanner.nextInt();
        }
        System.out.println(CalculateSum(Array,MaxVal));
    }
}
