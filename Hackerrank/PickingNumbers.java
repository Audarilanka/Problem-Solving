import java.util.*;
public class PickingNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] frequencie = new int[100];
		for(int ii = 0; ii < n; ii++)
			frequencie[in.nextInt()]++;
		
		int out = Integer.MIN_VALUE;
		for(int ii = 0; ii < frequencie.length - 1; ii++)
			out = frequencie[ii] + frequencie[ii + 1] > out ? frequencie[ii] + frequencie[ii + 1] : out;
		
		System.out.println(out);
        in.close();
	}
}