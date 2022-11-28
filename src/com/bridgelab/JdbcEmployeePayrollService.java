package com.bridgelab;
import java.sql.*;
public class JdbcEmployeePayrollService {
    public static void main(String[] args) {
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
            con.close(); // close connection
            System.out.println("Connection Closed....");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

