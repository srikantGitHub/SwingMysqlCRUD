package com.srikant.javaproject.DAO;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.swing.JOptionPane;
import com.srikant.javaproject.bean.PaitentDetail;
import com.sun.rowset.JdbcRowSetImpl;

public class PaitentBean {
   static String JDBC_DRIVER ="";
   static  String DB_URL = "";
   static  String DB_USER = "";
   static  String DB_PASS = "";
   private JdbcRowSet rowSet = null;
   public PaitentBean() {
      try {
          Class.forName(JDBC_DRIVER);
          rowSet = new JdbcRowSetImpl();
          rowSet.setUrl(DB_URL);
          rowSet.setUsername(DB_USER);
          rowSet.setPassword(DB_PASS);
          rowSet.setCommand("SELECT * FROM patient_master");
          rowSet.execute();
      }

      catch (Exception e){
    	  e.printStackTrace();
      }
   }
   public PaitentDetail create(PaitentDetail p) {
      try {
         rowSet.moveToInsertRow();
         rowSet.updateInt("patient_id", p.getPatient_id());
         rowSet.updateInt("patient_no", p.getPatient_no());
         rowSet.updateString("patient_code",p.getPatient_code());
         rowSet.updateString("patient_father_name", p.getPatient_father_name());
         rowSet.updateString("patient_type", p.getPatient_type());
         rowSet.updateString("patient_status", p.getPatient_status());
         rowSet.updateString("patient_address", p.getPatient_address());
         rowSet.updateString("patient_mobile",p.getPatient_mobile());
         rowSet.updateString("patient_email",p.getPatient_email());
         rowSet.updateString("patient_uid", p.getPatient_uid());
         rowSet.updateDate("addmission_date", p.getAddmission_date());
         rowSet.updateDate("discharge_date", p.getDischarge_date());
         rowSet.updateString("hospital_code", p.getHospital_code());
         rowSet.updateString("doctor_remarks",p.getDoctor_remarks());
         rowSet.insertRow();
         rowSet.moveToCurrentRow();
      } catch (SQLException ex) {
         try {
            rowSet.rollback();
            p = null;
         } catch (SQLException e) {

         }
         ex.printStackTrace();
      }
      return p;
   }

   public PaitentDetail update(PaitentDetail p) {
      try {
    	  rowSet.updateInt("patient_id", p.getPatient_id());
          rowSet.updateInt("patient_no", p.getPatient_no());
          rowSet.updateString("patient_code",p.getPatient_code());
          rowSet.updateString("patient_father_name", p.getPatient_father_name());
          rowSet.updateString("patient_type", p.getPatient_type());
          rowSet.updateString("patient_status", p.getPatient_status());
          rowSet.updateString("patient_address", p.getPatient_address());
          rowSet.updateString("patient_mobile",p.getPatient_mobile());
          rowSet.updateString("patient_email",p.getPatient_email());
          rowSet.updateString("patient_uid", p.getPatient_uid());
          rowSet.updateDate("addmission_date", p.getAddmission_date());
          rowSet.updateDate("discharge_date", p.getDischarge_date());
          rowSet.updateString("hospital_code", p.getHospital_code());
          rowSet.updateString("doctor_remarks",p.getDoctor_remarks());
         rowSet.updateRow();
         rowSet.moveToCurrentRow();
      } catch (SQLException ex) {
         try {
            rowSet.rollback();
         } catch (SQLException e) {

         }
         ex.printStackTrace();
      }
      return p;
   }

   public void delete() {
      try {
         rowSet.moveToCurrentRow();
         rowSet.deleteRow();
      } catch (SQLException ex) {
         try {
            rowSet.rollback();
         } catch (SQLException e) { }
         ex.printStackTrace();
      }

   }

