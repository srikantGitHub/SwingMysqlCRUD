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
import com.srikant.javaproject.DAO.PaitentBean;
import com.srikant.javaproject.bean.PaitentDetail;

import net.miginfocom.swing.MigLayout;

public class PaitentUI extends JPanel {

	private static final long serialVersionUID = 1L;
   private JTextField patient_id = new JTextField(30);
   private JTextField patient_no = new JTextField(30);
   private JTextField patient_code = new JTextField(30);
   private JTextField patient_father_name = new JTextField(30);
   private JTextField patient_type = new JTextField(30);
   private JTextField patient_status = new JTextField(30);
   private JTextField patient_address = new JTextField(30);
   private JTextField patient_mobile = new JTextField(30);
   private JTextField patient_email = new JTextField(30);
   private JTextField patient_uid = new JTextField(30);
   private JTextField addmission_date = new JTextField(30);
   private JTextField discharge_date = new JTextField(30);
   private JTextField hospital_code = new JTextField(30);
   private JTextField doctor_remarks = new JTextField(30);
   
   
   private JButton createButton = new JButton("Save");
   private JButton updateButton = new JButton("Update");
   private JButton deleteButton = new JButton("Delete");
   private JButton firstButton = new JButton("First");
   private JButton prevButton = new JButton("Previous");
   private JButton nextButton = new JButton("Next");
   private JButton lastButton = new JButton("Last"); 
   
   //... updateButton, deleteButton, firstButton, prevButton, nextButton,
   //...lastButton
   private PaitentBean bean = new PaitentBean();

   public PaitentUI() {
      setBorder(new TitledBorder (new EtchedBorder(),"Patient Details"));
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
      panel.add(new JLabel("Patient Id:"), "align label");           panel.add(patient_id, "wrap");
      panel.add(new JLabel("Paitent No:"), "align label");           panel.add(patient_no, "wrap");
      panel.add(new JLabel("Paitent Code:"), "align label");         panel.add(patient_code, "wrap");
      panel.add(new JLabel("Patient Father Name:"), "align label");  panel.add(patient_father_name, "wrap");
      panel.add(new JLabel("Patient Type:"), "align label");         panel.add(patient_type, "wrap");
      panel.add(new JLabel("Patient Status:"), "align label");       panel.add(patient_status, "wrap");
      panel.add(new JLabel("Patient Address:"), "align label");      panel.add(patient_address, "wrap");
      panel.add(new JLabel("Patient Mobile:"), "align label");       panel.add(patient_mobile, "wrap");
      panel.add(new JLabel("Patient Email:"), "align label");        panel.add(patient_email, "wrap");
      panel.add(new JLabel("Patient UID:"), "align label");          panel.add(patient_uid, "wrap");
      panel.add(new JLabel("Addmission Date:"), "align label");      panel.add(addmission_date, "wrap");
      panel.add(new JLabel("Discharge Date:"), "align label");       panel.add(discharge_date, "wrap");
      panel.add(new JLabel("Hospital Code:"), "align label");        panel.add(hospital_code, "wrap");
      panel.add(new JLabel("Doctor Remarks:"), "align label");       panel.add(doctor_remarks, "wrap");
      return panel;
   }

   private PaitentDetail getFieldData() {
	   PaitentDetail p = new PaitentDetail();
	   try{    
      p.setPatient_id(Integer.parseInt(patient_id.getText()));
      p.setPatient_no(Integer.parseInt(patient_no.getText()));
      p.setPatient_code(patient_code.getText());
      p.setPatient_father_name(patient_father_name.getText());
      p.setPatient_type(patient_type.getText());
      p.setPatient_status(patient_status.getText());
      p.setPatient_address(patient_address.getText());
      p.setPatient_mobile(patient_mobile.getText());
      p.setPatient_email(patient_email.getText());
      p.setPatient_uid(patient_uid.getText());
      p.setAddmission_date(new java.sql.Date(new SimpleDateFormat("dd-MM-yyyy").parse(addmission_date.getText()).getTime()));
      p.setDischarge_date(new java.sql.Date(new SimpleDateFormat("dd-MM-yyyy").parse(discharge_date.getText()).getTime()));
      p.setHospital_code(hospital_code.getText());
      p.setDoctor_remarks(doctor_remarks.getText());
	   }catch(Exception e){
		   e.printStackTrace();
	   }
      return p;
   }

   private void setFieldData(PaitentDetail p) {
      patient_id.setText(String.valueOf(p.getPatient_id()));
      patient_no.setText(String.valueOf(p.getPatient_no()));
      patient_code.setText(String.valueOf(p.getPatient_code()));
      patient_father_name.setText(p.getPatient_father_name());
      patient_type.setText(p.getPatient_type());
      patient_status.setText(p.getPatient_status());
      patient_address.setText(p.getPatient_address());
      patient_mobile.setText(p.getPatient_mobile());
      patient_email.setText(p.getPatient_email());
      patient_uid.setText(String.valueOf(p.getPatient_uid()));
      addmission_date.setText((String.valueOf(p.getAddmission_date())));
      discharge_date.setText((String.valueOf(p.getDischarge_date())));
      hospital_code.setText(String.valueOf(p.getHospital_code()));
      doctor_remarks.setText(p.getDoctor_remarks());
   }

   private boolean isEmptyFieldData() {
      return (patient_id.getText().trim().isEmpty()
         && patient_no.getText().trim().isEmpty()
         && patient_father_name.getText().trim().isEmpty()
         && patient_type.getText().trim().isEmpty()
         && patient_status.getText().trim().isEmpty());
   }

   private class ButtonHandler implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
    	  PaitentDetail p = getFieldData();
         switch (e.getActionCommand()) {
         case "Save":
            if (isEmptyFieldData()) {JOptionPane.showMessageDialog(null,"Cannot create an empty record");
               return;
            }
            if (bean.create(p) != null)
               JOptionPane.showMessageDialog(null, "New person created successfully.");
               createButton.setText("New...");
               break;
         case "New...":
        	 try{
        	 p.setPatient_id(0);
             p.setPatient_no(0);
             p.setPatient_code("");
             p.setPatient_father_name("");
             p.setPatient_type("");
             p.setPatient_status("");
             p.setPatient_address("");
             p.setPatient_mobile("");
             p.setPatient_email("");
             p.setPatient_uid("");
             p.setAddmission_date(new java.sql.Date(new SimpleDateFormat("dd-MM-yyyy").parse("12-12-2017").getTime()));
             p.setDischarge_date(new java.sql.Date(new SimpleDateFormat("dd-MM-yyyy").parse("12-12-2017").getTime()));
             p.setHospital_code("");
             p.setDoctor_remarks("");
        	 }catch(Exception ex){
        		 ex.printStackTrace();
        	 }
            setFieldData(p);
            createButton.setText("Save");
            break;
         case "Update":
            if (isEmptyFieldData()) {
               JOptionPane.showMessageDialog(null,"Cannot update an empty record");
               return;
            }
            if (bean.update(p) != null)
               JOptionPane.showMessageDialog( null,"Person with ID:" + String.valueOf(p.getPatient_id()+ " is updated successfully"));
               break;
         case "Delete":
            if (isEmptyFieldData()) {
               JOptionPane.showMessageDialog(null,
               "Cannot delete an empty record");
               return;
            }
            p = bean.getCurrent();
            bean.delete();
            JOptionPane.showMessageDialog( null,"Person with ID:" + String.valueOf(p.getPatient_id()+ " is deleted successfully"));
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