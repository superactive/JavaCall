/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcVaryMarketDataField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcVaryMarketDataField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcVaryMarketDataField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcVaryMarketDataField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpJNI.CShfeFtdcVaryMarketDataField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CShfeFtdcVaryMarketDataField_InstrumentID_get(swigCPtr, this);
  }

  public void setLastPrice(double value) {
    ctpJNI.CShfeFtdcVaryMarketDataField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return ctpJNI.CShfeFtdcVaryMarketDataField_LastPrice_get(swigCPtr, this);
  }

  public CShfeFtdcVaryMarketDataField() {
    this(ctpJNI.new_CShfeFtdcVaryMarketDataField(), true);
  }

}
