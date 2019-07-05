package com.example.domain;

public class transactionAccount {
private String id;
private String name;
private String description;
private String custodian;
private String source;
private String asset_manager;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
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
