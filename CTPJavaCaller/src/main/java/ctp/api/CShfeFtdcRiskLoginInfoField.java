/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcRiskLoginInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcRiskLoginInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcRiskLoginInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcRiskLoginInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcRiskLoginInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcRiskLoginInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcRiskLoginInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcRiskLoginInfoField_UserID_get(swigCPtr, this);
  }

  public void setLocalSessionID(int value) {
    ctpJNI.CShfeFtdcRiskLoginInfoField_LocalSessionID_set(swigCPtr, this, value);
  }

  public int getLocalSessionID() {
    return ctpJNI.CShfeFtdcRiskLoginInfoField_LocalSessionID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CShfeFtdcRiskLoginInfoField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CShfeFtdcRiskLoginInfoField_SessionID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CShfeFtdcRiskLoginInfoField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CShfeFtdcRiskLoginInfoField_FrontID_get(swigCPtr, this);
  }

  public CShfeFtdcRiskLoginInfoField() {
    this(ctpJNI.new_CShfeFtdcRiskLoginInfoField(), true);
  }

}
