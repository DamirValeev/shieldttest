package sqlLiteWork;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainSql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        try (Connection connentTo = DriverManager.getConnection("jdbc:sqlite:MusicStore.db")) {
            printDep(getAlldepartments(connentTo));
            insertDeparment(connentTo, new departments(3, "buhgaltera"));
            printDep(getAlldepartments(connentTo));
//            deleteDepartment(connentTo);
//            System.out.println("--------------Update---------------------");
//            printDep(getAlldepartments(connentTo));
            filterYourDepartment(connentTo);
        }
    }

    public static List<departments> getAlldepartments(Connection connectTo) throws SQLException {
        ArrayList<departments> departments = new ArrayList<>();
        try(Statement statement = connectTo.createStatement()) {
            ResultSet rs = statement.executeQuery("select id, name from departments");
            while (rs.next()) {
                int d = rs.getInt(1);
                String str = rs.getString(2);
                departments dep = new departments(d, str);
                departments.add(dep);
            }
        }
    return departments;
    }

    public static void printDep(List<departments> connectTo) throws SQLException {
        for (departments dp:connectTo) {
                System.out.println(dp);
        }
    }

    public static void insertDeparment(Connection connectTo, departments dp) throws SQLException {
        try(PreparedStatement preparedStatement = connectTo.prepareStatement("insert into departments(name)" +
                "values(?)")) {
            preparedStatement.setString(1,dp.getName());
            preparedStatement.executeUpdate();
        }
    }

    public static void deleteDepartment(Connection connectTo) throws SQLException {
//        int del;
        try(Statement statement = connectTo.createStatement()) {
            statement.executeUpdate("delete from departments where name='buhgaltera'");
        }
    }

    public static void filterYourDepartment(Connection connectTo) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("select you name for give");
        String cat = sc.nextLine();
        try(PreparedStatement preparedStatement = connectTo.prepareStatement("select id, name "
                + "from departments where name = ?")) {
            preparedStatement.setString(1,cat);
            ResultSet rs = preparedStatement.executeQuery();  // типо итератора построчно выводит данные с запроса
            while (rs.next()) {
                int id = rs.getInt(1);
                String str = rs.getString(2);
                System.out.println(id + " " + str);
            }
        }
    }


}
