public class App {
	public static void main(String[] args) {

		int[][] a = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 1, 3, 5 }
		};
		System.out.println(sum2D(a)); // should print 30
	}

	public static int sum2D(int[][] nums) {
		int sum = 0;
		
		for (int j = 0; j < nums.length; j++) {
			for (int i = 0; i < nums[0].length; i++) {
				sum += nums[j][i];
				
				
				System.out.println(nums[j][i]);

			}

		}
		return sum;
	}

}
