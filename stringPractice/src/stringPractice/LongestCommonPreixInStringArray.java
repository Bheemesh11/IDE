package stringPractice;

public class LongestCommonPreixInStringArray {
	public static void main(String[] args) {
		String[] strs = { "flowers", "flow", "floar" };
		System.out.println(app(strs));
	}

	private static String app(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String firstString = strs[0];
		for (int i = 0; i < firstString.length(); i++) {
			for (int j = 1; j < strs.length; j++) {
				if (i >= strs[j].length() || strs[j].charAt(i) != firstString.charAt(i)) {
					System.out.println(firstString);
					return firstString.substring(0, i);
				}
			}
		}
		return firstString; 
	}

}
