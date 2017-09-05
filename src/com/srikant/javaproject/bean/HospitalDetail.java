package com.srikant.javaproject.bean;

import java.sql.Date;

public class HospitalDetail {
	private int hospital_id;
	private int state_id;  
	private int district_id;
	private int block_id; 
	private int village_id;
	private int user_id; 
	private int hospital_code;
	private String hospital_name;
	private String hospital_level;
	private String officer_name;
	private String officer_email;
	private int officer_uid;
	private Date addmission_date;
	private Date discharge_date;
	private String hospital_address;
	private int patient_max;
	public int getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}
	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public int getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}
	public int getBlock_id() {
		return block_id;
	}
	public void setBlock_id(int block_id) {
		this.block_id = block_id;
	}
	public int getVillage_id() {
		return village_id;
	}
	public void setVillage_id(int village_id) {
		this.village_id = village_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getHospital_code() {
		return hospital_code;
	}
	public void setHospital_code(int hospital_code) {
		this.hospital_code = hospital_code;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public String getHospital_level() {
		return hospital_level;
	}
	public void setHospital_level(String hospital_level) {
		this.hospital_level = hospital_level;
	}
	public String getOfficer_name() {
		return officer_name;
	}
	public void setOfficer_name(String officer_name) {
		this.officer_name = officer_name;
	}
	public String getOfficer_email() {
		return officer_email;
	}
	public void setOfficer_email(String officer_email) {
		this.officer_email = officer_email;
	}
	public int getOfficer_uid() {
		return officer_uid;
	}
	public void setOfficer_uid(int officer_uid) {
		this.officer_uid = officer_uid;
	}
	public Date getAddmission_date() {
		return addmission_date;
	}
	public void setAddmission_date(Date addmission_date) {
		this.addmission_date = addmission_date;
	}
	public Date getDischarge_date() {
		return discharge_date;
	}
	public void setDischarge_date(Date discharge_date) {
		this.discharge_date = discharge_date;
	}
	public String getHospital_address() {
		return hospital_address;
	}
	public void setHospital_address(String hospital_address) {
		this.hospital_address = hospital_address;
	}
	public int getPatient_max() {
		return patient_max;
	}
	public void setPatient_max(int patient_max) {
		this.patient_max = patient_max;
	}
	
}