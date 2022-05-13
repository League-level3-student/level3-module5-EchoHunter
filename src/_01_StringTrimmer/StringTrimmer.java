package _01_StringTrimmer;

public class StringTrimmer {

    /*
     * This method removes the specified number of characters from the right
     * side of the specified string and returns the trimmed string. 
     */
    static public String trimString(String str, int removesLeft) {
        // 1. If there are no removes left
        StringBuilder s = new StringBuilder(str);    
    	if (removesLeft == 0) {
				return str;
			}
            // 2. Return the string
            else {
            	s.deleteCharAt(str.length()-1);
            	str = s.toString();
            	removesLeft--;
            	return trimString(str,removesLeft);
            }
        // 3. Else you need to remove the last letter from the string,
        //    reduce removesLeft by 1, and then call trimString() 

    }
}
