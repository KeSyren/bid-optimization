package edu.fiu.cs.kdrg.bidoptimization.data.ipinyou;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import edu.fiu.cs.kdrg.bidoptimization.data.BidLog;
import gnu.trove.set.TIntSet;
import gnu.trove.set.hash.THashSet;
import gnu.trove.set.hash.TIntHashSet;
import gnu.trove.set.hash.TLinkedHashSet;

/**
 * Load bid request data and category statistics.
 * 
 * @author qwang028
 * 
 */

public class BidLogStatistics {
	
	public static final String FILEDIR_TRAINING1ST = "U:\\qwang\\yahoo data\\ipinyou.contest.dataset\\training1st";
	public static final String FILEDIR_TRAINING2ND = "U:\\qwang\\yahoo data\\ipinyou.contest.dataset\\training2nd";
	public static final String FILEDIR_TRAINING3RD = "U:\\qwang\\yahoo data\\ipinyou.contest.dataset\\training3rd";
	
	public static THashSet<String> userAgentSet = new TLinkedHashSet<String>();
	public static TIntSet regionSet = new TIntHashSet();
	public static TIntSet citySet = new TIntHashSet();
	public static THashSet<String> adExchangeSet = new TLinkedHashSet<String>();
	public static THashSet<String> adSlotWidthSet = new TLinkedHashSet<String>();
	public static THashSet<String> adSlotHeightSet = new TLinkedHashSet<String>();
	public static THashSet<String> adSlotVisibilitySet = new TLinkedHashSet<String>();
	public static THashSet<String> adSlotFormatSet = new TLinkedHashSet<String>();
	public static THashSet<String> advertiserIDSet = new TLinkedHashSet<String>();
	public static THashSet<String> userTagSet = new TLinkedHashSet<String>();
	
	
	/**
	 * read file
	 * @param filename
	 * @throws IOException
	 */
	public void readBidRequest(String dir, String filename, boolean isTraining1st) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(dir + File.separator + filename));
		String line = null;
		String sep = "\t";
		int count = 0;
		String[] tokens = null;
		while((line = br.readLine()) != null){
			count++;
			line = line.trim();
			if(line.equals(""))
				continue;
			tokens = line.split(sep);
			if(isTraining1st == true) {
				if(tokens.length != 19)
					throw new IllegalArgumentException("The training1st's dimension is not 20!");
			} else if(tokens.length != 21) {
				throw new IllegalArgumentException("The training2nd or training3rd's dimension is not 21!");
			}
			
			// category statistics
			categoryStatistics(tokens);
		}
		          
		// print category
		printCategory();
		
		br.close();
		System.out.println("Bid Request's Number: " + (count));
		
	}
	
	/**
	 * category Statistics
	 * @param tokens
	 */
	public void categoryStatistics(String[] tokens) {
		
		String userAgentItem = tokens[3].trim();
		int regionItem = Integer.parseInt(tokens[5].trim());
		int cityItem = Integer.parseInt(tokens[6].trim());
		String adExchangeItem = tokens[7].trim(); 
		String adSlotWidthItem = tokens[12].trim();
		String adSlotHeightItem = tokens[13].trim();
		String adSlotVisibilityItem = tokens[14].trim();
		String adSlotFormatItem = tokens[15].trim();
		//training2nd and training3rd
		String advertiserIDItem = tokens[19].trim();
		String userTagItem = tokens[20].trim();
		
		userAgentSet.add(userAgentItem);
		regionSet.add(regionItem);
		citySet.add(cityItem);
		adExchangeSet.add(adExchangeItem);
		adSlotWidthSet.add(adSlotWidthItem);
		adSlotHeightSet.add(adSlotHeightItem);
		adSlotVisibilitySet.add(adSlotVisibilityItem);
		adSlotFormatSet.add(adSlotFormatItem);
		advertiserIDSet.add(advertiserIDItem);
		userTagSet.add(userTagItem);
	}
	
	public void printCategory() {
	
		System.out.println("Region List Size: " + regionSet.size());
		for(int region : regionSet.toArray()) {
			System.out.print(region + " ");
		}
		System.out.println();
		System.out.println("City List Size: " + citySet.size());
		for(int city : citySet.toArray()) {
			System.out.print(city + " ");
		}
		System.out.println();
		System.out.println("Ad Exchange list Size: " + adExchangeSet.size());
		for(Object adExchange : adExchangeSet.toArray()) {
			System.out.print(adExchange + " ");
		}
        System.out.println();
        System.out.println("Ad Slot Width list Size: " + adSlotWidthSet.size());
        for(Object adSlotWidth : adSlotWidthSet.toArray()) {
        	System.out.print(adSlotWidth + " ");
        }
        System.out.println();
        System.out.println("Ad Slot Height list Size: " + adSlotHeightSet.size());
        for(Object adSlotHeight : adSlotHeightSet.toArray()) {
        	System.out.print(adSlotHeight + " ");
        }
        System.out.println();
        System.out.println("Ad Slot Visibility list Size: " + adSlotVisibilitySet.size());
        for(Object adSlotVisibility : adSlotVisibilitySet.toArray()) {
        	System.out.print(adSlotVisibility + " ");
        }
        System.out.println();
        System.out.println("Ad Slot Format list Size: " + adSlotFormatSet.size());
        for(Object adSlotFormat : adSlotFormatSet.toArray()) {
        	System.out.print(adSlotFormat + " ");
        }
        System.out.println();
        System.out.println("AdvertiserID list Size: " + advertiserIDSet.size());
        for(Object advertiserID : advertiserIDSet.toArray()) {
        	System.out.print(advertiserID + " ");
        }
        System.out.println();
        System.out.println("User Tag list Size: " + userTagSet.size());
        for(Object userTag : userTagSet.toArray()) {
        	System.out.print(userTag + " ");
        }
        System.out.println();
	}
	
	public static void main(String[] args) {
		BidLogStatistics blstat = new BidLogStatistics();
		
//		System.out.println("################################## Start Training1st Statistics ##################################");
//		for(int i = 1; i < 8; i++) {
//			System.out.println("=================== Statistics starting training1st file: bid.2013031" + i + ".txt ===================");
//			try {
//				blstat.readBidRequest(FILEDIR_TRAINING1ST, "bid.2013031" + i + ".txt", true);
//			} catch (IOException e) {
//				e.printStackTrace();
//			} 
//			System.out.println("=================== Statistics ending training1st file: bid.2013031" + i + ".txt ===================");
//		}
//		System.out.println(" ===================== Total Statistics of Training1st ====================== ");
//		blstat.printCategory();
//		System.out.println("################################## End Training1st Statistics ##################################");
		
//		System.out.println("################################## Start Training2nd Statistics ##################################");
//		for(int i = 6; i < 13; i++) {
//			String day = null;
//			if(i / 10 == 0) day = "0" + i;
//			else day = i + "";
//			System.out.println("=================== Statistics starting training2nd file: bid.201306" + day + ".txt ===================");
//			try {
//				blstat.readBidRequest(FILEDIR_TRAINING2ND, "bid.201306" + day + ".txt", false);
//			} catch (IOException e) {
//				e.printStackTrace();
//			} 
//			System.out.println("=================== Statistics ending training2nd file: bid.201306" + day + ".txt ===================");
//		}
//		System.out.println(" ===================== Total Statistics of Training2nd ====================== ");
//		blstat.printCategory();
//		System.out.println("#################################### End Training2nd Statistics ###################################");
//		
		System.out.println("################################## Start Training3rd Statistics ##################################");
		for(int i = 19; i < 29; i++) {
			System.out.println("=================== Statistics starting training3rd file: bid.201310" + i + ".txt ===================");
			try {
				blstat.readBidRequest(FILEDIR_TRAINING3RD, "bid.201310" + i + ".txt", false);
			} catch (IOException e) {
				e.printStackTrace();
			} 
			System.out.println("=================== Statistics ending training3rd file: bid.201310" + i + ".txt ===================");
		}
		System.out.println(" ===================== Total Statistics of Training3rd ====================== ");
		blstat.printCategory();
		System.out.println("#################################### End Training3rd Statistics ###################################");
	
		
		System.out.println("||||||||||||||||||||| Total Statsistics |||||||||||||||||||||||||");
		blstat.printCategory();
	}
	
}
