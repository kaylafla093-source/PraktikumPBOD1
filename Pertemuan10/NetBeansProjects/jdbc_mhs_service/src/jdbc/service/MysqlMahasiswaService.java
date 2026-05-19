/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author Kayla Febrina Laura Ayu 24060124120004 
 */

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
public class MysqlMahasiswaService {

    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {

        koneksi = MysqlUtility.getKoneksi();
    }

    /* Membuat objek mahasiswa */
    public Mahasiswa makeMhsObject(ResultSet rs) {

        Mahasiswa mhs = null;

        try {

            mhs = new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
            );

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return mhs;
    }

    /* Menambahkan data mahasiswa */
    public void add(Mahasiswa mhs) {

        String query =
                "INSERT INTO mahasiswa(id, nama) VALUES (?, ?)";

        try {

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());

            ps.executeUpdate();

            System.out.println("Berhasil insert");

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    /* Update data mahasiswa */
    public void update(Mahasiswa mhs) {

        String query =
                "UPDATE mahasiswa SET nama=? WHERE id=?";

        try {

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());

            ps.executeUpdate();

            System.out.println("Berhasil update");

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    /* Delete data mahasiswa sesuai id */
    public void delete(int id) {

        String query =
                "DELETE FROM mahasiswa WHERE id=?";

        try {

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Berhasil delete");

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    /* Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {

        Mahasiswa mhs = null;

        String query =
                "SELECT * FROM mahasiswa WHERE id=?";

        try {

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs =
                    ps.executeQuery();

            if (rs.next()) {

                mhs = makeMhsObject(rs);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return mhs;
    }

    /* Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {

        List<Mahasiswa> listMhs =
                new ArrayList<>();

        String query =
                "SELECT * FROM mahasiswa";

        try {

            Statement st =
                    koneksi.createStatement();

            ResultSet rs =
                    st.executeQuery(query);

            while (rs.next()) {

                listMhs.add(
                        makeMhsObject(rs)
                );
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return listMhs;
    }
}