package edu.fiu.cs.kdrg.bidoptimization.data;

/**
 * 1 (impression), 2(click), or 3(conversion). 
 * 
 * @author qwang028
 *
 */
public enum LogType {
	Impression(1), Click(2), Conversion(3);

	private int value;

	private LogType(int value) {
		this.value = value;
	}
}
