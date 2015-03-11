package com.niulbird.ogham;

/**
 * Utility class to covert alpha characters to Ogham.
 * 
 * @author nbird
 */
public class Ogham {

	
	/**
	 * Method to convert alpha string to Ogham character set.
	 * 
	 * @param alphaStr The alpha string to convert.
	 * @return Ogham representation of input string.
	 */
	public static String getOgham(String alphaStr) {
		String result = "";
		
		// Add start character.
		result = result.concat(new String(new char[] {OghamCharset.EITE.getOghamChar()}));
		
		OghamCharset[] oghamCharsets = OghamCharset.values();
		
		for (int i = 0; i < alphaStr.length(); i++) {
			boolean match = false;
			String val;
			
			// Ogham can support double character conversion. Therefore each comparison is first made
			// with 2 alpha characters and then with 1.
			if (i != alphaStr.length()-1)
				val = alphaStr.substring(i, i+2);
			else
				val = alphaStr.substring(i, i+1);
			
			for (OghamCharset oghamCharset : oghamCharsets) {
				if (oghamCharset.getAlphaChar().equalsIgnoreCase(val)) {
					result = result.concat(new String(new char[] {oghamCharset.getOghamChar()}));
					match = true;
					i++;
				}
			}
			if (!match) {
				for (OghamCharset oghamCharset : oghamCharsets) {
					if (oghamCharset.getAlphaChar().equalsIgnoreCase(val.substring(0, 1))) {
						result = result.concat(new String(new char[] {oghamCharset.getOghamChar()}));
					}
				}
			}
		}
		// Add end character.
		result = result.concat(new String(new char[] {OghamCharset.EITE_THUA.getOghamChar()}));
		
		return result;
	}
}