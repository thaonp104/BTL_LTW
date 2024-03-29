package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbconnect.DBConnect;
import model.Cake_Order;
import model.Order_Client;

public class CakeOrderDAO {
//	private static final DBConnect DBConnector = null;
    public static List<Cake_Order> getByOrderID(int orderID) {
        Connection con=DBConnect.createConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("select * from cake_order where OrderID=?");
            ps.setInt(1, orderID);
            ResultSet rs=ps.executeQuery();
            List<Cake_Order> res = new ArrayList<Cake_Order>();
            while(rs.next()) {
                int OrderID = rs.getInt(2);
                int CakeID = rs.getInt(3);
                int quantity = rs.getInt(4);
                Cake_Order acc = new Cake_Order(OrderID, CakeID, quantity);
                res.add(acc);
            }
            ps.close();
            return res;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }
    public static void insert(int order_id, int cake_id, int quantity) {
		Connection con=DBConnect.createConnection();
		try {
			PreparedStatement ps=con.prepareStatement("insert into cake_order(OrderID, CakeID, Quantity) value(?,?,?)");
			ps.setInt(1, order_id);
			ps.setInt(2, cake_id);
			ps.setInt(3, quantity);
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
