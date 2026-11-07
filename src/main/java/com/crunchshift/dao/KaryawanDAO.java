package com.crunchshift.dao;

import com.crunchshift.model.Karyawan;
import java.util.List;


public interface KaryawanDAO {

    Karyawan authenticate(String email, String password);

    List<Karyawan> findAll();

    List<Karyawan> findByPeran(String peran);

    Karyawan findById(int idKaryawan);

    Karyawan findByEmail(String email);

    boolean insert(Karyawan karyawan);

    boolean update(Karyawan karyawan);

    boolean delete(int idKaryawan);

    boolean updateStatus(int idKaryawan, boolean statusAktif);

    int countAktif();

 
    List<Karyawan> search(String keyword);

    List<Karyawan> search(String keyword, String peran);
}
