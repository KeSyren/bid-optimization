package edu.fiu.cs.kdrg.bidoptimization.data;
 
import java.io.Serializable;
 

/**
 * Bid log data structure of the Second Season 2013-06-06 ~ 2013-06-12
 * Bid log data structure of thes Third Season 2013-10-19 ~ 2013-10-28
 * 
 * @author qwang028
 *
 */
public class BidLogTT implements Serializable{
  
    private static final long serialVersionUID = -3012027079030559912L;
	
	private String bidId; 	              //	c0550000008e5a94ac18823d6f275121
	private String timestamp ;	          //	20130218134701883
	private String ipinyouId ;	          //	dF_5qwD1UDI
	private String userAgent;	          //    Mozilla/5.0 (Windows NT 5.1) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.84 Safari/535.11 SE 2.X MetaSr 1.0
	private String ipAddress ;	          //	119.163.222.*
	private int region;                   //	146
	private int city;                     //	147
	private int adExchange;               //	2 1AdX (Google DoubleClick AdX), 2TANX (Alibaba), and 3Tencent (Tencent)
	private String domain ;               //	e80f4ec7f5bfbc9ca416a8c01cd1a049
	private String url;                   //	hz55b000008e5a94ac18823d6f275121
	private String anonymousURLID ;       //	Null
	private String adSlotID;              //	mm_10982364_973726_9023493
	private int adSlotWidth;              //	300
	private int adSlotHeight;             //	250
	private int adSlotVisibility;         //	1
	private int adSlotFormat;             //	1
	private int adSlotFloorPrice;         //	(RMB/CPM) (*)	0
	private String creativeID;            //	f80f4ec7f5bfbc9ca416a8c01cd1a049
	private int biddingPrice;		      //    300
	
	public String getBidId() {
		return bidId;
	}
	public void setBidId(String bidId) {
		this.bidId = bidId;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getIpinyouId() {
		return ipinyouId;
	}
	public void setIpinyouId(String ipinyouId) {
		this.ipinyouId = ipinyouId;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public int getRegion() {
		return region;
	}
	public void setRegion(int region) {
		this.region = region;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getAdExchange() {
		return adExchange;
	}
	public void setAdExchange(int adExchange) {
		this.adExchange = adExchange;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAnonymousURLID() {
		return anonymousURLID;
	}
	public void setAnonymousURLID(String anonymousURLID) {
		this.anonymousURLID = anonymousURLID;
	}
	public String getAdSlotID() {
		return adSlotID;
	}
	public void setAdSlotID(String adSlotID) {
		this.adSlotID = adSlotID;
	}
	public int getAdSlotWidth() {
		return adSlotWidth;
	}
	public void setAdSlotWidth(int adSlotWidth) {
		this.adSlotWidth = adSlotWidth;
	}
	public int getAdSlotHeight() {
		return adSlotHeight;
	}
	public void setAdSlotHeight(int adSlotHeight) {
		this.adSlotHeight = adSlotHeight;
	}
	public int getAdSlotVisibility() {
		return adSlotVisibility;
	}
	public void setAdSlotVisibility(int adSlotVisibility) {
		this.adSlotVisibility = adSlotVisibility;
	}
	public int getAdSlotFormat() {
		return adSlotFormat;
	}
	public void setAdSlotFormat(int adSlotFormat) {
		this.adSlotFormat = adSlotFormat;
	}
	public int getAdSlotFloorPrice() {
		return adSlotFloorPrice;
	}
	public void setAdSlotFloorPrice(int adSlotFloorPrice) {
		this.adSlotFloorPrice = adSlotFloorPrice;
	}
	public String getCreativeID() {
		return creativeID;
	}
	public void setCreativeID(String creativeID) {
		this.creativeID = creativeID;
	}
	public int getBiddingPrice() {
		return biddingPrice;
	}
	public void setBiddingPrice(int biddingPrice) {
		this.biddingPrice = biddingPrice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}