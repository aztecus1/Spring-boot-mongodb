package com.example.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "transactionDelta")
public class transactionDelta {
	
	private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private transactionInput input;
    private transactionOutput output;
    private Date date;
    private int delta;
    private String custodian;
    private String asset_manager;
    private String recon_break;
    public transactionDelta()
    {
    	input=new transactionInput();
    	output=new transactionOutput();
    }
	public transactionInput getInput() {
		return input;
	}
	public void setInput(transactionInput input) {
		this.input = input;
	}
	public transactionOutput getOutput() {
		return output;
	}
	public void setOutput(transactionOutput output) {
		this.output = output;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDelta() {
		return delta;
	}
	public void setDelta(int delta) {
		this.delta = delta;
	}
	public String getCustodian() {
		return custodian;
	}
	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}
	public String getAsset_manager() {
		return asset_manager;
	}
	public void setAsset_manager(String asset_manager) {
		this.asset_manager = asset_manager;
	}
	public String getRecon_break() {
		return recon_break;
	}
	public void setRecon_break(String recon_break) {
		this.recon_break = recon_break;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getId() {
		return id;
	}
    
    

	
}
