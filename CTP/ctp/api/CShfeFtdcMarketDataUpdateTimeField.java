/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcMarketDataUpdateTimeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcMarketDataUpdateTimeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcMarketDataUpdateTimeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcMarketDataUpdateTimeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcMarketDataUpdateTimeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcMarketDataUpdateTimeField_InstrumentID_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    ctpJNI.CShfeFtdcMarketDataUpdateTimeField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return ctpJNI.CShfeFtdcMarketDataUpdateTimeField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    ctpJNI.CShfeFtdcMarketDataUpdateTimeField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return ctpJNI.CShfeFtdcMarketDataUpdateTimeField_UpdateMillisec_get(swigCPtr, this);
  }

  public CShfeFtdcMarketDataUpdateTimeField() {
    this(ctpJNI.new_CShfeFtdcMarketDataUpdateTimeField(), true);
  }

}