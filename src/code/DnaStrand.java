package code;

public class DnaStrand {

	public static String makeComplement(String dna) {
		String fromStr = "TACG";
		char[] to = {'A', 'T', 'G', 'C'};
		char[] origin = dna.toCharArray();
		for (int y=0; y < origin.length; y++) {			
			origin[y] = to[fromStr.indexOf(origin[y])];
		}
		return String.valueOf(origin);
	}
	
}
