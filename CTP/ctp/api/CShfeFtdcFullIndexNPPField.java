/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcFullIndexNPPField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcFullIndexNPPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcFullIndexNPPField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcFullIndexNPPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcFullIndexNPPField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcFullIndexNPPField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcFullIndexNPPField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcFullIndexNPPField_InvestorID_get(swigCPtr, this);
  }

  public void setProductIDs(String value) {
    ctpJNI.CShfeFtdcFullIndexNPPField_ProductIDs_set(swigCPtr, this, value);
  }

  public String getProductIDs() {
    return ctpJNI.CShfeFtdcFullIndexNPPField_ProductIDs_get(swigCPtr, this);
  }

  public void setWarnLevel(double value) {
    ctpJNI.CShfeFtdcFullIndexNPPField_WarnLevel_set(swigCPtr, this, value);
  }

  public double getWarnLevel() {
    return ctpJNI.CShfeFtdcFullIndexNPPField_WarnLevel_get(swigCPtr, this);
  }

  public void setLongMargin(double value) {
    ctpJNI.CShfeFtdcFullIndexNPPField_LongMargin_set(swigCPtr, this, value);
  }

  public double getLongMargin() {
    return ctpJNI.CShfeFtdcFullIndexNPPField_LongMargin_get(swigCPtr, this);
  }

  public void setShortMargin(double value) {
    ctpJNI.CShfeFtdcFullIndexNPPField_ShortMargin_set(swigCPtr, this, value);
  }

  public double getShortMargin() {
    return ctpJNI.CShfeFtdcFullIndexNPPField_ShortMargin_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    ctpJNI.CShfeFtdcFullIndexNPPField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return ctpJNI.CShfeFtdcFullIndexNPPField_Balance_get(swigCPtr, this);
  }

  public void setRealWarnLevel(double value) {
    ctpJNI.CShfeFtdcFullIndexNPPField_RealWarnLevel_set(swigCPtr, this, value);
  }

  public double getRealWarnLevel() {
    return ctpJNI.CShfeFtdcFullIndexNPPField_RealWarnLevel_get(swigCPtr, this);
  }

  public CShfeFtdcFullIndexNPPField() {
    this(ctpJNI.new_CShfeFtdcFullIndexNPPField(), true);
  }

}