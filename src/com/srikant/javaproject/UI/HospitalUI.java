package com.srikant.javaproject.UI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import com.srikant.javaproject.DAO.HospitalBean;
import com.srikant.javaproject.bean.HospitalDetail;
import net.miginfocom.swing.MigLayout;

public class HospitalUI extends JPanel {

	private static final long serialVersionUID = 1L;
   private JTextField hospital_id = new JTextField(30);
   private JTextField state_id = new JTextField(30);
   private JTextField district_id = new JTextField(30);
   private JTextField block_id = new JTextField(30);
   private JTextField village_id = new JTextField(30);
   private JTextField user_id = new JTextField(30);
   private JTextField hospital_code = new JTextField(30);
   private JTextField hospital_name = new JTextField(30);
   private JTextField hospital_level = new JTextField(30);
   private JTextField officer_name = new JTextField(30);
   private JTextField officer_email = new JTextField(30);
   private JTextField officer_uid = new JTextField(30);
   private JTextField addmission_date = new JTextField(30);
   private JTextField discharge_date = new JTextField(30);
   private JTextField hospital_address = new JTextField(30);
   private JTextField patient_max = new JTextField(30);
  
   private JButton createButton = new JButton("Save");
   private JButton updateButton = new JButton("Update");
   private JButton deleteButton = new JButton("Delete");
   private JButton firstButton = new JButton("First");
   private JButton prevButton = new JButton("Previous");
   private JButton nextButton = new JButton("Next");
   private JButton lastButton = new JButton("Last"); 
   
   //... updateButton, deleteButton, firstButton, prevButton, nextButton,
   //...lastButton
   private HospitalBean bean = new HospitalBean();

   public HospitalUI() {
      setBorder(new TitledBorder (new EtchedBorder(),"Hospital Detail"));
      setLayout(new BorderLayout(5, 5));
      add(initFields(), BorderLayout.NORTH);
      add(initButtons(), BorderLayout.CENTER);
      setFieldData(bean.moveFirst());
   }

