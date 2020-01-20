package code;

public class JadenCase {

	public Object toJadenCase(String phrase) {
		if(phrase == null || "".equals(phrase)) return null;
		String[] array = phrase.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=0; i < array.length; i++) {
			sb.append(" " + array[i].substring(0,1).toUpperCase() + array[i].substring(1));
		}
		return sb.toString().substring(1);
	}

}
