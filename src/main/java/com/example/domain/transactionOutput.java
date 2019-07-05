package com.example.domain;

import java.util.Date;

public class transactionOutput {
	private transactionSecurity security;
	private transactionAccount account;
private Date TradeDate;
private Date SettlementDate;
private int quantity;
private int NetAmount;
private int UnitPrice;
private String Currency;
private String TransactionType;
private String custodian;
private String source;
private String asset_manager;
private String id;

public transactionOutput() {
	security=new transactionSecurity();
	account= new transactionAccount();
}

}
