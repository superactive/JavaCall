/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcForceClosePositionRuleField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcForceClosePositionRuleField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcForceClosePositionRuleField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcForceClosePositionRuleField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductInstrumentID(String value) {
    ctpJNI.CShfeFtdcForceClosePositionRuleField_ProductInstrumentID_set(swigCPtr, this, value);
  }

  public String getProductInstrumentID() {
    return ctpJNI.CShfeFtdcForceClosePositionRuleField_ProductInstrumentID_get(swigCPtr, this);
  }

  public void setFCPosiDirection(char value) {
    ctpJNI.CShfeFtdcForceClosePositionRuleField_FCPosiDirection_set(swigCPtr, this, value);
  }

  public char getFCPosiDirection() {
    return ctpJNI.CShfeFtdcForceClosePositionRuleField_FCPosiDirection_get(swigCPtr, this);
  }

  public void setFCHedgeFlag(char value) {
    ctpJNI.CShfeFtdcForceClosePositionRuleField_FCHedgeFlag_set(swigCPtr, this, value);
  }

  public char getFCHedgeFlag() {
    return ctpJNI.CShfeFtdcForceClosePositionRuleField_FCHedgeFlag_get(swigCPtr, this);
  }

  public void setFCCombPosiFlag(char value) {
    ctpJNI.CShfeFtdcForceClosePositionRuleField_FCCombPosiFlag_set(swigCPtr, this, value);
  }

  public char getFCCombPosiFlag() {
    return ctpJNI.CShfeFtdcForceClosePositionRuleField_FCCombPosiFlag_get(swigCPtr, this);
  }

  public void setFCHistoryPosiOrder(char value) {
    ctpJNI.CShfeFtdcForceClosePositionRuleField_FCHistoryPosiOrder_set(swigCPtr, this, value);
  }

  public char getFCHistoryPosiOrder() {
    return ctpJNI.CShfeFtdcForceClosePositionRuleField_FCHistoryPosiOrder_get(swigCPtr, this);
  }

  public void setFCPrice(char value) {
    ctpJNI.CShfeFtdcForceClosePositionRuleField_FCPrice_set(swigCPtr, this, value);
  }

  public char getFCPrice() {
    return ctpJNI.CShfeFtdcForceClosePositionRuleField_FCPrice_get(swigCPtr, this);
  }

  public void setPriceTick(int value) {
    ctpJNI.CShfeFtdcForceClosePositionRuleField_PriceTick_set(swigCPtr, this, value);
  }

  public int getPriceTick() {
    return ctpJNI.CShfeFtdcForceClosePositionRuleField_PriceTick_get(swigCPtr, this);
  }

  public void setFCRulePriority(String value) {
    ctpJNI.CShfeFtdcForceClosePositionRuleField_FCRulePriority_set(swigCPtr, this, value);
  }

  public String getFCRulePriority() {
    return ctpJNI.CShfeFtdcForceClosePositionRuleField_FCRulePriority_get(swigCPtr, this);
  }

  public CShfeFtdcForceClosePositionRuleField() {
    this(ctpJNI.new_CShfeFtdcForceClosePositionRuleField(), true);
  }

}