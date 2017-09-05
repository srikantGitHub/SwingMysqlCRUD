package com.srikant.javaproject.bean;

import java.sql.Date;

public class PaitentDetail {
	private int patient_id;
	private int patient_no;
	private String patient_code;
	private String patient_father_name;
	private String patient_type;
	private String patient_status;
	private String patient_address;
	private String patient_mobile;
	private String patient_email;
	private String patient_uid;
	private Date addmission_date;
	private Date discharge_date;
	private String hospital_code;
	private String doctor_remarks;
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getPatient_no() {
		return patient_no;
	}
	public void setPatient_no(int patient_no) {
		this.patient_no = patient_no;
	}
	public String getPatient_code() {
		return patient_code;
	}
	public void setPatient_code(String patient_code) {
		this.patient_code = patient_code;
	}
	public String getPatient_father_name() {
		return patient_father_name;
	}
	public void setPatient_father_name(String patient_father_name) {
		this.patient_father_name = patient_father_name;
	}
	public String getPatient_type() {
		return patient_type;
	}
	public void setPatient_type(String patient_type) {
		this.patient_type = patient_type;
	}
	public String getPatient_status() {
		return patient_status;
	}
	public void setPatient_status(String patient_status) {
		this.patient_status = patient_status;
	}
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	public String getPatient_mobile() {
		return patient_mobile;
	}
	public void setPatient_mobile(String patient_mobile) {
		this.patient_mobile = patient_mobile;
	}
	public String getPatient_email() {
		return patient_email;
	}
	public void setPatient_email(String patient_email) {
		this.patient_email = patient_email;
	}
	public String getPatient_uid() {
		return patient_uid;
	}
	public void setPatient_uid(String patient_uid) {
		this.patient_uid = patient_uid;
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
	public String getHospital_code() {
		return hospital_code;
	}
	public void setHospital_code(String hospital_code) {
		this.hospital_code = hospital_code;
	}
	public String getDoctor_remarks() {
		return doctor_remarks;
	}
	public void setDoctor_remarks(String doctor_remarks) {
		this.doctor_remarks = doctor_remarks;
	}
	
	
	
}
