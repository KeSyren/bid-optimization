package edu.fiu.cs.kdrg.bidoptimization.data;
 
import java.io.Serializable;
 

/**
 * Bid log data structure of the Second Season 2013-06-06 ~ 2013-06-12
 * Bid log data structure of thes Third Season 2013-10-19 ~ 2013-10-28
 * 
 * @author qwang028
 *
 */
public class BidLog implements Serializable{
	
	private String bidId; 	              //	0 c0550000008e5a94ac18823d6f275121
	private String timestamp ;	          //	1 20130218134701883
	private String ipinyouId ;	          //	2 dF_5qwD1UDI
	private String userAgent;	          //    3 Mozilla/5.0 (Windows NT 5.1) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.84 Safari/535.11 SE 2.X MetaSr 1.0
	private String ipAddress ;	          //	4 119.163.222.*
	private int region;                   //	5 146
	private int city;                     //	6 147
	private int adExchange;               //	7 2 AdX (Google DoubleClick AdX), TANX (Alibaba), Baidu(Baidu),Youku(Youku),Tencent (Tencent),Amx(Google Mobile).
	private String domain ;               //	8 e80f4ec7f5bfbc9ca416a8c01cd1a049
	private String url;                   //	9  hz55b000008e5a94ac18823d6f275121
	private String anonymousURLID ;       //	10  Null
	private String adSlotID;              //	11  mm_10982364_973726_9023493
	private int adSlotWidth;              //	12 300
	private int adSlotHeight;             //	13 250
	private int adSlotVisibility;         //	14 1
	private int adSlotFormat;             //	15 1
	private int adSlotFloorPrice;         //	16 (RMB/CPM) (*)	0
	private String creativeID;            //	17 f80f4ec7f5bfbc9ca416a8c01cd1a049
	private int biddingPrice;		      //    18 300
	private int advertiserID;             //    19 2345
	private String userTags;               //   20 null
	
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
	public int getAdvertiserID() {
		return advertiserID;
	}
	public void setAdvertiserID(int advertiserID) {
		this.advertiserID = advertiserID;
	}
	public String getUserTags() {
		return userTags;
	}
	public void setUserTags(String userTags) {
		this.userTags = userTags;
	}
}