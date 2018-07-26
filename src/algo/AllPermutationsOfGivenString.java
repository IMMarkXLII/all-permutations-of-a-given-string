/**
 * @author ashish.adhikari
 */
package algo;

/**
 * @author ashish.adhikari
 *
 */
public class AllPermutationsOfGivenString {
	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		permute(str, 0, n - 1);
	}

	/**
	 * @param str
	 * @param i
	 * @param j
	 */
	private static void permute(String str, int i, int j) {
		if (i == j)
			System.out.println(str);
		else {
			for (int k = i; k <= j; k++) {
				str = swap(str, i, k);
				permute(str, i+1, j);
				str = swap(str, i, k);
			}

		}
	}

	/**
	 * @param str
	 * @param i
	 * @param k
	 * @return
	 */
	private static String swap(String str, int i, int k) {
		char[] charArray = str.toCharArray();
		
		char temp = charArray[i];
		charArray[i] = charArray[k];
		charArray[k] = temp;
		return String.valueOf(charArray);
	}
}
