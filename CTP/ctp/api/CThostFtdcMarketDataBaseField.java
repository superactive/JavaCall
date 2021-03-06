/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcMarketDataBaseField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcMarketDataBaseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcMarketDataBaseField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcMarketDataBaseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcMarketDataBaseField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcMarketDataBaseField_TradingDay_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    ctpJNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return ctpJNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setPreClosePrice(double value) {
    ctpJNI.CThostFtdcMarketDataBaseField_PreClosePrice_set(swigCPtr, this, value);
  }

  public double getPreClosePrice() {
    return ctpJNI.CThostFtdcMarketDataBaseField_PreClosePrice_get(swigCPtr, this);
  }

  public void setPreOpenInterest(double value) {
    ctpJNI.CThostFtdcMarketDataBaseField_PreOpenInterest_set(swigCPtr, this, value);
  }

  public double getPreOpenInterest() {
    return ctpJNI.CThostFtdcMarketDataBaseField_PreOpenInterest_get(swigCPtr, this);
  }

  public void setPreDelta(double value) {
    ctpJNI.CThostFtdcMarketDataBaseField_PreDelta_set(swigCPtr, this, value);
  }

  public double getPreDelta() {
    return ctpJNI.CThostFtdcMarketDataBaseField_PreDelta_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBaseField() {
    this(ctpJNI.new_CThostFtdcMarketDataBaseField(), true);
  }

}