   public PaitentDetail moveFirst() {
	   PaitentDetail p = new PaitentDetail();
      try {
         rowSet.first();
        p.setPatient_id(rowSet.getInt("patient_id"));
        p.setPatient_no(rowSet.getInt("patient_no"));
        p.setPatient_code(rowSet.getString("patient_code"));
        p.setPatient_father_name(rowSet.getString("patient_father_name"));
        p.setPatient_type(rowSet.getString("patient_type"));
        p.setPatient_status(rowSet.getString("patient_status"));
        p.setPatient_address(rowSet.getString("patient_address"));
        p.setPatient_mobile(rowSet.getString("patient_mobile"));
        p.setPatient_email(rowSet.getString("patient_email"));
        p.setPatient_uid(rowSet.getString("patient_uid"));
        p.setAddmission_date(rowSet.getDate("addmission_date"));
        p.setDischarge_date(rowSet.getDate("discharge_date"));
        p.setHospital_code(rowSet.getString("hospital_code"));
        p.setDoctor_remarks(rowSet.getString("doctor_remarks"));
      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return p;
   }

   public PaitentDetail moveLast() {
	   PaitentDetail p = new PaitentDetail();
      try {
         rowSet.last();
         p.setPatient_id(rowSet.getInt("patient_id"));
         p.setPatient_no(rowSet.getInt("patient_no"));
         p.setPatient_code(rowSet.getString("patient_code"));
         p.setPatient_father_name(rowSet.getString("patient_father_name"));
         p.setPatient_type(rowSet.getString("patient_type"));
         p.setPatient_status(rowSet.getString("patient_status"));
         p.setPatient_address(rowSet.getString("patient_address"));
         p.setPatient_mobile(rowSet.getString("patient_mobile"));
         p.setPatient_email(rowSet.getString("patient_email"));
         p.setPatient_uid(rowSet.getString("patient_uid"));
         p.setAddmission_date(rowSet.getDate("addmission_date"));
         p.setDischarge_date(rowSet.getDate("discharge_date"));
         p.setHospital_code(rowSet.getString("hospital_code"));
         p.setDoctor_remarks(rowSet.getString("doctor_remarks"));

      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return p;
   }

   public PaitentDetail moveNext() {
	   PaitentDetail p = new PaitentDetail();
      try {
         if (rowSet.next() == false)
            rowSet.previous();
         p.setPatient_id(rowSet.getInt("patient_id"));
         p.setPatient_no(rowSet.getInt("patient_no"));
         p.setPatient_code(rowSet.getString("patient_code"));
         p.setPatient_father_name(rowSet.getString("patient_father_name"));
         p.setPatient_type(rowSet.getString("patient_type"));
         p.setPatient_status(rowSet.getString("patient_status"));
         p.setPatient_address(rowSet.getString("patient_address"));
         p.setPatient_mobile(rowSet.getString("patient_mobile"));
         p.setPatient_email(rowSet.getString("patient_email"));
         p.setPatient_uid(rowSet.getString("patient_uid"));
         p.setAddmission_date(rowSet.getDate("addmission_date"));
         p.setDischarge_date(rowSet.getDate("discharge_date"));
         p.setHospital_code(rowSet.getString("hospital_code"));
         p.setDoctor_remarks(rowSet.getString("doctor_remarks"));

      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return p;
   }

   public PaitentDetail movePrevious() {
	   PaitentDetail p = new PaitentDetail();
      try {
         if (rowSet.previous() == false)
            rowSet.next();
         p.setPatient_id(rowSet.getInt("patient_id"));
         p.setPatient_no(rowSet.getInt("patient_no"));
         p.setPatient_code(rowSet.getString("patient_code"));
         p.setPatient_father_name(rowSet.getString("patient_father_name"));
         p.setPatient_type(rowSet.getString("patient_type"));
         p.setPatient_status(rowSet.getString("patient_status"));
         p.setPatient_address(rowSet.getString("patient_address"));
         p.setPatient_mobile(rowSet.getString("patient_mobile"));
         p.setPatient_email(rowSet.getString("patient_email"));
         p.setPatient_uid(rowSet.getString("patient_uid"));
         p.setAddmission_date(rowSet.getDate("addmission_date"));
         p.setDischarge_date(rowSet.getDate("discharge_date"));
         p.setHospital_code(rowSet.getString("hospital_code"));
         p.setDoctor_remarks(rowSet.getString("doctor_remarks"));
      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return p;
   }

   public PaitentDetail getCurrent() {
	   PaitentDetail p = new PaitentDetail();
      try {
         rowSet.moveToCurrentRow();
         p.setPatient_id(rowSet.getInt("patient_id"));
         p.setPatient_no(rowSet.getInt("patient_no"));
         p.setPatient_code(rowSet.getString("patient_code"));
         p.setPatient_father_name(rowSet.getString("patient_father_name"));
         p.setPatient_type(rowSet.getString("patient_type"));
         p.setPatient_status(rowSet.getString("patient_status"));
         p.setPatient_address(rowSet.getString("patient_address"));
         p.setPatient_mobile(rowSet.getString("patient_mobile"));
         p.setPatient_email(rowSet.getString("patient_email"));
         p.setPatient_uid(rowSet.getString("patient_uid"));
         p.setAddmission_date(rowSet.getDate("addmission_date"));
         p.setDischarge_date(rowSet.getDate("discharge_date"));
         p.setHospital_code(rowSet.getString("hospital_code"));
         p.setDoctor_remarks(rowSet.getString("doctor_remarks"));
      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return p;
   }
   public static void loadPorperties(){
	   try{		  
	    Properties defaultProps = new Properties();
	    InputStream inputStream =PaitentBean.class.getResourceAsStream("config.properties");  
		defaultProps.load(inputStream);
		JDBC_DRIVER=defaultProps.getProperty("JDBC_DRIVER");
		DB_URL=defaultProps.getProperty("DB_URL");
		DB_USER=defaultProps.getProperty("DB_USER");
		DB_PASS=defaultProps.getProperty("DB_PASS");
		inputStream.close(); 
	   }catch(Exception e){
		   JOptionPane.showMessageDialog(null,"Error:"+e);
		  e.printStackTrace(); 
	   }
   }
}