/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcRspInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcRspInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcRspInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcRspInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setErrorID(int value) {
    ctpJNI.CShfeFtdcRspInfoField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpJNI.CShfeFtdcRspInfoField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpJNI.CShfeFtdcRspInfoField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpJNI.CShfeFtdcRspInfoField_ErrorMsg_get(swigCPtr, this);
  }

  public CShfeFtdcRspInfoField() {
    this(ctpJNI.new_CShfeFtdcRspInfoField(), true);
  }

}
