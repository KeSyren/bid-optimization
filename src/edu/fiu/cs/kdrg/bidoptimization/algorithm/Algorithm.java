package edu.fiu.cs.kdrg.bidoptimization.algorithm;

import edu.fiu.cs.kdrg.bidoptimization.data.BidLogOne;

public interface Algorithm {
  
   	 void init() throws Exception ;
 
	 int getBidPrice(BidLogOne bidRequest); 
 
}