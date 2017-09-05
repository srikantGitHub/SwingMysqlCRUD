package com.srikant.javaproject.DAO;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.rowset.JdbcRowSet;
import com.srikant.javaproject.bean.HospitalDetail;
import com.sun.rowset.JdbcRowSetImpl;

public class HospitalBean {
   static String JDBC_DRIVER ="";
   static  String DB_URL = "";
   static  String DB_USER = "";
   static  String DB_PASS = "";
   private JdbcRowSet rowSet = null;
   public HospitalBean() {
      try {
          Class.forName(JDBC_DRIVER);
          rowSet = new JdbcRowSetImpl();
          rowSet.setUrl(DB_URL);
          rowSet.setUsername(DB_USER);
          rowSet.setPassword(DB_PASS);
          rowSet.setCommand("SELECT * FROM hospital_master");
          rowSet.execute();
      }

      catch (Exception e){
    	  e.printStackTrace();
      }
   }
   public HospitalDetail create(HospitalDetail h) {
      try {
         rowSet.moveToInsertRow();
         rowSet.updateInt("hospital_id", h.getHospital_id());
         rowSet.updateInt("state_id", h.getState_id());
         rowSet.updateInt("district_id",h.getDistrict_id());
         rowSet.updateInt("block_id", h.getBlock_id());
         rowSet.updateInt("village_id",h.getVillage_id() );
         rowSet.updateInt("user_id",h.getUser_id());
         rowSet.updateInt("hospital_code",h.getHospital_code());
         rowSet.updateString("hospital_name",h.getHospital_name());
         rowSet.updateString("hospital_level",h.getHospital_level() );
         rowSet.updateString("officer_name",h.getOfficer_name());
         rowSet.updateString("officer_email",h.getOfficer_email());
         rowSet.updateInt("officer_uid",h.getOfficer_uid());
         rowSet.updateDate("addmission_date",h.getAddmission_date());
         rowSet.updateDate("discharge_date",h.getDischarge_date() );
         rowSet.updateString("hospital_address",h.getHospital_address());
         rowSet.updateInt("patient_max",h.getPatient_max() );
         rowSet.insertRow();
         rowSet.moveToCurrentRow();
      } catch (SQLException ex) {
         try {
            rowSet.rollback();
            h = null;
         } catch (SQLException e) {

         }
         ex.printStackTrace();
      }
      return h;
   }

