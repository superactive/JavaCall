/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcQrySyncDepositField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcQrySyncDepositField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcQrySyncDepositField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcQrySyncDepositField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcQrySyncDepositField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcQrySyncDepositField_BrokerID_get(swigCPtr, this);
  }

  public void setDepositSeqNo(String value) {
    ctpJNI.CShfeFtdcQrySyncDepositField_DepositSeqNo_set(swigCPtr, this, value);
  }

  public String getDepositSeqNo() {
    return ctpJNI.CShfeFtdcQrySyncDepositField_DepositSeqNo_get(swigCPtr, this);
  }

  public CShfeFtdcQrySyncDepositField() {
    this(ctpJNI.new_CShfeFtdcQrySyncDepositField(), true);
  }

}
