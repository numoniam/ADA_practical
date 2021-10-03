public class CoinChangeWays {
	static long getNumberOfWays(long N, long[] Coins){
		long[] ways = new long[(int)N + 1];
		ways[0] = 1;
		for (int i = 0; i < Coins.length; i++) {
			for (int j = 0; j < ways.length; j++) {
				if (Coins[i] <= j) {
					ways[j] += ways[(int)(j - Coins[i])];
				}
			}
		}
		return ways[(int)N];
	}

	static void printArray(long[] coins){
		for (long i : coins)
			System.out.println(i);
	}

	public static void main(String args[]){
		long Coins[] = { 1, 5, 10 };

		System.out.println("The Coins Array:");
		printArray(Coins);

		System.out.println("Solution:");
		System.out.println(getNumberOfWays(12, Coins));
	}
}