   private JPanel initButtons() {
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));
      panel.add(createButton);
      createButton.addActionListener(new ButtonHandler());
      panel.add(updateButton);
      updateButton.addActionListener(new ButtonHandler());
      panel.add(deleteButton);
      deleteButton.addActionListener(new ButtonHandler());
      panel.add(firstButton);
      firstButton.addActionListener(new ButtonHandler());
      panel.add(prevButton);
      prevButton.addActionListener(new ButtonHandler());
      panel.add(nextButton);
      nextButton.addActionListener(new ButtonHandler());
      panel.add(lastButton);
      lastButton.addActionListener(new ButtonHandler());
      return panel;
   }

   private JPanel initFields() {
      JPanel panel = new JPanel();
      panel.setLayout(new MigLayout());
      panel.add(new JLabel("Hospital Id:"), "align label");                   panel.add(hospital_id, "wrap");
      panel.add(new JLabel("State Id:"), "align label");                      panel.add(state_id, "wrap");
      panel.add(new JLabel("District Id:"), "align label");                   panel.add(district_id, "wrap");
      panel.add(new JLabel("Block :"), "align label");                        panel.add(block_id, "wrap");
      panel.add(new JLabel("Village Id:"), "align label");                    panel.add(village_id, "wrap");
      panel.add(new JLabel("User Id:"), "align label");                       panel.add(user_id, "wrap");
      panel.add(new JLabel("Hospital Code:"), "align label");                 panel.add(hospital_code, "wrap");
      panel.add(new JLabel("Hospital Name"), "align label");                  panel.add(hospital_name, "wrap");
      panel.add(new JLabel("Hospital Lavel"), "align label");                 panel.add(hospital_level, "wrap");
      panel.add(new JLabel("Officer Name"), "align label");                   panel.add(officer_name, "wrap");
      panel.add(new JLabel("Officer Email:"), "align label");                 panel.add(officer_email, "wrap");
      panel.add(new JLabel("Officer UID"), "align label");                    panel.add(officer_uid, "wrap");
      panel.add(new JLabel("Addimission Date"), "align label");               panel.add(addmission_date, "wrap");
      panel.add(new JLabel("Discharge Date"), "align label");                 panel.add(discharge_date, "wrap");
      panel.add(new JLabel("Hospital Address"), "align label");               panel.add(hospital_address, "wrap");
      panel.add(new JLabel("Patient Max"), "align label");                    panel.add(patient_max, "wrap");
      return panel;
   }

   private HospitalDetail getFieldData() {
      HospitalDetail h = new HospitalDetail();
      try{
     h.setHospital_id(Integer.parseInt(hospital_id.getText()));
     h.setState_id(Integer.parseInt(state_id.getText()));
     h.setDistrict_id(Integer.parseInt(district_id.getText()));
     h.setBlock_id(Integer.parseInt(block_id.getText()));
     h.setVillage_id(Integer.parseInt(village_id.getText()));
     h.setUser_id(Integer.parseInt(user_id.getText()));
     h.setHospital_code(Integer.parseInt(hospital_code.getText()));
     h.setHospital_name(hospital_name.getText());
     h.setHospital_level(hospital_level.getText());
     h.setOfficer_name(officer_name.getText());
     h.setOfficer_email(officer_email.getText());
     h.setOfficer_uid(Integer.parseInt(officer_uid.getText()));
     h.setAddmission_date(new java.sql.Date(new SimpleDateFormat("dd-MM-yyyy").parse(addmission_date.getText()).getTime()));
     h.setDischarge_date(new java.sql.Date(new SimpleDateFormat("dd-MM-yyyy").parse(discharge_date.getText()).getTime()));
     h.setHospital_address(hospital_address.getText());
     h.setPatient_max(Integer.parseInt(patient_max.getText()));
	   }catch(Exception e){
		   e.printStackTrace();
	   }
      return h;
   }

   private void setFieldData(HospitalDetail h) {
     hospital_id.setText(String.valueOf(h.getHospital_id()));
     state_id.setText(String.valueOf(h.getState_id()));
     district_id.setText(String.valueOf(h.getDistrict_id()));
     block_id.setText(String.valueOf(h.getBlock_id()));
     village_id.setText(String.valueOf(h.getVillage_id()));
     user_id.setText(String.valueOf(h.getVillage_id()));
     hospital_code.setText(String.valueOf(h.getHospital_code()));
     hospital_name.setText(h.getHospital_name());
     hospital_level.setText(h.getHospital_level());
     officer_name.setText(h.getOfficer_name());
     officer_email.setText(h.getOfficer_email());
     officer_uid.setText(String.valueOf(h.getOfficer_uid()));
     addmission_date.setText((String.valueOf(h.getAddmission_date())));
     discharge_date.setText((String.valueOf(h.getDischarge_date())));
     hospital_address.setText(h.getHospital_address());
     patient_max.setText(String.valueOf(h.getPatient_max()));
   }

   private boolean isEmptyFieldData() {
      return (hospital_id.getText().trim().isEmpty()
         && state_id.getText().trim().isEmpty()
         && district_id.getText().trim().isEmpty()
         && block_id.getText().trim().isEmpty()
         && village_id.getText().trim().isEmpty());
   }

   private class ButtonHandler implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  HospitalDetail h = getFieldData();
         switch (e.getActionCommand()) {
         case "Save":
            if (isEmptyFieldData()) {JOptionPane.showMessageDialog(null,"Cannot create an empty record");
               return;
            }
            if (bean.create(h) != null)
               JOptionPane.showMessageDialog(null, "New person created successfully.");
               createButton.setText("New...");
               break;
         case "New...":
        	 try{
        	 h.setHospital_id(0);
             h.setState_id(0);
             h.setDistrict_id(0);
             h.setBlock_id(0);
             h.setVillage_id(0);
             h.setUser_id(0);
             h.setHospital_code(0);
             h.setHospital_name("");
             h.setHospital_level("");
             h.setOfficer_name("");
             h.setOfficer_email("");
             h.setOfficer_uid(0);
             h.setAddmission_date(new java.sql.Date(new SimpleDateFormat("dd-MM-yyyy").parse("25-12-2012").getTime()));
             h.setDischarge_date(new java.sql.Date(new SimpleDateFormat("dd-MM-yyyy").parse("25-12-2012").getTime()));
             h.setHospital_address("");
             h.setPatient_max(0);
        	 }catch(Exception ee){
        		 ee.printStackTrace();
        	 }
            setFieldData(h);
            createButton.setText("Save");
            break;
         case "Update":
            if (isEmptyFieldData()) {
               JOptionPane.showMessageDialog(null,"Cannot update an empty record");
               return;
            }
            if (bean.update(h) != null)
               JOptionPane.showMessageDialog( null,"Person with ID:" + String.valueOf(h.getHospital_id()+ " is updated successfully"));
               break;
         case "Delete":
            if (isEmptyFieldData()) {
               JOptionPane.showMessageDialog(null,
               "Cannot delete an empty record");
               return;
            }
            h = bean.getCurrent();
            bean.delete();
            JOptionPane.showMessageDialog( null,"Person with ID:" + String.valueOf(h.getHospital_id()+ " is deleted successfully"));
               break;
         case "First":
            setFieldData(bean.moveFirst()); break;
         case "Previous":
            setFieldData(bean.movePrevious()); break;
         case "Next":
            setFieldData(bean.moveNext()); break;
         case "Last":
            setFieldData(bean.moveLast()); break;
         default:
            JOptionPane.showMessageDialog(null, "invalid command");
         }
      }
   }
}