package com.hexaware.policymanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Policy {
	@Id
	private int policyId;
	private String policyName;
	private String company;
	private String policyType;
	private double initialDeposit;
	private int termsPerYear;
	private double termAmount;
	private double maturityAmount;
	private double interest;
	@OneToMany(mappedBy="policy",cascade=CascadeType.ALL)
	private List<UserPolicies> userPolicies;
	public Policy() {
		super();
	}
	public Policy(int policyId, String policyName, String company, String policyType, double initialDeposit,
			int termsPerYear, double termAmount, double maturityAmount, double interest,
			List<UserPolicies> userPolicies) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.company = company;
		this.policyType = policyType;
		this.initialDeposit = initialDeposit;
		this.termsPerYear = termsPerYear;
		this.termAmount = termAmount;
		this.maturityAmount = maturityAmount;
		this.interest = interest;
		this.userPolicies = userPolicies;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	public int getTermsPerYear() {
		return termsPerYear;
	}
	public void setTermsPerYear(int termsPerYear) {
		this.termsPerYear = termsPerYear;
	}
	public double getTermAmount() {
		return termAmount;
	}
	public void setTermAmount(double termAmount) {
		this.termAmount = termAmount;
	}
	public double getMaturityAmount() {
		return maturityAmount;
	}
	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public List<UserPolicies> getUserPolicies() {
		return userPolicies;
	}
	public void setUserPolicies(List<UserPolicies> userPolicies) {
		this.userPolicies = userPolicies;
	}
}