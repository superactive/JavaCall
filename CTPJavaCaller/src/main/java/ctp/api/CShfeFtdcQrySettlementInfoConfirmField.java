/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcQrySettlementInfoConfirmField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcQrySettlementInfoConfirmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcQrySettlementInfoConfirmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcQrySettlementInfoConfirmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcQrySettlementInfoConfirmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcQrySettlementInfoConfirmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcQrySettlementInfoConfirmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcQrySettlementInfoConfirmField_InvestorID_get(swigCPtr, this);
  }

  public CShfeFtdcQrySettlementInfoConfirmField() {
    this(ctpJNI.new_CShfeFtdcQrySettlementInfoConfirmField(), true);
  }

}