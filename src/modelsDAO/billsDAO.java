package modelsDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import entity.bills;

public class billsDAO {
	
	// ================= Create =================
	public int insert(bills st) {
		
		int i = 0;
		
		try {
			
			Connection con = DBUtil.makeConnection();
			
			PreparedStatement pst = con.prepareStatement(
					"INSERT INTO bills(bill_id, patient_id, appointment_id, total_amount, payment_status, bill_date) "
							+ "VALUES (?, ?, ?, ?, ?, ?)"
					);
			

			pst.setInt(1, st.getBill_id());
			pst.setInt(2, st.getPatient_id());
			pst.setInt(3, st.getAppointment_id());
			pst.setDouble(4, st.getTotal_amount());
			pst.setString(5, st.getPayment_status());
			pst.setDate(6, (Date) st.getBill_date());
			
			i = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return i;
		
	}
	 // ================= READ (ALL) =================
    public List<bills> read() {

        List<bills> list = new LinkedList<>();

        try {

            Connection con = DBUtil.makeConnection();

            PreparedStatement pst = con.prepareStatement("SELECT * FROM bills");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                list.add(new bills(

                	  rs.getInt("bill_id"),
                	  rs.getInt("patient_id"),
                	  rs.getInt("appointment_id"),
                	  rs.getFloat("total_amount"),
                	  rs.getString("payment_status"),
                	  rs.getDate("bill_date")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
        
    }
	    
	    // ================= UPDATE =================
	    public int update(bills a) {

	        int i = 0;

	        try {

	            Connection con = DBUtil.makeConnection();

	            PreparedStatement pst = con.prepareStatement(
	                "UPDATE bills SET patient_id=?, appointment_id=?, total_amount=?, payment_status=?, bill_date=? "
	              + "WHERE bill_id=?"
	            );

	            pst.setInt(1, a.getPatient_id());
	            pst.setInt(2, a.getAppointment_id());
	            pst.setDouble(3, a.getTotal_amount());
	            pst.setString(4, a.getPayment_status());
	            pst.setDate(5, (Date) a.getBill_date());
	         
	            pst.setInt(6, a.getBill_id());

	            i = pst.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return i;
	    }
	    
	    
	    //============== DELETE ==================
	    public int delete(int id) {
	    	
	    	int i = 0;
	    	
	    	try {
				
	    	Connection con = DBUtil.makeConnection();
	    	
	    	PreparedStatement pst = con.prepareStatement("delete from bills where bill_id=?");
	    	pst.setInt(1, id);
	    	
	    	i = pst.executeUpdate();
	    			
	    	} catch (SQLException e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return i;
	    }


}
