package edu.fiu.cs.kdrg.bidoptimization.data.ipinyou;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import edu.fiu.cs.kdrg.bidoptimization.data.BidLogST;
import gnu.trove.set.TIntSet;
import gnu.trove.set.hash.TIntHashSet;

/**
 * Load bid request data
 * 
 * @author qwang028
 * 
 */

public class BidLogStatistics {
	
	public static final String FILEPATH_TRAINING1ST = "U:\\qwang\\yahoo data\\ipinyou.contest.dataset\\training1st";
	public static final String FILEPATH_TRAINING2ND = "U:\\qwang\\yahoo data\\ipinyou.contest.dataset\\training2nd";
	public static final String FILEPATH_TRAINING3RD = "U:\\qwang\\yahoo data\\ipinyou.contest.dataset\\training3rd";
	
	
	public static TIntSet regionSet = new TIntHashSet();
	public static TIntSet citySet = new TIntHashSet();
	public static TIntSet adExchangeSet = new TIntHashSet();
	
	
	/**
	 * read file
	 * @param filename
	 * @throws IOException
	 */
	public void readBidRequest(String filename) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String line = null;
		String sep = "\t";
		int count = 0;
		while((line = br.readLine()) != null){
			count++;
			line = line.trim();
			if(line.equals(""))
				continue;
			String[] tokens = line.split(sep);
			if(tokens.length != 19) {
				throw new IllegalArgumentException("The parameter's dimension is not 20");
			}
			
			// category statistics
			categoryStat(tokens);
		}
		br.close();
		System.out.println("Bid Request's Number: " + (count));
	}
	
	/**
	 * 
	 * @param tokens
	 */
	public void categoryStat(String[] tokens) {
		int regionItem = Integer.parseInt(tokens[5].trim());
		int cityItem = Integer.parseInt(tokens[6].trim());
		int adExchangeItem = Integer.parseInt(tokens[7].trim()); 
		int adSlotWidthItem = Integer.parseInt(tokens[12].trim());
		int adSlotHeightItem = Integer.parseInt(tokens[13].trim());
		
		if(!adExchangeSet.contains(adExchangeItem)) {
			adExchangeSet.add(adExchangeItem);
		} 
	}
	
	public static void main(String[] args) {
		BidLogStatistics blstat = new BidLogStatistics();
		for(int i = 1; i < 8; i++) {
			System.out.println("=================== Statistics starting training1st file: bid.2013031" + i + ".txt ===================");
			try {
				blstat.readBidRequest(FILEPATH_TRAINING1ST + File.separator + "bid.2013031" + i + ".txt");
			} catch (IOException e) {
				e.printStackTrace();
			} 
			System.out.println("=================== Statistics ending training1st file: bid.2013031" + i + ".txt ===================");
		}
	}
	
}
