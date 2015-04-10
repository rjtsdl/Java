import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

;

public class SubstringwithConcatenationofAllWords {

	public static void main(String[] args) {
		List<Integer> integers = findSubstring("sheateateseatea", new String[] {
				"sea", "tea", "ate" });
		for (Integer i : integers) {
			System.out.println(i);
		}
	}

	//Leetcode Judge Accepted
	public static List<Integer> findSubstring(String S, String[] L) {

		List<Integer> returnList = new ArrayList<Integer>();
		if (L == null || L.length == 0 || S == null || S.length() == 0
				|| S.length() < L[0].length()) {
			return returnList;
		}
		int wordLen = L[0].length();

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : L) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		int numOfL = L.length;

		for (int initPos = 0; initPos < wordLen; initPos++) {
			int i = initPos, j = initPos;
			while (true) {

				if (numOfL == 0) {
					returnList.add(i);

					String preOne = S.substring(i, i + wordLen);
					map.put(preOne, map.get(preOne) + 1);
					i += wordLen;
					numOfL++;
					continue;
				}

				if (j >= S.length()) {

					while (i < j) {

						String preOne = S.substring(i, i + wordLen);
						map.put(preOne, map.get(preOne) + 1);
						i += wordLen;
						numOfL++;

					}
					break;
				}

				String curOne = S.substring(j,
						Math.min(S.length(), j + wordLen));
				if (map.containsKey(curOne)) {
					if (map.get(curOne).intValue() == 0) {
						while (i < j) {
							String preOne = S.substring(i, i + wordLen);
							map.put(preOne, map.get(preOne) + 1);
							i += wordLen;
							numOfL++;

							if (curOne.equals(preOne))
								break;
						}
					} else {
						map.put(curOne, map.get(curOne) - 1);
						j += wordLen;
						numOfL--;
					}
				} else {
					while (i < j) {
						String preOne = S.substring(i, i + wordLen);
						map.put(preOne, map.get(preOne) + 1);
						i += wordLen;
						numOfL++;
					}

					i += wordLen;
					j = i;
				}

			}

		}

		return returnList;

	}

}
