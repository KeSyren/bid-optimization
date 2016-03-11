package edu.fiu.cs.kdrg.bidoptimization.data.ipinyou;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.fiu.cs.kdrg.bidoptimization.data.BidLogOne;

/**
 * Load bid request data
 * 
 * @author qwang028
 *
 */

public class BidLogLoader {
	
	public List<BidLogOne> readBidRequest(String filename) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String line = null;
		String sep = "\t";
		List<BidLogOne> bidRequestList = new ArrayList<BidLogOne>();
		int count = 0;
		while((line = br.readLine()) != null){
			count++;
			line = line.trim();
			if(line.equals(""))
				continue;
			String[] tokens = line.split(sep);
			System.out.println(tokens.length);
			
			bidRequestList.add(setBidRequest(tokens));
		}
		br.close();
		System.out.println("Bid Request's Number: " + (count));
		return bidRequestList;
	}
	
	public BidLogOne setBidRequest(String tokens[]) {
		BidLogOne bidRequest = new BidLogOne();
		bidRequest.setBidId(tokens[0]);
		bidRequest.setTimestamp(tokens[1]);
		bidRequest.setIpinyouId(tokens[2]);
		bidRequest.setUserAgent(tokens[3]);
		bidRequest.setIpAddress(tokens[4]);
		bidRequest.setRegion(Integer.parseInt(tokens[5]));
		bidRequest.setCity(Integer.parseInt(tokens[6]));
		bidRequest.setAdExchange(Integer.parseInt(tokens[7]));
		bidRequest.setDomain(tokens[8]);
		bidRequest.setUrl(tokens[9]);
		bidRequest.setAnonymousURLID(tokens[10]);
		bidRequest.setAdSlotID(tokens[11]);
		bidRequest.setAdSlotWidth(Integer.parseInt(tokens[12]));
		bidRequest.setAdSlotHeight(Integer.parseInt(tokens[13]));
		bidRequest.setAdSlotVisibility(Integer.parseInt(tokens[14]));
		bidRequest.setAdSlotFormat(Integer.parseInt(tokens[15]));
		bidRequest.setAdSlotFloorPrice(Integer.parseInt(tokens[16]));
		bidRequest.setCreativeID(tokens[17]);
		bidRequest.setBiddingPrice(Integer.parseInt(tokens[19]));
		return bidRequest;
	}
	
	public static void main(String[] args) {
		BidLogLoader ld = new BidLogLoader();
		try {
			ld.readBidRequest("data/bid.20130311.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
