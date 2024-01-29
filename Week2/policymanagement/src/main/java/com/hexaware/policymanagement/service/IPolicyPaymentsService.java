package com.hexaware.policymanagement.service;

import java.util.List;

import com.hexaware.policymanagement.entity.PolicyPayments;

public interface IPolicyPaymentsService {
	public PolicyPayments createPolicyPayment(PolicyPayments policyPayment);
	public PolicyPayments updatePolicyPayment(PolicyPayments policyPayment);
	public void deletePolicyPaymentByTransactionId(String transactionId);
	public PolicyPayments getPolicyPaymentByTransactionId(String transactionId);
    public PolicyPayments getPolicyPaymentByPolicyId(PolicyPayments policyId);
	public List<PolicyPayments> getAllPolicyPayment();
}
