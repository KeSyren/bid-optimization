package edu.fiu.cs.kdrg.bidoptimization.algorithm;

import edu.fiu.cs.kdrg.bidoptimization.data.BidLog;

public interface Algorithm {
  
   	 void init() throws Exception ;
 
	 int getBidPrice(BidLog bidRequest); 
 
}