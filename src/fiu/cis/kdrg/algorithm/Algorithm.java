package fiu.cis.kdrg.algorithm;

import fiu.cis.kdrf.core.BidRequest;

public interface Algorithm {
  
   	 void init() throws Exception ;
 
	 int getBidPrice(BidRequest bidRequest); 
 
}