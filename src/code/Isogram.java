package code;

public class Isogram {

	public boolean isIsogram(String str) {
		if(str == null || "".equals(str)) return true;
		String lowerString = str.toLowerCase();
		char[] array = lowerString.toCharArray();
		
		for(int i=0; i < array.length; i++) {
			char newChar = array[i];
			if(lowerString.indexOf(newChar) != i) {
				return false;
			}
		}
		return true;
	}

}