   public HospitalDetail update(HospitalDetail h) {
      try {
    	  rowSet.updateInt("hospital_id", h.getHospital_id());
          rowSet.updateInt("state_id", h.getState_id());
          rowSet.updateInt("district_id",h.getDistrict_id());
          rowSet.updateInt("block_id", h.getBlock_id());
          rowSet.updateInt("village_id",h.getVillage_id() );
          rowSet.updateInt("user_id",h.getUser_id());
          rowSet.updateInt("hospital_code",h.getHospital_code());
          rowSet.updateString("hospital_name",h.getHospital_name());
          rowSet.updateString("hospital_level",h.getHospital_level() );
          rowSet.updateString("officer_name",h.getOfficer_name());
          rowSet.updateString("officer_email",h.getOfficer_email());
          rowSet.updateInt("officer_uid",h.getOfficer_uid());
          rowSet.updateDate("addmission_date",h.getAddmission_date());
          rowSet.updateDate("discharge_date",h.getDischarge_date() );
          rowSet.updateString("hospital_address",h.getHospital_address());
          rowSet.updateInt("patient_max",h.getPatient_max() );
          rowSet.updateRow();
          rowSet.moveToCurrentRow();
      } catch (SQLException ex) {
         try {
            rowSet.rollback();
         } catch (SQLException e) {

         }
         ex.printStackTrace();
      }
      return h;
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

   public HospitalDetail moveFirst() {
      HospitalDetail h = new HospitalDetail();
      try {
         rowSet.first();
         h.setHospital_id(rowSet.getInt("hospital_id"));
         h.setState_id(rowSet.getInt("state_id"));
         h.setDistrict_id(rowSet.getInt("district_id"));
         h.setBlock_id(rowSet.getInt("block_id"));
         h.setVillage_id(rowSet.getInt("village_id"));
         h.setUser_id(rowSet.getInt("user_id"));
         h.setHospital_code(rowSet.getInt("hospital_code"));
         h.setHospital_name(rowSet.getString("hospital_name"));
         h.setHospital_level(rowSet.getString("hospital_level"));
         h.setOfficer_name(rowSet.getString("officer_name"));
         h.setOfficer_email(rowSet.getString("officer_email"));
         h.setOfficer_uid(rowSet.getInt("officer_uid"));
         h.setAddmission_date(rowSet.getDate("addmission_date"));
         h.setDischarge_date(rowSet.getDate("addmission_date"));
         h.setHospital_address(rowSet.getString("hospital_address"));
         h.setPatient_max(rowSet.getInt("hospital_id"));

      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return h;
   }

   public HospitalDetail moveLast() {
	   HospitalDetail h = new HospitalDetail();
      try {
         rowSet.last();
         h.setHospital_id(rowSet.getInt("hospital_id"));
         h.setState_id(rowSet.getInt("state_id"));
         h.setDistrict_id(rowSet.getInt("district_id"));
         h.setBlock_id(rowSet.getInt("block_id"));
         h.setVillage_id(rowSet.getInt("village_id"));
         h.setUser_id(rowSet.getInt("user_id"));
         h.setHospital_code(rowSet.getInt("hospital_code"));
         h.setHospital_name(rowSet.getString("hospital_name"));
         h.setHospital_level(rowSet.getString("hospital_level"));
         h.setOfficer_name(rowSet.getString("officer_name"));
         h.setOfficer_email(rowSet.getString("officer_email"));
         h.setOfficer_uid(rowSet.getInt("officer_uid"));
         h.setAddmission_date(rowSet.getDate("addmission_date"));
         h.setDischarge_date(rowSet.getDate("addmission_date"));
         h.setHospital_address(rowSet.getString("hospital_address"));
         h.setPatient_max(rowSet.getInt("hospital_id"));
      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return h;
   }

   public HospitalDetail moveNext() {
	   HospitalDetail h = new HospitalDetail();
      try {
         if (rowSet.next() == false)
            rowSet.previous();
         h.setHospital_id(rowSet.getInt("hospital_id"));
         h.setState_id(rowSet.getInt("state_id"));
         h.setDistrict_id(rowSet.getInt("district_id"));
         h.setBlock_id(rowSet.getInt("block_id"));
         h.setVillage_id(rowSet.getInt("village_id"));
         h.setUser_id(rowSet.getInt("user_id"));
         h.setHospital_code(rowSet.getInt("hospital_code"));
         h.setHospital_name(rowSet.getString("hospital_name"));
         h.setHospital_level(rowSet.getString("hospital_level"));
         h.setOfficer_name(rowSet.getString("officer_name"));
         h.setOfficer_email(rowSet.getString("officer_email"));
         h.setOfficer_uid(rowSet.getInt("officer_uid"));
         h.setAddmission_date(rowSet.getDate("addmission_date"));
         h.setDischarge_date(rowSet.getDate("addmission_date"));
         h.setHospital_address(rowSet.getString("hospital_address"));
         h.setPatient_max(rowSet.getInt("hospital_id"));

      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return h;
   }

   public HospitalDetail movePrevious() {
	   HospitalDetail h = new HospitalDetail();
      try {
         if (rowSet.previous() == false)
            rowSet.next();
         h.setHospital_id(rowSet.getInt("hospital_id"));
         h.setState_id(rowSet.getInt("state_id"));
         h.setDistrict_id(rowSet.getInt("district_id"));
         h.setBlock_id(rowSet.getInt("block_id"));
         h.setVillage_id(rowSet.getInt("village_id"));
         h.setUser_id(rowSet.getInt("user_id"));
         h.setHospital_code(rowSet.getInt("hospital_code"));
         h.setHospital_name(rowSet.getString("hospital_name"));
         h.setHospital_level(rowSet.getString("hospital_level"));
         h.setOfficer_name(rowSet.getString("officer_name"));
         h.setOfficer_email(rowSet.getString("officer_email"));
         h.setOfficer_uid(rowSet.getInt("officer_uid"));
         h.setAddmission_date(rowSet.getDate("addmission_date"));
         h.setDischarge_date(rowSet.getDate("addmission_date"));
         h.setHospital_address(rowSet.getString("hospital_address"));
         h.setPatient_max(rowSet.getInt("hospital_id"));
      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return h;
   }

   public HospitalDetail getCurrent() {
	   HospitalDetail h = new HospitalDetail();
      try {
         rowSet.moveToCurrentRow();
         h.setHospital_id(rowSet.getInt("hospital_id"));
         h.setState_id(rowSet.getInt("state_id"));
         h.setDistrict_id(rowSet.getInt("district_id"));
         h.setBlock_id(rowSet.getInt("block_id"));
         h.setVillage_id(rowSet.getInt("village_id"));
         h.setUser_id(rowSet.getInt("user_id"));
         h.setHospital_code(rowSet.getInt("hospital_code"));
         h.setHospital_name(rowSet.getString("hospital_name"));
         h.setHospital_level(rowSet.getString("hospital_level"));
         h.setOfficer_name(rowSet.getString("officer_name"));
         h.setOfficer_email(rowSet.getString("officer_email"));
         h.setOfficer_uid(rowSet.getInt("officer_uid"));
         h.setAddmission_date(rowSet.getDate("addmission_date"));
         h.setDischarge_date(rowSet.getDate("addmission_date"));
         h.setHospital_address(rowSet.getString("hospital_address"));
         h.setPatient_max(rowSet.getInt("hospital_id"));
      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return h;
   }
   public static void loadPorperties(){
	   try{		  
	    Properties defaultProps = new Properties();
	    InputStream inputStream = HospitalBean.class.getResourceAsStream("config.properties");  
		defaultProps.load(inputStream);
		JDBC_DRIVER=defaultProps.getProperty("JDBC_DRIVER");
		DB_URL=defaultProps.getProperty("DB_URL");
		DB_USER=defaultProps.getProperty("DB_USER");
		DB_PASS=defaultProps.getProperty("DB_PASS");
		inputStream.close(); 
	   }catch(Exception e){ 
	   }
   }
}