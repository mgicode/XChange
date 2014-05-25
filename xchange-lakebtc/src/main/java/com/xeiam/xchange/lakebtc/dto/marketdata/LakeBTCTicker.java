package com.xeiam.xchange.lakebtc.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * @author kpysniak
 */
public final class LakeBTCTicker {

  private final BigDecimal last;
  private final BigDecimal bid;
  private final BigDecimal ask;
  private final BigDecimal high;
  private final BigDecimal low;

  public LakeBTCTicker(@JsonProperty("last") BigDecimal last, @JsonProperty("bid") BigDecimal bid,
                       @JsonProperty("ask") BigDecimal ask, @JsonProperty("high")  BigDecimal high,
                       @JsonProperty("low") BigDecimal low) {
    this.last = last;
    this.bid = bid;
    this.ask = ask;
    this.high = high;
    this.low = low;
  }

  public BigDecimal getLast() {
    return last;
  }

  public BigDecimal getBid() {
    return bid;
  }

  public BigDecimal getAsk() {
    return ask;
  }

  public BigDecimal getHigh() {
    return high;
  }

  public BigDecimal getLow() {
    return low;
  }

  @Override
  public String toString() {
    return "LakeBTCTicker{" +
        "last=" + last +
        ", bid=" + bid +
        ", ask=" + ask +
        ", high=" + high +
        ", low=" + low +
        '}';
  }
}