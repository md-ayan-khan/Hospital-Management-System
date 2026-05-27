package modelsDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.doctors;

public class doctorDAO {


	    // ================= INSERT =================
	    public int insert(doctors d) {

	        int i = 0;

	        try {

	            Connection con = DBUtil.makeConnection();

	            PreparedStatement pst = con.prepareStatement(
	                "INSERT INTO doctors(doctor_name, specialization, phone, email, department_id) VALUES (?, ?, ?, ?, ?)"
	            );

	            pst.setString(1, d.getDoctor_name());
	            pst.setString(2, d.getSpecialization());
	             pst.setString(3, d.getPhone());
	            pst.setString(4, d.getEmail());
	            pst.setInt(5, d.getDepartment_id());

	            i = pst.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return i;
	    }

	    // ================= UPDATE =================
	    public int update(doctors d) {
	    	
	    	int i = 0;
	    	
	    	try {
	    		
	    		Connection con = DBUtil.makeConnection();
	    		
	    		PreparedStatement pst = con.prepareStatement(
	    				"UPDATE doctors SET doctor_name=?, specialization=?, phone=?, email=?, department_id=? WHERE doctor_id=?"
	    				);
	    		
	    		pst.setString(1, d.getDoctor_name());
	    		pst.setString(2, d.getSpecialization());
	    		pst.setString(3, d.getPhone());
	    		pst.setString(4, d.getEmail());
	    		pst.setInt(5, d.getDepartment_id());
	    		pst.setInt(6, d.getDoctor_id());
	    		
	    		i = pst.executeUpdate();
	    		
	    	} catch (SQLException e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return i;
	    }
	    // ================= DELETE =================
	    public int delete(int id) {
	    	
	    	int i = 0;
	    	
	    	try {
	    		
	    		Connection con = DBUtil.makeConnection();
	    		
	    		PreparedStatement pst = con.prepareStatement("DELETE FROM doctors WHERE doctor_id=?");
	    		
	    		pst.setInt(1, id);
	    		
	    		i = pst.executeUpdate();
	    		
	    	} catch (SQLException e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return i;
	    }
	    // ================= READ ALL =================
	    public List<doctors> read() {

	        List<doctors> list = new ArrayList<>();

	        try {

	            Connection con = DBUtil.makeConnection();

	            PreparedStatement pst = con.prepareStatement("SELECT * FROM doctors");

	            ResultSet rs = pst.executeQuery();

	            while (rs.next()) {

	                doctors d = new doctors();

	                d.setDoctor_id(rs.getInt("doctor_id"));
	                d.setDoctor_name(rs.getString("doctor_name"));
	                d.setSpecialization(rs.getString("specialization"));
	                d.setPhone(rs.getString("phone"));
	                d.setEmail(rs.getString("email"));
	                d.setDepartment_id(rs.getInt("department_id"));

	                list.add(d);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return list;
	    }
	    
	    
	  //doctor workload report
	    public void doctorworkloadreport() {
	    	try {
	    		Connection con = DBUtil.makeConnection();
				PreparedStatement pst = con.prepareStatement("SELECT d.doctor_id, d.doctor_name, d.specialization, " +
						"COUNT(a.appointment_id) AS total_appointments " +
						"FROM doctors d " +
						"LEFT JOIN appointments a " +
						"ON d.doctor_id = a.doctor_id " +
						"GROUP BY d.doctor_id, d.doctor_name, d.specialization");
				
				ResultSet rs = pst.executeQuery();
				System.out.println("====  Doctor Workload History  ====");
				System.out.println();
				while(rs.next()) {
					System.out.println("Doctor Id : " + rs.getInt("doctor_id") + " | Name : " + rs.getString("doctor_name") + " | Specialist : " + rs.getString("specialization") +" | Total Appointment : "+rs.getInt("total_appointments"));
				}
				System.out.println();
			} catch (SQLException e) {
			    e.printStackTrace();
			}
	    }


	}
	

