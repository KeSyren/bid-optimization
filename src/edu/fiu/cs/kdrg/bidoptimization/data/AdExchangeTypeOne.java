package edu.fiu.cs.kdrg.bidoptimization.data;

/**
 * AdX (Google DoubleClick AdX), TANX (Alibaba), and Tencent (Tencent)
 * @author qwang028
 *
 */

public enum AdExchangeTypeOne {
	AdX(1), TANX(2), Tencent(3);

	private int value;

	private AdExchangeTypeOne(int value) {
		this.value = value;
	}
}
