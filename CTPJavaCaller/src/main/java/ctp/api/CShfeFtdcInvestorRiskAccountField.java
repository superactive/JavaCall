/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.api;

public class CShfeFtdcInvestorRiskAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CShfeFtdcInvestorRiskAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CShfeFtdcInvestorRiskAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CShfeFtdcInvestorRiskAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_InvestorID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPreMortgage(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_PreMortgage_set(swigCPtr, this, value);
  }

  public double getPreMortgage() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_PreMortgage_get(swigCPtr, this);
  }

  public void setPreCredit(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_PreCredit_set(swigCPtr, this, value);
  }

  public double getPreCredit() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_PreCredit_get(swigCPtr, this);
  }

  public void setPreDeposit(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_PreDeposit_set(swigCPtr, this, value);
  }

  public double getPreDeposit() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_PreDeposit_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_PreBalance_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_PreMargin_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_Withdraw_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_CurrMargin_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_PositionProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_Balance_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_Available_get(swigCPtr, this);
  }

  public void setMortgage(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_Mortgage_set(swigCPtr, this, value);
  }

  public double getMortgage() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_Mortgage_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_Reserve_get(swigCPtr, this);
  }

  public void setWithdrawQuota(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_WithdrawQuota_set(swigCPtr, this, value);
  }

  public double getWithdrawQuota() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_WithdrawQuota_get(swigCPtr, this);
  }

  public void setCredit(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_Credit_set(swigCPtr, this, value);
  }

  public double getCredit() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_Credit_get(swigCPtr, this);
  }

  public void setPreExchMargin(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_PreExchMargin_set(swigCPtr, this, value);
  }

  public double getPreExchMargin() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_PreExchMargin_get(swigCPtr, this);
  }

  public void setForceCloseStat(int value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_ForceCloseStat_set(swigCPtr, this, value);
  }

  public int getForceCloseStat() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_ForceCloseStat_get(swigCPtr, this);
  }

  public void setDeliveryMargin(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_DeliveryMargin_set(swigCPtr, this, value);
  }

  public double getDeliveryMargin() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_DeliveryMargin_get(swigCPtr, this);
  }

  public void setExchangeDeliveryMargin(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_ExchangeDeliveryMargin_set(swigCPtr, this, value);
  }

  public double getExchangeDeliveryMargin() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_ExchangeDeliveryMargin_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    ctpJNI.CShfeFtdcInvestorRiskAccountField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return ctpJNI.CShfeFtdcInvestorRiskAccountField_FrozenCommission_get(swigCPtr, this);
  }

  public CShfeFtdcInvestorRiskAccountField() {
    this(ctpJNI.new_CShfeFtdcInvestorRiskAccountField(), true);
  }

}
