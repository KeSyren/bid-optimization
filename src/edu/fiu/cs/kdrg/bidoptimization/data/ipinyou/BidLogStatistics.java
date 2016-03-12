package edu.fiu.cs.kdrg.bidoptimization.data.ipinyou;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import edu.fiu.cs.kdrg.bidoptimization.data.BidLogST;

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
	
	Set<Integer> adExchangeSet = new HashSet<Integer>();
	
	
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
			if(!adExchangeSet.contains(new Integer(tokens[7].trim()))) {
				adExchangeSet.add(new Integer(tokens[7].trim()));
			} 
//			bidRequestList.add(setBidRequest(tokens));
		}
		br.close();
		System.out.println("Bid Request's Number: " + (count));
		for(Integer i : adExchangeSet) {
			System.out.println(i.intValue());
		}
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
