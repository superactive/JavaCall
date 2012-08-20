/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcRspUserLoginField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcRspUserLoginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcRspUserLoginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcRspUserLoginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ctpJNI.CShfeFtdcRspUserLoginField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CShfeFtdcRspUserLoginField_TradingDay_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    ctpJNI.CShfeFtdcRspUserLoginField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return ctpJNI.CShfeFtdcRspUserLoginField_LoginTime_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcRspUserLoginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcRspUserLoginField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcRspUserLoginField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcRspUserLoginField_UserID_get(swigCPtr, this);
  }

  public void setSystemName(String value) {
    ctpJNI.CShfeFtdcRspUserLoginField_SystemName_set(swigCPtr, this, value);
  }

  public String getSystemName() {
    return ctpJNI.CShfeFtdcRspUserLoginField_SystemName_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CShfeFtdcRspUserLoginField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CShfeFtdcRspUserLoginField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CShfeFtdcRspUserLoginField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CShfeFtdcRspUserLoginField_SessionID_get(swigCPtr, this);
  }

  public void setMaxOrderRef(String value) {
    ctpJNI.CShfeFtdcRspUserLoginField_MaxOrderRef_set(swigCPtr, this, value);
  }

  public String getMaxOrderRef() {
    return ctpJNI.CShfeFtdcRspUserLoginField_MaxOrderRef_get(swigCPtr, this);
  }

  public void setSHFETime(String value) {
    ctpJNI.CShfeFtdcRspUserLoginField_SHFETime_set(swigCPtr, this, value);
  }

  public String getSHFETime() {
    return ctpJNI.CShfeFtdcRspUserLoginField_SHFETime_get(swigCPtr, this);
  }

  public void setDCETime(String value) {
    ctpJNI.CShfeFtdcRspUserLoginField_DCETime_set(swigCPtr, this, value);
  }

  public String getDCETime() {
    return ctpJNI.CShfeFtdcRspUserLoginField_DCETime_get(swigCPtr, this);
  }

  public void setCZCETime(String value) {
    ctpJNI.CShfeFtdcRspUserLoginField_CZCETime_set(swigCPtr, this, value);
  }

  public String getCZCETime() {
    return ctpJNI.CShfeFtdcRspUserLoginField_CZCETime_get(swigCPtr, this);
  }

  public void setFFEXTime(String value) {
    ctpJNI.CShfeFtdcRspUserLoginField_FFEXTime_set(swigCPtr, this, value);
  }

  public String getFFEXTime() {
    return ctpJNI.CShfeFtdcRspUserLoginField_FFEXTime_get(swigCPtr, this);
  }

  public CShfeFtdcRspUserLoginField() {
    this(ctpJNI.new_CShfeFtdcRspUserLoginField(), true);
  }

}