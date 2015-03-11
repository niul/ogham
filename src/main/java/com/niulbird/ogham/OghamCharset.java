package com.niulbird.ogham;

/**
 * Ogham Charset. Contains mapping for alpha characters to Ogham characters.
 * 
 * @author nbird
 *
 */
public enum OghamCharset {

	BEITH       ("B",  '\u1681'),
	LUIS        ("L",  '\u1682'),
	FEARN       ("F",  '\u1683'),
	SAIL        ("S",  '\u1684'),
	NION        ("N",  '\u1685'),
	UATH        ("H",  '\u1686'),
	DAIR        ("D",  '\u1687'),
	TINNE       ("T",  '\u1688'),
	COLL        ("C",  '\u1689'),
	CEIRT       ("Q",  '\u168A'),
	MUIN        ("M",  '\u168B'),
	GORT        ("G",  '\u168C'),
	NGEADAL     ("HG", '\u168D'),
	STRAIF      ("Z",  '\u168E'),
	RUIS        ("R",  '\u168F'),
	AILM        ("A",  '\u1690'),
	ONN         ("O",  '\u1691'),
	UR          ("U",  '\u1692'),
	EADHADH     ("E",  '\u1693'),
	IODHADH     ("I",  '\u1694'),
	EABHADH     ("EA", '\u1695'),
	OR          ("OI", '\u1696'),
	UILLEANN    ("UI", '\u1697'),
	IFIN        ("IA", '\u1698'),
	EAMHANCHOLL ("AE", '\u1699'),
	EITE        ("",   '\u169B'),
	EITE_THUA   ("",   '\u169C');
	
	private String alphaChar;
	private char oghamChar;
	
	OghamCharset(String alphaChar, char oghamChar) {
		this.alphaChar = alphaChar;
		this.oghamChar = oghamChar;
	}
	
	public char getOghamChar() {
		return oghamChar;
	}
	
	public char getOghamChar(String alphaChar) {
		return oghamChar;
	}
	
	public String getAlphaChar() {
		return alphaChar;
	}
	
	public String getAlphaChar(char oghamChar) {
		return alphaChar;
	}
}
