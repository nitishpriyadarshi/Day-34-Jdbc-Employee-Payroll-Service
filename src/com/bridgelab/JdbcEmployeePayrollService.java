package com.bridgelab;
import java.sql.*;
public class JdbcEmployeePayrollService {
    public  static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee_payrolldata"; // table details
        String username = "root"; // MySQL credentials
        String password = "Nitish@1991";
        try {
            Class.forName(
                    "com.mysql.cj.jdbc.Driver"); // Driver name
            Connection con = DriverManager.getConnection(
                    url, username, password);
            System.out.println(
                    "Connection Established successfully");
            PreparedStatement st = con.prepareStatement("Select * from employee_details");
            boolean result = st.execute();
            if (result) {
                ResultSet rs = st.getResultSet();
                while (rs.next()) {
                    int id
                            = rs.getInt("EmployeeID"); // Retrieve name from db
                    System.out.println(id); // Print result on console
                    String name
                            = rs.getString("EmployeeName"); // Retrieve name from db
                    System.out.println(name); // Print result on console
                    String gender
                            = rs.getString("Gender"); // Retrieve name from db
                    System.out.println(gender); // Print result on console
                    String city
                            = rs.getString("City"); // Retrieve name from db
                    System.out.println(city); // Print result on console
                    String state
                            = rs.getString("Address"); // Retrieve name from db
                    System.out.println(state); // Print result on console
                    String PhoneNumber
                            = rs.getString("PhoneNumber"); // Retrieve name from db
                    System.out.println(PhoneNumber); // Print result on console
                    String country
                            = rs.getString("Country"); // Retrieve name from db
                    System.out.println(country); // Print result on console
                }
            }else{
                int rowcount=st.getMaxRows();
                System.out.println(rowcount);
            }
            con.close(); // close connection
            System.out.println("Connection Closed....");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}