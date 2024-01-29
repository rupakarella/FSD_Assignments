package com.hexaware.policymanagement.service;

import java.util.List;

import com.hexaware.policymanagement.entity.UserPolicies;
import com.hexaware.policymanagement.entity.Users;

public interface IUserPolicyService {
	public UserPolicies createUserPolicy(UserPolicies userPolicy);
	public UserPolicies updateUserPolicy(UserPolicies userPolicy);
	public void deleteUserPolicyByPolicyId(int policyId);
	public UserPolicies getUserPolicyByPolicyId(int policyId);
	public List<UserPolicies> getUserPolicyByUserId(Users userId);
	public List<UserPolicies> getAllUserPolicy();
}
