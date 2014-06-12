import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem59 {

	public static void main(String[] args) {

		// Reading text file
		String str = null;
		try {
			BufferedReader in = new BufferedReader(new FileReader("cipher1.txt"));
			str = in.readLine();
			in.close();
		} catch (IOException e) {
			System.out.println("File Read Error");
		}

		// converting string array into int array

		String[] ar = str.split(",");

		int[] arr = new int[ar.length];
		for (int i = 0; i < ar.length; i++)
			arr[i] = Integer.parseInt(ar[i]);

		// finding key

		int[] key = new int[3];

		for (int i = 0; i < 3; i++) {
			key[i] = findkey(i, arr);
			System.out.println(key[i]);
		}

		// finding sum

		findsum(key, arr);

	}

	public static int findkey(int k, int arr[])

	{
		int maxsum = 0, key = 0;

		for (int i = 97; i < 123; i++) {
			int sum = 0;
			
			for (int j = k; j < arr.length; j = j + 3) {
				int x =  arr[j]^i;

				if ((x > 96 && x < 123) || (x > 64 && x < 90)) {
					sum++;
				}
			}

			if (sum > maxsum) {
				maxsum = sum;
				key = i;
			}
		}

		return key;
	}

	public static void findsum(int[] key, int[] arr) {
		int j = 0, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			j = i % 3;
			sum += arr[i] ^ key[j];
		}
		System.out.println("The sum is " + sum);

	}

}
