package com.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

// @Entity
public class DeviceEntity {
	private String esn;
	private String address;
	private String type;
	private String adapterId;
	
	public DeviceEntity() {}
	
	public DeviceEntity(String esn, String address, String type, String adapterId) {
		this.esn = esn;
		this.address = address;
		this.type = type;
		this.adapterId = adapterId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEsn() {
		return esn;
	}

	public void setEsn(String esn) {
		this.esn = esn;
	}
	
	@JsonIgnore
	public String getAdapterId() {
		return adapterId;
	}

	public void setAdapterId(String adapterId) {
		this.adapterId = adapterId;
	}
}
