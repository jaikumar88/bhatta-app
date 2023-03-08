package com.ntss.bricks.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String partyName;
    private String brickType;
    private String receiptNo;
    private String mobile;
    private int quantity;
    private BigDecimal rate;
    private BigDecimal payment;
    private BigDecimal paymaneDue;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the partyName
	 */
	public String getPartyName() {
		return partyName;
	}
	/**
	 * @param partyName the partyName to set
	 */
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	/**
	 * @return the brickType
	 */
	public String getBrickType() {
		return brickType;
	}
	/**
	 * @param brickType the brickType to set
	 */
	public void setBrickType(String brickType) {
		this.brickType = brickType;
	}
	/**
	 * @return the receiptNo
	 */
	public String getReceiptNo() {
		return receiptNo;
	}
	/**
	 * @param receiptNo the receiptNo to set
	 */
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the rate
	 */
	public BigDecimal getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	/**
	 * @return the payment
	 */
	public BigDecimal getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}
	/**
	 * @return the paymaneDue
	 */
	public BigDecimal getPaymaneDue() {
		return paymaneDue;
	}
	/**
	 * @param paymaneDue the paymaneDue to set
	 */
	public void setPaymaneDue(BigDecimal paymaneDue) {
		this.paymaneDue = paymaneDue;
	}
    
    
    
}
