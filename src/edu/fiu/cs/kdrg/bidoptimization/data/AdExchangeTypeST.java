package edu.fiu.cs.kdrg.bidoptimization.data;

/**
 * The Second and Third AdExchange Type
 * AdX (Google DoubleClick AdX), TANX (Alibaba), Baidu(Baidu),Youku(Youku),Tencent (Tencent),Amx(Google Mobile).
 * @author qwang028
 *
 */

public enum AdExchangeTypeST {
	AdX(1), TANX(2), Baidu(3), Youku(4), Tencent(5), Amx(6);

	private int value;

	private AdExchangeTypeST(int value) {
		this.value = value;
	}
}
