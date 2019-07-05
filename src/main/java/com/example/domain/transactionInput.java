package com.example.domain;

import java.util.Date;

public class transactionInput {
private transactionSecurity security;
private transactionAccount account;
private Date TradeDate;
private Date SettlementDate;
private int quantity;
private int NetAmount;
private int UnitPrice;
private String Currency;
private String transactionType;
private String custodian;
private String source;
private String asset_manager;
private String id;
public transactionInput()
{
	security=new transactionSecurity();
	account= new transactionAccount();
}
public transactionSecurity getSecurity() {
	return security;
}
public void setSecurity(transactionSecurity security) {
	this.security = security;
}
public transactionAccount getAccount() {
	return account;
}
public void setAccount(transactionAccount account) {
	this.account = account;
}
public Date getTradeDate() {
	return TradeDate;
}
public void setTradeDate(Date tradeDate) {
	TradeDate = tradeDate;
}
public Date getSettlementDate() {
	return SettlementDate;
}
public void setSettlementDate(Date settlementDate) {
	SettlementDate = settlementDate;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getNetAmount() {
	return NetAmount;
}
public void setNetAmount(int netAmount) {
	NetAmount = netAmount;
}
public int getUnitPrice() {
	return UnitPrice;
}
public void setUnitPrice(int unitPrice) {
	UnitPrice = unitPrice;
}
public String getCurrency() {
	return Currency;
}
public void setCurrency(String currency) {
	Currency = currency;
}
public String getTransactionType() {
	return transactionType;
}
public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}
public String getCustodian() {
	return custodian;
}
public void setCustodian(String custodian) {
	this.custodian = custodian;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getAsset_manager() {
	return asset_manager;
}
public void setAsset_manager(String asset_manager) {
	this.asset_manager = asset_manager;
}
public String getId() {
	return id;
}




}
