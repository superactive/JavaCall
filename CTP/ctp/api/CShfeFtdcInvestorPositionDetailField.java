/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcInvestorPositionDetailField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcInvestorPositionDetailField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcInvestorPositionDetailField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcInvestorPositionDetailField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_HedgeFlag_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_Direction_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_OpenDate_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_TradeID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_Volume_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_OpenPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_SettlementID_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_TradeType_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_ExchangeID_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setPositionProfitByDate(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_PositionProfitByDate_set(swigCPtr, this, value);
  }

  public double getPositionProfitByDate() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_PositionProfitByDate_get(swigCPtr, this);
  }

  public void setPositionProfitByTrade(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_PositionProfitByTrade_set(swigCPtr, this, value);
  }

  public double getPositionProfitByTrade() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_PositionProfitByTrade_get(swigCPtr, this);
  }

  public void setMargin(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_Margin_set(swigCPtr, this, value);
  }

  public double getMargin() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_Margin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_ExchMargin_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setLastSettlementPrice(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_LastSettlementPrice_set(swigCPtr, this, value);
  }

  public double getLastSettlementPrice() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_LastSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_SettlementPrice_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_CloseVolume_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    ctpJNI.CShfeFtdcInvestorPositionDetailField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return ctpJNI.CShfeFtdcInvestorPositionDetailField_CloseAmount_get(swigCPtr, this);
  }

  public CShfeFtdcInvestorPositionDetailField() {
    this(ctpJNI.new_CShfeFtdcInvestorPositionDetailField(), true);
  }

}