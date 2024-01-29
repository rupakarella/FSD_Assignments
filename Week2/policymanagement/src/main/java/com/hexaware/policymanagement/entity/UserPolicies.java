package com.hexaware.policymanagement.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class UserPolicies {
	@Id
	private int userPolicyId;
	@ManyToOne
	@JoinColumn(name="userId")
	private Users user;
	@ManyToOne
	@JoinColumn(name="policyId")
	private Policy policy;
	private LocalDate registrationDate;
	private LocalDate startDate;
	private int durationInYears;
	
	@OneToMany(mappedBy="userPolicy",cascade=CascadeType.ALL)
	private List<PolicyPayments> policyPayments;
	
	public UserPolicies() {
		super();
	}
	public UserPolicies(int userPolicyId, Users user, Policy policy, LocalDate registrationDate, LocalDate startDate,
			int durationInYears) {
		super();
		this.userPolicyId = userPolicyId;
		this.user = user;
		this.policy= policy;
		this.registrationDate = registrationDate;
		this.startDate = startDate;
		this.durationInYears = durationInYears;
	}
	public int getUserPolicyId() {
		return userPolicyId;
	}
	public void setUserPolicyId(int userPolicyId) {
		this.userPolicyId = userPolicyId;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public int getDurationInYears() {
		return durationInYears;
	}
	public void setDurationInYears(int durationInYears) {
		this.durationInYears = durationInYears;
	}
	
}
