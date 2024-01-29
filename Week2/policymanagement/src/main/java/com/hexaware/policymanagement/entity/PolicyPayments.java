package com.hexaware.policymanagement.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class PolicyPayments {
	@Id
	private int paymentId;
	@ManyToOne
	@JoinColumn(name="userPolicyId")
	private UserPolicies userPolicy;
	private String transactionId;
	private LocalDate paymentDate;
	private String bank;
	private double amount;
	private double fine;
	public PolicyPayments() {
		super();
	}
	public PolicyPayments(int paymentId, UserPolicies userPolicy, String transactionId, LocalDate paymentDate, String bank,
			double amount, double fine) {
		super();
		this.paymentId = paymentId;
		this.userPolicy = userPolicy;
		this.transactionId = transactionId;
		this.paymentDate = paymentDate;
		this.bank = bank;
		this.amount = amount;
		this.fine = fine;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public UserPolicies getUserPolicy() {
		return userPolicy;
	}
	public void setUserPolicy(UserPolicies userPolicy) {
		this.userPolicy = userPolicy;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	
	
}
