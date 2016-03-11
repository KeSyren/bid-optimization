package fiu.cis.kdrg.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fiu.cis.kdrf.core.BidRequest;

/**
 * Load bid request data
 * 
 * @author qwang028
 *
 */

public class LoadData {
	
	public List<BidRequest> readBidRequest(String filename) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String line = null;
		String sep = "\t";
		List<BidRequest> bidRequestList = new ArrayList<BidRequest>();
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
	
	public BidRequest setBidRequest(String tokens[]) {
		BidRequest bidRequest = new BidRequest();
		bidRequest.setBidId(tokens[0]);
		bidRequest.setTimestamp(tokens[1]);
		bidRequest.setIpinyouId(tokens[2]);
		bidRequest.setUserAgent(tokens[3]);
		bidRequest.setIpAddress(tokens[4]);
		bidRequest.setRegion(tokens[5]);
		bidRequest.setCity(tokens[6]);
		bidRequest.setAdExchange(tokens[7]);
		bidRequest.setDomain(tokens[8]);
		bidRequest.setUrl(tokens[9]);
		bidRequest.setAnonymousURLID(tokens[10]);
		bidRequest.setAdSlotID(tokens[11]);
		bidRequest.setAdSlotWidth(tokens[12]);
		bidRequest.setAdSlotHeight(tokens[13]);
		bidRequest.setAdSlotVisibility(tokens[14]);
		bidRequest.setAdSlotFormat(tokens[15]);
		bidRequest.setAdSlotFloorPrice(tokens[16]);
		bidRequest.setCreativeID(tokens[17]);
		bidRequest.setBiddingPrice(tokens[19]);
		return bidRequest;
	}
	
	public static void main(String[] args) {
		LoadData ld = new LoadData();
		try {
			ld.readBidRequest("data/bid.20130311.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
