import java.util.*;
class JobScheduler{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Jobs");
        int n = sc.nextInt();
        int[][] jobs = new int[n][3];
        System.out.println("Enter job start time,end time, and earnings");
        for(int i=0;i<jobs.length;i++){
            for(int j=0;j<jobs[i].length;j++){
                jobs[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[2];
        int sum =0;
        int max = 0;
        for (int i=0;i<jobs.length-1;i++)
        {

        	if(jobs[i][jobs.length-1]<jobs [i+1][jobs.length-1])
        	{

        	max =jobs [i+1][jobs.length-1];

        	}
        }
        	for(int i=0;i<jobs.length;i++)
        	{ 
        		if(jobs [i][jobs.length-1] != max)
        		{

        	sum += jobs[i][jobs.length-1];

        	}
        }
        arr[0]=n-1;
        arr[1]=sum;
        System.out.println("The number of tasks and earnings available for others");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
}