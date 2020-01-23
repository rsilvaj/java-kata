package code;

public class FindOdd {

	public static int findIt(int[] a) {
		int length = a.length;
		int odd = a[0];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if(a[i] == a[j] && i != j) {
					a[i] = odd;
					a[j] = odd;
					break;
				}
			}
		}
		for (int i = 0; i < length; i++) {
			if(odd != a[i]) {
				odd = a[i];
				break;
			}
		}
		return odd;
	}
}
