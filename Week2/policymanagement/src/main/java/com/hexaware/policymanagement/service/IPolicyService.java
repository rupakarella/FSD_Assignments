package com.hexaware.policymanagement.service;

import java.util.List;

import com.hexaware.policymanagement.entity.Policy;

public interface IPolicyService {
	public Policy createPolicy(Policy policy);
	public Policy updatePolicy(Policy policy);
	public void deleteByPolicyId(int policyId);
    public List<Policy> getPolicyByPolicyType(String policyType);
    public List<Policy> getPolicyByCompany(String company);
    public List<Policy> getByAmountLessThan(double amount);
    public List<Policy> getByAmountGreaterThan(double amount);
	public List<Policy> getAllPolicy();
}
