/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CThostFtdcTradingNoticeInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CThostFtdcTradingNoticeInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CThostFtdcTradingNoticeInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcTradingNoticeInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcTradingNoticeInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcTradingNoticeInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcTradingNoticeInfoField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcTradingNoticeInfoField_InvestorID_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    ctpJNI.CThostFtdcTradingNoticeInfoField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return ctpJNI.CThostFtdcTradingNoticeInfoField_SendTime_get(swigCPtr, this);
  }

  public void setFieldContent(String value) {
    ctpJNI.CThostFtdcTradingNoticeInfoField_FieldContent_set(swigCPtr, this, value);
  }

  public String getFieldContent() {
    return ctpJNI.CThostFtdcTradingNoticeInfoField_FieldContent_get(swigCPtr, this);
  }

  public void setSequenceSeries(short value) {
    ctpJNI.CThostFtdcTradingNoticeInfoField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return ctpJNI.CThostFtdcTradingNoticeInfoField_SequenceSeries_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CThostFtdcTradingNoticeInfoField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CThostFtdcTradingNoticeInfoField_SequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcTradingNoticeInfoField() {
    this(ctpJNI.new_CThostFtdcTradingNoticeInfoField(), true);
  }

}
