package com.crunchshift.dao;

import com.crunchshift.model.CrunchPoints;
import java.util.List;


public interface CrunchPointsDAO {

    List<CrunchPoints> findAll();

    List<CrunchPoints> findByStaff(int idStaff);

    List<CrunchPoints> findByKaryawan(int idKaryawan);

    int getTotalPoinByStaff(int idStaff);

    int hitungTotalPoinNasional();

    boolean insertApresiasi(CrunchPoints poin);

    boolean insertEvaluasi(CrunchPoints poin);


    List<CrunchPoints> cariPoin(int idKaryawan);

    List<CrunchPoints> cariPoin(int idKaryawan, String jenisTransaksi);
}
