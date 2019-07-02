public class solution {

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    
        String str = "";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == c){
                continue;
            }    
            str += input.charAt(i);
        }
        return str;
	}

}
