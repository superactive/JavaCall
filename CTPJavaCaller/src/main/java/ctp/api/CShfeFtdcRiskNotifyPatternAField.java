/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcRiskNotifyPatternAField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcRiskNotifyPatternAField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcRiskNotifyPatternAField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcRiskNotifyPatternAField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcRiskNotifyPatternAField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcRiskNotifyPatternAField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CShfeFtdcRiskNotifyPatternAField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CShfeFtdcRiskNotifyPatternAField_UserID_get(swigCPtr, this);
  }

  public void setNotifyClass(char value) {
    ctpJNI.CShfeFtdcRiskNotifyPatternAField_NotifyClass_set(swigCPtr, this, value);
  }

  public char getNotifyClass() {
    return ctpJNI.CShfeFtdcRiskNotifyPatternAField_NotifyClass_get(swigCPtr, this);
  }

  public void setNotifyMethod(char value) {
    ctpJNI.CShfeFtdcRiskNotifyPatternAField_NotifyMethod_set(swigCPtr, this, value);
  }

  public char getNotifyMethod() {
    return ctpJNI.CShfeFtdcRiskNotifyPatternAField_NotifyMethod_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ctpJNI.CShfeFtdcRiskNotifyPatternAField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ctpJNI.CShfeFtdcRiskNotifyPatternAField_IsActive_get(swigCPtr, this);
  }

  public void setPattern(String value) {
    ctpJNI.CShfeFtdcRiskNotifyPatternAField_Pattern_set(swigCPtr, this, value);
  }

  public String getPattern() {
    return ctpJNI.CShfeFtdcRiskNotifyPatternAField_Pattern_get(swigCPtr, this);
  }

  public void setReserve(String value) {
    ctpJNI.CShfeFtdcRiskNotifyPatternAField_Reserve_set(swigCPtr, this, value);
  }

  public String getReserve() {
    return ctpJNI.CShfeFtdcRiskNotifyPatternAField_Reserve_get(swigCPtr, this);
  }

  public CShfeFtdcRiskNotifyPatternAField() {
    this(ctpJNI.new_CShfeFtdcRiskNotifyPatternAField(), true);
  }

}
