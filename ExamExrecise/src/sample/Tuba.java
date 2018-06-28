package sample;

import java.sql.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Tuba {
    double pikkus;
    double laius;
    double sisemine_pikkus;
    double sisemine_laius;
    double uks;

    // 1 konstruktor
    Tuba(){
        pikkus = 0;
        laius = 0;
        sisemine_pikkus = 0;
        sisemine_laius = 0;
        uks = 0;
    }

    // 2 konstruktor, mis v]imaldab omistada isendiv2ljadele v22rtusi
    Tuba(double heigth, double width, double inside_heigth, double inside_width, double door){
        pikkus = heigth;
        laius = width;
        sisemine_pikkus = inside_heigth;
        sisemine_laius = inside_width;
        uks = door;
    }

    // Loon andmebaasiga yhenduse
    static private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:/Users/sigridnarep/Documents/UniOfTechnology/JAVA/Lorents/Eksam2/ehitusInfo.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    // Sisendan kasutaja poolt sisestatud andmed andmebaasi tabelisse
    public void insert(double pikkus, double laius, double sisemine_pikkus, double sisemine_laius, double uks) {
        String sql = "INSERT INTO tuba(pikkus, laius, sisemine_pikkus, sisemine_laius, uks) VALUES(?,?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, pikkus);
            pstmt.setDouble(2, laius);
            pstmt.setDouble(3, sisemine_pikkus);
            pstmt.setDouble(4, sisemine_laius);
            pstmt.setDouble(5, uks);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Meetod $pikkuse k2ttesaamiseks andmebaasist
    static public double selectHeigth() {
        String sql = "SELECT pikkus FROM tuba";

        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            // loop through the result set
            double pikkus = rs.getDouble("pikkus");
            return pikkus;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0.0;
    }

    // Meetod $laiuse k2ttesaamiseks andmebaasist
    static public double selectWidth() {
        String sql = "SELECT laius FROM tuba";

        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            // loop through the result set
            double laius = rs.getDouble("laius");
            return laius;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0.0;
    }

    // Meetod $sisemise_pikkuse k2ttesaamiseks andmebaasist
    static public double selectInnerHeigth() {
        String sql = "SELECT sisemine_pikkus FROM tuba";

        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            // loop through the result set
            double sisemine_pikkus = rs.getDouble("sisemine_pikkus");
            return sisemine_pikkus;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0.0;
    }

    // Meetod $sisemise_laiuse k2ttesaamiseks andmebaasist
    static public double selectInnerWidth() {
        String sql = "SELECT sisemine_laius FROM tuba";

        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            // loop through the result set
            double sisemine_laius = rs.getDouble("sisemine_laius");
            return sisemine_laius;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0.0;
    }


    // Meetod $ukse suuruse k2ttesaamiseks andmebaasist
    static public double selectDoor() {
        String sql = "SELECT uks FROM tuba";

        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            // loop through the result set
            double uks = rs.getDouble("uks");
            return uks;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0.0;
    }


//    static public void selectAll(){
//        String sql = "SELECT ID, pikkus, laius FROM tuba";
//
//        try (Connection conn = connect();
//             Statement stmt  = conn.createStatement();
//             ResultSet rs    = stmt.executeQuery(sql)){
//            // loop through the result set
//            while (rs.next()) {
//                System.out.println(rs.getInt("ID") +  "\t" +
//                        rs.getString("pikkus") + "\t" +
//                        rs.getDouble("laius"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }


    // Meetod t2nase kuup2eva automaatseks printimiseks, kui ka toa numbri printimiseks
    public String anna_info() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
        System.out.println("Tänane kuupäev ja aeg on: " + dateFormat.format(date));
        System.out.println("Veranda puhul on tegu toaga number 10.");

        return getClass().getName() + " on pikkusega " + pikkus + "m ja laiusega " + laius;
    }
}
