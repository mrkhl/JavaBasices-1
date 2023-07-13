package om.gov.omantax;

import om.gov.omantax.entity.Department;

import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Department> departments = new ArrayList<>();
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            PreparedStatement ps = conn.prepareStatement("select DEPARTMENT_ID,DEPARTMENT_NAME,MANAGER_ID,LOCATION_ID from DEPARTMENTS");
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int departmentId = resultSet.getInt(1);
                String departmentName = resultSet.getNString(2);
                int managerId = resultSet.getInt(3);
                int locationId = resultSet.getInt(4);

                Department department = new Department();
                department.setId(departmentId);
                department.setName(departmentName);
                department.setMangerId(managerId);
                department.setLocationId(locationId);

                departments.add(department);
            }
                for (int i=0; i<departments.size(); i++){
                    System.out.println(departments.get(i));
                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}